package com.zpark.service.impl;

import java.util.List;

import com.zpark.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.pojo.Dept;
import com.zpark.service.DeptService;
@Service("deptService")
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		return deptMapper.selectAll();
	}

	@Override
	public Dept selectByPrimaryKey(Integer deptId) {
		// TODO Auto-generated method stub
		return deptMapper.selectByPrimaryKey(deptId);
	}

}
