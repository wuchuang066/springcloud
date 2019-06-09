package com.zpark.service;

import com.zpark.pojo.Dept;

import java.util.List;

public interface DeptService {
	
	  List<Dept> selectAll();
	  
	  Dept selectByPrimaryKey(Integer deptId);

}
