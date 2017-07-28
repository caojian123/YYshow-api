package com.yyw.test.domain;

import java.util.List;

public class Module {
	private String moduleId;
	private String type;
	private String className;
	private String customClass;
	private String customStyle;
	private String text;
	private String url;
	private String link;
    private ModuleStyle style;
   

	public ModuleStyle getStyle() {
		return style;
	}

	public void setStyle(ModuleStyle style) {
		this.style = style;
	}

	public String getType() {
		return type;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCustomClass() {
		return customClass;
	}

	public void setCustomClass(String customClass) {
		this.customClass = customClass;
	}

	public String getCustomStyle() {
		return customStyle;
	}

	public void setCustomStyle(String customStyle) {
		this.customStyle = customStyle;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}


}
