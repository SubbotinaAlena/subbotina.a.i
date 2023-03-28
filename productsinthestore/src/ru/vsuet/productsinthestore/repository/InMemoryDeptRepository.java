package ru.vsuet.productsinthestore.repository;

import ru.vsuet.productsinthestore.domain.Dept;
import ru.vsuet.productsinthestore.inmemory.Storage;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDeptRepository implements Repository<Dept>{
    private List <Dept> depts;
    public InMemoryDeptRepository(){
        depts=Storage.getInstance().getDepts();
    }

    @Override
    public Dept find(String name){
        return  depts.stream()
                .filter(o->o.getNameot().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    @Override
    public void save(Dept source){
        depts.add(source);
    }
    @Override
    public void remove(Dept target){
        depts.removeIf(o->o.getNameot().equalsIgnoreCase(target.getNameot()));
    }
    @Override
    public List<Dept> list(){
        return new ArrayList<>(depts);
    }
}