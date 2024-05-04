package com.lautaro.Ejercicio.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.lautaro.Ejercicio.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

    public Product findByName(String name);

    public Iterable<Product> findByOrderByPriceDesc();
}
