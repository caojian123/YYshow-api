package com.yyw.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyw.test.domain.Module;
import com.yyw.test.mapper.PageMapper;

@Service
public class ModuleService {
	@Autowired
	private PageMapper pageMapper;
	
	public Integer insertModules(Module module) throws Exception{
		return pageMapper.insertModules(module);
	}
}
