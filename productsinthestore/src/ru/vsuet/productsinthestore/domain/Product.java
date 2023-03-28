package ru.vsuet.productsinthestore.domain;

public class Product {
    private String name;
    private String price;
    public Product(String name,String price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }

    public String getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "Product:{"+
                "name='"+name+'\''+
                ", price="+price +'}';
    }

}