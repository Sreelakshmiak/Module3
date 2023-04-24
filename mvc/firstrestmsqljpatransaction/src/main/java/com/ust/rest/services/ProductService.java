package com.ust.rest.services;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.repository.UserRepository;
import com.ust.rest.resource.Product;
import com.ust.rest.resource.User;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;
	
	public Product getProduct(long productId) {
		Optional<Product> optional =productRepository.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
//		return repository.getProduct(productId);
	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
		
	}
	
	@Transactional( propagation = Propagation.REQUIRED)
	public Product add(Product product) {
//		if(validate(product)) {
//			return false;
//		}else {
//			 productRepository.save(product);
//			 return true;
//		}
		
		 Product productT = productRepository.save(product);
		addUser();
		 return productT;

		
	}
	
	@Transactional( propagation = Propagation.REQUIRES_NEW)
	public boolean addUser() {
		
		
		 //Product productT = productRepository.save(product);
		User user = new User();
		user.setUserId(5L);
		user.setDateTime(System.currentTimeMillis()+"6789643456778893345");
		try {
		
		User userT = userRepository.save(user);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 return true;
	}
	
	
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	
	public void deleteProduct(long productId) {
		productRepository.deleteById(productId);
	}
	
//	public boolean validate(Product product) {
//		if(product.getName().equals("WM")) {
//			return true;
//			
//		}else {
//			return false;
//		}
//	}

}
