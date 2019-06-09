package com.zpark.mapper;

import com.zpark.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // 实现数据访问  防止自动注入报错
public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(Dept record);

    Dept selectByPrimaryKey(Integer deptId);

    List<Dept> selectAll();

    int updateByPrimaryKey(Dept record);
}