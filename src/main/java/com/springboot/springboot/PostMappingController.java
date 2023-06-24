package com.springboot.springboot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMappingController {

//    @GetMapping("/openapp")
//    public String hello(){
//        return "Spring Boot application is running successfully";
//    }


    @PostMapping("/add")
    public int addNumbers(@RequestBody NumberRequest numbersRequest){
        int result = numbersRequest.getNumber1() + numbersRequest.getNumber2();
        return result;
    }
}




//@RestController
//public class CalculationController {
//
//    @PostMapping("/add")
//    public int addNumbers(@RequestParam("number1") int number1, @RequestParam("number2") int number2) {
//        int result = number1 + number2;
//        return result;
//    }
//}



