package com.chy.yihe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courseinfo {
    private Integer id;

    private String coursename;
    
    private Studentinfo studentinfo;

    
}