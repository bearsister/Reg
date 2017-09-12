package org.lanqiao.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.lanqiao.entity.User;
import org.lanqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("registe")
	public String register(){
		return "register";
	}
	
	@RequestMapping("Userregister")
	public String Userregister(){
		return "login";
	}
	
	@RequestMapping("login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("index")
	public String index(){
		return "index";
		
	}
	
	@RequestMapping("registUser")
	public String registUser(User user,Model model){
		User rer =userService.insertUser(user);
		model.addAttribute("user",rer);
		return "login";
	}
	

	@RequestMapping("checkUser")
	public String check(User user, Model model, HttpSession session){
		User reUser =userService.checkUser(user);
		if(reUser !=null){
			session.setAttribute("userBean",user);
			return "redirect:index";
		}else{
			model.addAttribute("error","用户名密码错误！");
			return"login";
		}
	}
	
	@ResponseBody
	@RequestMapping("cA")
	public Object cA(String birthday) throws Exception {
		SimpleDateFormat j=new SimpleDateFormat("yyyy-MM-dd");
		Date bir = null;
		try {
			bir=j.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long t=new Date().getTime()-bir.getTime();
		return  (t/(1000*3600*24))/365;
	}
	
}