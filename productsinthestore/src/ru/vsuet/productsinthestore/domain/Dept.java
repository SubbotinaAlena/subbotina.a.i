package ru.vsuet.productsinthestore.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Dept {
    private String nameot;
    private LocalTime time;
    private List<Product> products;

    public Dept(String nameot,LocalTime time){
        this.nameot=nameot;
        this.time=time;
        this.products= new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.removeIf(p->p.getName().equalsIgnoreCase(product.getName()));
    }
    public String getNameot(){
        return nameot;
    }

    public LocalTime getTime(){
        return time;
    }
    public List<Product> getProducts(){
        return new ArrayList<>(products);
    }

    @Override
    public String toString(){
        return "Dept:{"+
                "name='"+nameot+
                ",time="+time+
                ",product"+products+
                '}';
    }
}