package com.yyw.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyw.test.domain.Module;
import com.yyw.test.domain.Page;
import com.yyw.test.service.ModuleService;
import com.yyw.test.service.PageService;

@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	private PageService pageService;
	@Autowired
	private ModuleService moduleService;
	
	@RequestMapping("/")
	public void init() {
		System.out.println("init...");
	}
	@CrossOrigin(origins = "*", maxAge = 3600, methods = { RequestMethod.POST })
	@RequestMapping(value={"/save"},method=RequestMethod.POST)
	public void save(@RequestBody List<Page> pages) throws Exception{
		for(Page page : pages){
			pageService.insertPages(page);
			//page.getModules()ÊÇ¸ölist
			for(Module module:page.getModules()){
				moduleService.insertModules(module);
			}
		}
	}
	
}
