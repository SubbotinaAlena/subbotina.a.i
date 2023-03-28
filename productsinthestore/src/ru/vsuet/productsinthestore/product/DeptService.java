package ru.vsuet.productsinthestore.product;

import ru.vsuet.productsinthestore.domain.Dept;
import ru.vsuet.productsinthestore.domain.Product;
import ru.vsuet.productsinthestore.repository.Repository;

import java.util.List;

public class DeptService implements Service<Dept> {
    private final Repository<Dept> repository;
    public DeptService(Repository<Dept> repository){
        this.repository=repository;
    }
    @Override
    public Dept getByNameOt(String Nameot){
        return repository.find(Nameot);
    }
    @Override
    public List<Dept> getAll(){
        return repository.list();
    }
    @Override
    public void save(Dept source){
        repository.save(source);
    }
}