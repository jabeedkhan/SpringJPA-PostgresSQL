package com.springjpa.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.springjpa.model.Customer;
import com.springjpa.repo.CustomerRepository;
 
@RestController
public class WebController {
  @Autowired
  CustomerRepository repository;
  
  @RequestMapping("/save")
  public String process(){
    // save a single Customer
      repository.save(new Customer("jabeed", "khan")); 
      repository.save(new Customer("Rahman", "khan"));
      repository.save(new Customer("Nishar", "Sab"));

      
    return "Done";  
  }
  
  
  @RequestMapping("/findall")
  public String findAll(){
    String result = "";
    
    for(Customer cust : repository.findAll()){
      result += cust.toString() + "<br>";
    }
    
    return result;
  }
  
  @RequestMapping("/findbyid")
  public String findById(@RequestParam("id") long id){
    String result = "";
    result = repository.findById(id).toString();
    return result;
  }
  
  @RequestMapping("/findbylastname")
  public String fetchDataByLastName(@RequestParam("lastname") String lastName){
    String result = "";
    
    for(Customer cust: repository.findByLastName(lastName)){
      result += cust.toString() + "<br>"; 
    }
    
    return result;
  }
}
