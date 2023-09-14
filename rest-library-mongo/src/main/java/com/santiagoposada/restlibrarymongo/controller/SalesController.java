package com.santiagoposada.restlibrarymongo.controller;

import com.santiagoposada.restlibrarymongo.entity.Sales;
import com.santiagoposada.restlibrarymongo.respository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
public class SalesController {

    @Autowired
    private SalesRepository saleRepository;


    @GetMapping("/get/all")
    public ResponseEntity<List<Sales>> getAllSales(){
        return new ResponseEntity<>(saleRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public void saveSale(@RequestBody HashMap<String, String> body){
        System.out.println(body);
    }

    @GetMapping("/{id}")
    public Sales getById(@PathVariable("id") String id){
        Sales sale = saleRepository.findById(id).get();
        return sale;
    }
}
