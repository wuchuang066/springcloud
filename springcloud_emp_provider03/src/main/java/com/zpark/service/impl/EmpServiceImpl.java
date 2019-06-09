package com.zpark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.EmpMapper;
import com.zpark.pojo.Emp;
import com.zpark.service.EmpService;
import com.zpark.util.PageUtil;

@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer empId) {
		// TODO Auto-generated method stub
		return empMapper.deleteByPrimaryKey(empId);
	}

	@Override
	@Transactional
	public int insert(Emp record) {
//		// TODO Auto-generated method stub
//		for (int i = 0 ; i <100000; i++) {
//			record.setEmpId(i);
//			record.setEmpJob(i+"job");
//			record.setEmpName(i+"name");
//			record.setEmpSalary(1.00);
//			empMapper.insert(record);
//		}
		return empMapper.insert(record);
	}

	@Override
	public Emp selectByPrimaryKey(Integer empId) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(empId);
	}

	@Override
	public List<Emp> selectAll() {
		// TODO Auto-generated method stub
		return empMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(Emp record) {
		// TODO Auto-generated method stub
		return empMapper.updateByPrimaryKey(record);
	}
	
	/*mybatis 分页 插件+ 条件查询*/
	
	public List<Emp> findEmpAndDept(Emp emp,Integer pageNumber){
		System.out.println(pageNumber);
		PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
		List<Emp> list = this.empMapper.findEmpAndDept(emp);
		System.out.println("empservice....list:"+list);
		return list;
	}
	
}
