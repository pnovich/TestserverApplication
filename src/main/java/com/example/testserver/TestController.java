package com.example.testserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    CustomerRepository customerRepository;
    @CrossOrigin
    @GetMapping("/")
    public String test(){
        return "test";
    }

    @GetMapping("/create")
    public String createCustomer(){
        customerRepository.save(new Customer("1","2"));
        return "create";
    }

    @GetMapping("/list")
    public List<Customer> createList(){
        return customerRepository.findAll();
    }

    @GetMapping("/list2")
    public List<Customer> createList2(){
        return customerRepository.findAll();
    }
//
//    @PostMapping("/tutorials")
//    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//        try {
//            Tutorial _tutorial = tutorialRepository
//                    .save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
//            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
    @CrossOrigin
    @PostMapping("/request")
    public ResponseEntity postController(
            @RequestBody  Event event) {

//        exampleService.fakeAuthenticate(loginForm);
        System.out.println(event);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
