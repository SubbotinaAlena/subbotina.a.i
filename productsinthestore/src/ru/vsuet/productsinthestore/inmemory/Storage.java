package ru.vsuet.productsinthestore.inmemory;

import ru.vsuet.productsinthestore.domain.Product;
import ru.vsuet.productsinthestore.domain.Dept;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static Storage instance;
    public static Storage getInstance(){
        if(instance==null){
            instance=new Storage();
        }
        return instance;
    }
    private List<Dept> depts;
    private Storage(){
        depts=new ArrayList<>();
        init();
    }
    public List<Dept> getDepts(){
        return depts;
    }
    private void init(){
        Product product= new Product("milk","49p");
        Product product1=new Product("cheez","113p");

        Dept dept= new Dept("Dairy Department",LocalTime.parse("12:00"));
        dept.addProduct(product);
        dept.addProduct(product1);

        Product product2=new Product("tea","74p");
        Product product3=new Product("coffe","217p");

        Dept dept1=new Dept("Grocery",LocalTime.parse("14:00"));
        dept1.addProduct(product2);
        dept1.addProduct(product3);

        depts.add(dept);
        depts.add(dept1);
    }
}