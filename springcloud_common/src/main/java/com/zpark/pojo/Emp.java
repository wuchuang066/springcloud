package com.zpark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {  
    private Integer empId;

    private String empName;

    private String empJob;

    private Double empSalary;

    private Integer deptno;
    
    private Dept dept;
    
}