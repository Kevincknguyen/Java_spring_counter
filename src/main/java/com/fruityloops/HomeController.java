package com.fruityloops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
	 @RequestMapping("/")
	 public String home(HttpSession session, Model model){
		 
	
	if (session.getAttribute("count")==null){
		
		session.setAttribute("count", 0);
		 
	}
	else {
		
		session.setAttribute("count", (Integer) session.getAttribute("count")+1);
	}
	Integer currentCount=(Integer) session.getAttribute("count");
	 model.addAttribute("counter",currentCount);
	 
	 
	 
	 
		return "Home.jsp";
	 }
	 
	 
	 
	 
	 
	 
	 @RequestMapping("/counter")
	 public String counter(Model model,HttpSession session){

			if (session.getAttribute("count")==null){
				
				session.setAttribute("count", 0);
				 
			}
			
		 Integer currentCount=(Integer) session.getAttribute("count");
		 model.addAttribute("counter",currentCount);
		 
		 
		return "OneCounter.jsp";
	 }
	 
	 @RequestMapping("/twocounter")
	 public String twocounter(Model model,HttpSession session){
		 

			if (session.getAttribute("count")==null){
				
				session.setAttribute("count", 0);
				 
			}
			else {
				
				session.setAttribute("count", (Integer) session.getAttribute("count")+2);
			}
			
		 Integer currentCount=(Integer) session.getAttribute("count");
		 model.addAttribute("counter",currentCount);
		
		 
		return "TwoCounter.jsp";
	 }
}
		