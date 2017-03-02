package com.ankit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//http://localhost:8080/shoppingCart/
	
	
	@Autowired
	private HttpSession session;

	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		System.out.println("STARTING THE METHOD IN SHOWHOMEPAGE");
		ModelAndView mv = new ModelAndView("/Home");
		
	    mv.addObject("msg" , "welcome to ShoppingCart");
	     return mv;
		
		
	}
	@RequestMapping("/login")
	public ModelAndView showloginPage()
	{
		System.out.println("clicked on Login link");
		ModelAndView mv = new ModelAndView("/Login");
	mv.addObject("isUserClickedLogin ","true");
		
		 return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView showregisterPage()
	{
		//if (is user clickedRegister)
		System.out.print("Clicked on Registration link");
		ModelAndView mv = new ModelAndView("/Register");
		mv.addObject("isUserClickedRegister ","true");
		 return mv;
	}
   @RequestMapping("/validate")
	public ModelAndView validateCredentials(@RequestParam("userID") String id,@RequestParam("password") String pwd)
			{
				
				
	   //actually you have get the data from DB
	   //temperarely user==niit pass= 123
	   
	   ModelAndView mv = new ModelAndView("/Home");
	   if(id.equals("niit") && pwd.equals("niit@123"))
{
	mv.addObject("successMessage", "valid credentials");
	session.setAttribute("loginMessage", "welcome :" +id);
}
else
{
	mv.addObject("errorMessage", "Invalid credentials...please try again");
	
	
	
}
	return mv;			
				
				
				
			}
   @RequestMapping("/logout")
   public ModelAndView logout()
   {
	   ModelAndView mv =new ModelAndView("/Home");
	   session.invalidate();
	   session.removeAttribute("loginMessage");
	   
	   return mv;
   }
   
   
   
   
   
   
   
   
   
  
   
  
   @RequestMapping("/Registered")
 	public ModelAndView validateCredentials(@RequestParam("userID") String id,@RequestParam("password") String pwd,@RequestParam("contact") String cnt,@RequestParam("address") String add )
 			{
 				
 				
 	   //actually you have get the data from DB
 	   //temperarely user==niit pass= 123
 	   
 	   ModelAndView mv = new ModelAndView("/Home");
 	   if(id.equals("niit") && pwd.equals("niit@123") && cnt.equals("123") && add.equals("noida"))
 {
 	mv.addObject("msg","user registered");
 }
 else
 {
 	mv.addObject("msg", "Invalid user...please try again");
 	
 	
 	
 }
 	return mv;			
 				
 				
 				
 			}
    
   
 			
 }
 	

	