package ru.vsuet.productsinthestore.repository;

import ru.vsuet.productsinthestore.domain.Product;
import ru.vsuet.productsinthestore.inmemory.Storage;

import java.util.List;
import java.util.stream.Collectors;

public class InMemoryProductRepository implements Repository<Product>{
    private List<Product> product;

    public InMemoryProductRepository(){
        product=Storage.getInstance().getDepts().stream()
                .flatMap(o->o.getProducts().stream())
                .collect(Collectors.toList());
    }
    @Override
    public Product find(String name){
        return product.stream()
                .filter(t->t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(Product source){
        throw new IllegalStateException("Method is not supported");
    }
    @Override
    public void remove(Product target){
        throw new IllegalStateException("Method is not supported");
    }
    @Override
    public List<Product> list(){
        return product;
    }
}