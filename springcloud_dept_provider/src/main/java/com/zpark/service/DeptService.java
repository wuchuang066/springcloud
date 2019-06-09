package com.zpark.service;

import java.util.List;

import com.zpark.pojo.Dept;

public interface DeptService {
	
	  List<Dept> selectAll();
	  
	  Dept selectByPrimaryKey(Integer deptId);

}
