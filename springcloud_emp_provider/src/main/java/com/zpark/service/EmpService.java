package com.zpark.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Emp;

public interface EmpService {
	
	int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp record);
	
    List<Emp> findEmpAndDept(Emp emp, Integer pageNumber);
	

}
