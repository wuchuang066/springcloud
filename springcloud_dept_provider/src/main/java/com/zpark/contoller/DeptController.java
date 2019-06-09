package com.zpark.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpark.pojo.Dept;
import com.zpark.service.DeptService;

@RestController
@RequestMapping("dept")   //  localhost:8082/dept/findAllDept
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/findAll")
	public List<Dept> findAllDept(){
		System.out.println("deptList 8082:"+this.deptService.selectAll());
		System.out.println("2312");
		return this.deptService.selectAll();
	}

}
