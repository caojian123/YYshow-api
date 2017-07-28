package com.yyw.test.controller;

import java.io.File;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yyw.test.domain.Image;

@Controller
@RequestMapping("/image")
public class UploadController {
	private static final Log logger = LogFactory.getLog(UploadController.class);

	@RequestMapping("/")
	public void init() {
		System.out.println("init...");
	}

	// 文件上传相关代码
	// 跨域设置
	@CrossOrigin(origins = "*", maxAge = 3600, methods = { RequestMethod.POST })
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody Object upload(HttpServletRequest request, @RequestParam("imgFile") MultipartFile file) {
		if (file.isEmpty()) {
			return "文件为空";
		}
		String suffixList = "jpg,gif,png";
		Image image = new Image();
		Boolean flag = false;

		String path = request.getSession().getServletContext().getRealPath("upload/list");
		image.setPath("upload/list");
		String fileName = file.getOriginalFilename();

		// 获取文件后缀
		String suffix = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		if (suffixList.contains(suffix.trim().toLowerCase())) {
			flag = true;
		} else {
			logger.info("文件格式不正确");
		}
		if (flag && file.getSize() > 552000) {
			logger.info("文件上传过大");
			flag = false;
		}
		String base = "abcdefghijklmnopqrstuvwxyz0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < 5; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
		// 新文件名
		String newFileName = sb.toString()+String.valueOf(System.currentTimeMillis()) + "." + suffix;
		image.setName(newFileName);

		if (flag) {
			File targetFile = new File(path, newFileName);
			if (!targetFile.exists()) {
				targetFile.mkdirs();
			}
			// 保存
			try {
				file.transferTo(targetFile);
			} catch (Exception e) {
				e.printStackTrace();
				logger.info(e);
				flag = false;
			}
		}
		image.setSuccess(flag);
		return image;
	}
}
