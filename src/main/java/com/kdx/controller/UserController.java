package com.kdx.controller;

import java.io.File;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.kdx.pojo.Detailed;
import com.kdx.pojo.Kdx;
import com.kdx.service.UserService;
import com.kdx.util.ExcelDetailed;
import com.kdx.util.ExcelTool;


@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	@Autowired
	private HttpServletRequest request;

	
	@RequestMapping(value="filesUpload" , method = RequestMethod.POST)
	public @ResponseBody Object filesUpload(@RequestParam("files") MultipartFile[] files) {
		//判断file数组不能为空并且长度大于0
		if(files!=null&&files.length>0){
			//循环获取file数组中得文件
			for(int i = 0;i<files.length;i++){
				MultipartFile file = files[i];
				//保存文件
				saveFile(file);
			}
		}
		return 1;
	}

	/***
	 * 保存文件
	 * @param file
	 * @return
	 */
	private boolean saveFile(MultipartFile file) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
						+ file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	@RequestMapping("fileUpload")
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
						+ file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
				File f1 = new File(filePath.replace('\\', '/'));	
				String jsonstr=ExcelTool.readExcel(f1).toString();
				//System.out.println(jsonstr);
		        List<Kdx> kdxlist=JSON.parseArray(jsonstr,Kdx.class);
		        userService.insertSelective(kdxlist);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 重定向
		return "redirect:/index.jsp";
	}

	@RequestMapping("fileUploadDetailed")
	public String fileUploadDetailed(@RequestParam("file") MultipartFile file) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				// 文件保存路径
				String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
						+ file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
				File f1 = new File(filePath.replace('\\', '/'));	
				String jsonstr=ExcelDetailed.readExcel(f1).toString();
				//System.out.println(jsonstr);
		        List<Detailed> detailed=JSON.parseArray(jsonstr,Detailed.class);
		        userService.insertDetailed(detailed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 重定向
		return "redirect:/index.jsp";
	}
}