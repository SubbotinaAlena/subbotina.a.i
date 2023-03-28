package ru.vsuet.productsinthestore;

import ru.vsuet.productsinthestore.domain.Dept;
import ru.vsuet.productsinthestore.repository.InMemoryDeptRepository;
import ru.vsuet.productsinthestore.repository.Repository;
import ru.vsuet.productsinthestore.product.DeptService;
import ru.vsuet.productsinthestore.product.Service;
import ru.vsuet.productsinthestore.view.Menu;

public class Main {
    public static void main(String[] args){
        Repository<Dept> repository=new InMemoryDeptRepository();
        Service <Dept> deptService=new DeptService(repository);
        Menu menu=new Menu(deptService);
        while (true){
            menu.draw();
        }

    }
}