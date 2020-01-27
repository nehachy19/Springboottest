package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import project.controllers.Product;
import repository.ProductRepository;

@Component
public class ProductService {


	public ProductService(ProductRepository productRepository) {
		// TODO Auto-generated constructor stub
		this.productRepository = productRepository;
	}


	@Autowired
	private ProductRepository productRepository;


	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products :: add);
		return products;
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public List<Product> searchProductByCategory(String category, Integer pageNo, Integer pageSize) {

		Pageable pageable = PageRequest.of(pageNo, pageSize);
		List<Product> listResult = productRepository.findByCategoryOrderByCreatedAtDesc(pageable, category);

		return listResult;
	}

}
