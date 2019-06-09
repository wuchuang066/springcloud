package com.zpark.mapper;

import com.zpark.pojo.Emp;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    List<Emp> selectAll();

    int updateByPrimaryKey(Emp record);
    
    List<Emp> findEmpAndDept(Emp emp);
    
}