package com.devayush.pagingAndSorting.controller;

import com.devayush.pagingAndSorting.entity.Product;
import com.devayush.pagingAndSorting.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{field}")
    public List<Product> getProductsBySorting(@PathVariable String field){
        return productService.findProductsWithSorting(field);
    }

    @GetMapping("/pagination/{page}/{pageSize}")
    public Page<Product> paginate(@PathVariable int page, @PathVariable int pageSize){
        return productService.paginateData(page,pageSize);
    }


    @GetMapping("/sortWithPagination/{field}/{page}/{pageSize}")
    public Page<Product> paginateWithSort(@PathVariable String field, @PathVariable int page,@PathVariable int pageSize){
        return productService.sortAndPaginateProducts(page,pageSize,field);
    }
}
