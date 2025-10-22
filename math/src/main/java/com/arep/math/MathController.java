package com.arep.math;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    


    @GetMapping("/secuence")
    public String getSecuence(@RequestParam(value = "value") String n){

        int value = Integer.parseInt(n);
        List<Integer> list = new ArrayList<>();
        secuenceLucas(value,2,1, list);
        String response = responseJson(n, list);
        return response;

    }

    public void secuenceLucas(Integer n, int a, int b, List<Integer> list){
        
        if (n==0) return;
        list.add(a);
        secuenceLucas(n-1, b, a+b, list);
    }

    public String responseJson(String value, List<Integer> list){
        String response = "{\n" +
                " \"operation\":" + "\"" + "Secuencia de Lucas" + "\"" + ",\n" +
                " \"input\":" + "\"" + value + "\"" + ",\n" +
                " \"output\":" + "\"" + list.toString() + "\"" + "\n" +
                "}";
        return response;
    }
    
}
