package com.yyw.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyw.test.domain.Page;
import com.yyw.test.mapper.PageMapper;

@Service
public class PageService {
	@Autowired
    PageMapper pageMapper;
	
	public Integer insertPages(Page page) throws Exception{
		return pageMapper.insertPages(page);
	}
}
