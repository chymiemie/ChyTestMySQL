package com.chy.yihe.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAndTelNum {
	private Integer id;

	private String name;

	private String pass;

	private Integer telnumber;

	private Integer userid;

}
