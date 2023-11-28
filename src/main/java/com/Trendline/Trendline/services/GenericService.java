package com.Trendline.Trendline.services;

import java.util.List;

public interface GenericService<T> {
    List<T> findAll();
    T findById(int id);
    T saveItem(T item);
    void deleteItem(int id);
}