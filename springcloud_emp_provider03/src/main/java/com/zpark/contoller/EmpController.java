package com.zpark.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Emp;
import com.zpark.service.EmpService;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
//	  http://localhost:8082/emp/addEmp
	@Autowired
	private EmpService empService;

	@RequestMapping("/addEmp")
	public Integer addEmp(Emp emp) {
		return this.empService.insert(emp);
	}

	@RequestMapping("/findAll")
	public List<Emp> findAll(String fname, Integer deptId, Integer pageNumber) {
		Emp emp = new Emp();

		if (fname != null) {
			emp.setEmpName("%" + fname + "%");
		}else {
			emp.setEmpName("%%");
		}
		if (deptId != null) {
			emp.setDeptno(deptId);
		}else {
			emp.setDeptno(-1);
		}
		System.out.println("调用服务 8088端口");
		return this.empService.findEmpAndDept(emp, pageNumber);
	}

	@RequestMapping("/deleteById")
	public Integer deleteById(Integer empId) {
		return this.empService.deleteByPrimaryKey(empId);
	}
}
