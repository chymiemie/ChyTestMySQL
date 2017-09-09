package com.chy.yihe.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.chy.yihe.dao", sqlSessionFactoryRef = "SqlSessionFactory")
public class DataSourceConfig {

	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	public DataSource dataSource() {
		return new DruidDataSource();
	}

	@Bean(name = "SqlSessionFactory")
	@Primary
	public SqlSessionFactory primarySqlSessionFactoryBean(@Qualifier("dataSource") DataSource datasource)
			throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(datasource);
		//XML配置方式需要以下两行代码，用于读取XML文件，便于dao文件调用
		//XML配置方式或则直接将XML文件和dao文件放在一个包中，dao文件便于解析XML文件
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:com/chy/yihe/mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

	@Bean
	@Primary
	public PlatformTransactionManager centerTransactionManager(@Qualifier("dataSource") DataSource datasource) {
		return new DataSourceTransactionManager(datasource);
	}

}