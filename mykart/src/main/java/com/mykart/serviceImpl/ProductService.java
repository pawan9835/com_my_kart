package com.mykart.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mykart.DAO.IProductsDAO;
import com.mykart.model.Products;
import com.mykart.service.IProductService;

@Service
@Transactional
public class ProductService implements IProductService {
	@Autowired
	private IProductsDAO prodDao;

	public int addProduct(Products product) {

		int id = prodDao.addProduct(product);
		return id;
	}
}
