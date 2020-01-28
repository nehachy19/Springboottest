package repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.controllers.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    List<Product> findByCategoryOrderByCreatedAtDesc(Pageable pageable, String category);
}
