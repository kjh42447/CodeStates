package com.example.section3week1.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/coffees")
public class CoffeeController {
//    @PostMapping
//    public ResponseEntity postCoffee(@RequestHeader("user-agent") String userAgent,//(1)
//                                     @RequestParam("korName") String korName,
//                                     @RequestParam("engName") String engName,
//                                     @RequestParam("price") int price) {
//        System.out.println("user-agent: " + userAgent);
//        return new ResponseEntity<>(new Coffee(korName, engName, price),
//                HttpStatus.CREATED);
}
