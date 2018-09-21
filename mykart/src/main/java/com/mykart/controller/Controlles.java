package com.mykart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mykart.model.Products;
import com.mykart.service.IProductService;

@Controller
public class Controlles {
	@Autowired
	private IProductService productServ;

	@RequestMapping(value = "/hi")
	public ModelAndView welcome(ModelMap map) {

		ModelAndView m = new ModelAndView();

		m.setViewName("welcome");
		return m;
	}
@RequestMapping(value = "/add")
	public ModelAndView addProduct(@ModelAttribute Products prd) {

		prd.setProductID(666);
		prd.setProductName("Laptop");
		prd.setProductPrice(45000);
		prd.setProductQuantity(1);
		prd.setProductType("Electronics");

		
		int id = productServ.addProduct(prd);

		System.out.println("Product Added Successfully :) =  " + id);

		ModelAndView m = new ModelAndView();

		m.setViewName("welcome");
		return m;
	}
}
