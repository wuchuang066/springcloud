package com.zpark.service.impl;

import com.zpark.mapper.DeptMapper;
import com.zpark.pojo.Dept;
import com.zpark.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
