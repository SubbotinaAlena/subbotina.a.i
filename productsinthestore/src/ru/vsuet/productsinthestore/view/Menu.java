package ru.vsuet.productsinthestore.view;

import ru.vsuet.productsinthestore.domain.Dept;
import ru.vsuet.productsinthestore.product.Service;

import java.util.Scanner;

public class Menu  {
    Scanner keyboard=new Scanner(System.in);

    private final Service<Dept> deptService;
    public Menu(Service<Dept> deptService){
        this.deptService=deptService;
    }
    public void draw(){
        System.out.println("******MENU******\n");
        System.out.println("1 - list of depts");
        System.out.println("2 - get depts by name");
        System.out.println("9 - Exit");
        execute();
    }
    private void execute(){
        int command=keyboard.nextInt();
        switch (command){
            case 1->drawObjectList();
            case 2->drawSingleObject();
            case 9->System.exit(0);
            default-> throw new IllegalArgumentException("No command found");
        }
    }
    private void drawObjectList() {
        System.out.println("------Depts list------");
        deptService.getAll().forEach(System.out::println);
    }
    private void drawSingleObject() {
        System.out.println("Enter dept name: ");
        String NameOt=keyboard.next();
        System.out.println("------Single dept------");
        Dept dept=deptService.getByNameOt(NameOt);
        System.out.println(NameOt);
    }
}
