package com.lautaro.Ejercicio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lautaro.Ejercicio.models.Product;
import com.lautaro.Ejercicio.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public String saveProduct(Product request){
        repository.save(request);
        return "Producto guardado exitosamente.";        
    }

    public Product getProductById(Long id){
        return repository.findById(id).orElse(null);

    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public Iterable <Product> getProductOrderByPrice(){
        return repository.findByOrderByPriceDesc();
    }

    public String updateProductById(Long id, Product request){
        Product getProduct = repository.findById(id).orElse(null);
        getProduct.setname(request.getname());
        getProduct.setdescription(request.getdescription());
        getProduct.setprice(request.getprice());
        getProduct.setquantity(request.getquantity());
        repository.save(getProduct);
        return "Producto actualizado exitosamente.";
    }

    public String deleteProductByID(Long id){
        repository.deleteById(id);
        return "Producto eliminado exitosamente.";
    }

}
