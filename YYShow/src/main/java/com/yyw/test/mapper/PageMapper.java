package com.yyw.test.mapper;

import com.yyw.test.domain.Module;
import com.yyw.test.domain.ModuleStyle;
import com.yyw.test.domain.Page;

public interface PageMapper {
	public Integer insertPages(Page pages) throws Exception;
	public Integer insertModules(Module modules) throws Exception;
	public Integer insertModuleStyle(ModuleStyle moduleStyle) throws Exception;
}
