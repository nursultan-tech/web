package com.example.demo.controller;

import com.example.demo.model.Main;
import com.example.demo.service.MainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(MainController.URL_MAIN)
public class MainController {
    public static final String URL_MAIN = "/api/main";
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }
    @GetMapping
    public List<Main> get(){
        return this.mainService.findAll();
    }
    @GetMapping("/{id}")
    public Main getById(@PathVariable Long id){
        return this.mainService.findById(id);
    }
    @PostMapping("/create")
    public Main save(@RequestBody Main c){
        return this.mainService.save(c);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){this.mainService.delete(id);}
    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody Main c){
        this.mainService.update(id, c);
    }
}
