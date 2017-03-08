package com.ankit.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.ankit.cartbackend.dao.CategoryDAO;
import com.ankit.cartbackend.model.Category;

@Controller
public class categoryController {
	
	//Category.jsp -addCategory link ,delete category , show category list, updatecategory,editcategory
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Category category;
	
	public ModelAndView getAllCategories()
	
	
	{
		ModelAndView mv = new ModelAndView("/AdminHome");
		List<Category> categoryList = categoryDAO.list();
		mv.addObject("categoryList", categoryList);
		mv.addObject("isUserClickedCategory", "true");
		
		return mv;
		
		
		
	}
	

}
