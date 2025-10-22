package com.arep.math;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    
    private List<Integer> list = new ArrayList<>();


    @GetMapping("/secuence")
    public String getSecuence(@RequestParam(value = "value") String n){

        int value = Integer.parseInt(n);

        secuenceLucas(value,2,1);
        String response = responseJson(n);
        return response;

    }

    public void secuenceLucas(Integer n, int a, int b){
        
        if (n==0) return;
        list.add(a);
        secuenceLucas(n-1, b, a+b);
    }

    public String responseJson(String value){
        String response = "{\n" +
                " \"operation\":" + "\"" + "Secuencia de Lucas" + "\"" + ",\n" +
                " \"input\":" + "\"" + value + "\"" + ",\n" +
                " \"output\":" + "\"" + list.toString() + "\"" + "\n" +
                "}";
        return response;
    }
    
}
