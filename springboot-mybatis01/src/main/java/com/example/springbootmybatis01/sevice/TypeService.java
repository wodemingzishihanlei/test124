package com.example.springbootmybatis01.sevice;

import com.example.springbootmybatis01.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired
    private TypeMapper typeMapper;
    public List findAll(){
        return typeMapper.findAll();
    }
}
