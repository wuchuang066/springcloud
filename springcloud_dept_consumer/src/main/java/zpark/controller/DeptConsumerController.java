package zpark.controller;

import com.zpark.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import zpark.util.UrlUtil;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	@SuppressWarnings("unchecked")
	@RequestMapping("/selectAll")
	public List<Dept> selectAll(){
		//    http://localhost:8083/dept/selectAll
		List<Dept> list = this.restTemplate.getForObject(UrlUtil.URL_PREFIX+"/findAll",List.class);
		System.out.println("deptList:"+list);
		return list;
	}

}
