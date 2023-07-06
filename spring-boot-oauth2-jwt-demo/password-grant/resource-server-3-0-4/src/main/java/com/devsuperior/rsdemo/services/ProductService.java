package com.devsuperior.rsdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.rsdemo.dto.ProductDTO;
import com.devsuperior.rsdemo.entities.Product;
import com.devsuperior.rsdemo.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Transactional
	public ProductDTO findById(Long id) {
		Product entity = productRepository.findById(id).get();
		return new ProductDTO(entity);
	}

	@Transactional
	public List<ProductDTO> findAll() {
		return productRepository.findAll().stream().map(x -> new ProductDTO(x)).toList();
	}

	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		Product entity = new Product();
		entity.setName(dto.getName());
		entity = productRepository.save(entity);
		return new ProductDTO(entity);
	}
}
