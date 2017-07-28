package com.yyw.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yyw.test.domain.Page;

@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping(value={"/save"},method=RequestMethod.POST)
	public void save(@RequestBody List<Page> pages){
		System.out.println(pages.toString());
	}
}
