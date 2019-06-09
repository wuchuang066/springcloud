package zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zpark.util.UrlUtil;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpConsumerController {

    //	  http://localhost:8084/emp/findAll?pageNumber=0
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/addEmp")
    public Integer addEmp(Emp emp) {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("empName", emp.getEmpName());
        map.add("empJob", emp.getEmpJob());
        map.add("empSalary", emp.getEmpSalary());
        map.add("detpno", emp.getDeptno());
        return this.restTemplate.postForObject(UrlUtil.URL_PREFIX + "/addEmp", map, Integer.class);
    }

    @RequestMapping("/findAll")
    public PageInfo<Emp> findAll(String fname, Integer deptId, Integer pageNumber) {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("fname", fname);
        map.add("deptId", deptId);
        map.add("pageNumber", pageNumber);

        List<Emp> list = this.restTemplate.postForObject(UrlUtil.URL_PREFIX + "/findAll", map, List.class);
        return new PageInfo<>(list);
    }
    @RequestMapping("/deleteById")
    public Integer deleteById(Integer empId){
        System.out.println("Emp 消费者id为:"+empId);
        return this.restTemplate.postForObject(UrlUtil.URL_PREFIX + "/deleteById?empId={66}", empId, Integer.class,empId);

    }

}
