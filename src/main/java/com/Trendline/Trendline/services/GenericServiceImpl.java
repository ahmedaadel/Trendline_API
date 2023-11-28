package com.Trendline.Trendline.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<T> implements GenericService<T> {

    private final JpaRepository<T, Integer> repository;

    @Autowired
    public GenericServiceImpl(JpaRepository<T, Integer> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(int id) {
        Optional<T> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public T saveItem(T item) {
        return repository.save(item);
    }

    @Override
    public void deleteItem(int id) {
        repository.deleteById(id);
    }
}
