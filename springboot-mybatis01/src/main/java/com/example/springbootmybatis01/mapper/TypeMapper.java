package com.example.springbootmybatis01.mapper;

import com.example.springbootmybatis01.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper //容器自动创建该接口的实现子类
public interface TypeMapper {
    List<Type> findAll();
}
