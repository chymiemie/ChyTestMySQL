package com.chy.yihe.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentinfo {
    private Integer id;

    private String name;

    private Integer courseId;

    private List<Courseinfo> courseinfos;
}