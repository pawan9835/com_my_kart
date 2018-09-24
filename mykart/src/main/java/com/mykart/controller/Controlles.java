package com.mykart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mykart.model.Products;
import com.mykart.service.IProductService;

@Controller
public class Controlles {
	@Autowired
	private IProductService productServ;

	//test method for displaying view page 
	@RequestMapping(value = "/hi")
	public ModelAndView welcome(ModelMap map) {

		ModelAndView m = new ModelAndView();

		m.setViewName("addproduct");
		return m;
	}
	
	//added a test test method   
	@RequestMapping(value = "/test")
	public String testController() {
		System.out.println("Welcome to java");
		
		return "addproduct";
	}
@RequestMapping(value = "/add" ,method = RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute Products prd) {

	System.out.println("Actioned Performed :) ");
		/*prd.setProductID(11);
		prd.setProductName("Laptop");
		prd.setProductPrice(45000);
		prd.setProductQuantity(1);
		prd.setProductType("Electronics");*/

		
		int id = productServ.addProduct(prd);

		System.out.println("Product Added Successfully :) =  " + id);

		ModelAndView m = new ModelAndView();

		m.setViewName("addproduct");
		return m;
	}
}
