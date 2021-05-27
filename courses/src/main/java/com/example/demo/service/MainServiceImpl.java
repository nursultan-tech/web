package com.example.demo.service;

import com.example.demo.model.Main;
import com.example.demo.repository.MainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {
    private final MainRepository mainRepository;

    public MainServiceImpl(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @Override
    public List<Main> findAll() {
        return this.mainRepository.findAll();
    }

    @Override
    public Main findById(Long id) {
        return this.mainRepository.findById(id).get();
    }

    @Override
    public Main save(Main c) {
        return this.mainRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        this.mainRepository.delete(findById(id));
    }

    @Override
    public Main update(Long id, Main c) {

        return mainRepository.findById(id)
                .map(main -> {
                    main.setCourseName(c.getCourseName());
                    main.setCreditNumber(c.getCreditNumber());
                    main.setStudentsRegistered(c.getStudentsRegistered());
                    return mainRepository.save(main);
                })
                .orElseGet(() -> {
                    c.setId(id);
                    return mainRepository.save(c);
                });
    }
}
