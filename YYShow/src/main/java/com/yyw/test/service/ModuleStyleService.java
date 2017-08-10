package com.yyw.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyw.test.domain.ModuleStyle;
import com.yyw.test.mapper.PageMapper;

@Service
public class ModuleStyleService {
	@Autowired
	private PageMapper pageMapper;
	
	public Integer insertModuleStyle(ModuleStyle module) throws Exception{
		return pageMapper.insertModuleStyle(module);
	}
}
