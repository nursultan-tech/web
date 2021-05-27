package com.example.demo.service;

import com.example.demo.model.Main;

import java.util.List;

public interface MainService {
    List<Main> findAll();
    Main findById(Long id);
    Main save(Main c);
    void delete(Long id);
    Main update(Long id, Main c);
}
