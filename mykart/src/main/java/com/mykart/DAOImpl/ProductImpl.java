package com.mykart.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mykart.DAO.IProductsDAO;
import com.mykart.model.Products;

@Repository
public class ProductImpl implements IProductsDAO {
	@Autowired
	private HibernateTemplate ht;

	public int addProduct(Products product) {

		int id = (Integer) ht.save(product);
		
		System.out.println("in DAO laye");
		return id;
	}

}
