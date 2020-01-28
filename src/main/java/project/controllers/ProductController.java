package project.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaxxer.hikari.util.SuspendResumeLock;

import service.ProductService;


@RestController
public class ProductController {

	@Autowired
    private ProductService productService;

    @GetMapping("/v1/products")
    public ResponseEntity<List<Product>> getAllProducts()
    {
        List<Product> list = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
    }


    @PostMapping("/v1/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product)
    {
    	System.out.println("Hello ");
        productService.addProduct(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping("/v1/products/search")
    public ResponseEntity<List<Product>> searchProductByCategory(@RequestParam("category")  String category,
                                                                 @RequestParam(defaultValue = "0") Integer pageNo,
                                                                 @RequestParam(defaultValue = "10") Integer pageSize)
    {
        List<Product> list = productService.searchProductByCategory(category, pageNo, pageSize);
        if(list.isEmpty()) {
            return new ResponseEntity<List<Product>>(list, HttpStatus.NO_CONTENT);
        }
        else {
            return new ResponseEntity<List<Product>>(list, HttpStatus.FOUND);
        }
    }

}
