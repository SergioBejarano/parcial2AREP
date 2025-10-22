package com.arep.proxy;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    private int number = 1;

    @GetMapping("secuence")
    public String getSecuence(@RequestParam(value = "value") String n) throws IOException{
        String base;
        if (number == 1){
            number = 2;
            base = "http://localhost:8081";

        } else{
            number = 1;
            base = "http://localhost:8082";
        }
        String fullbase = base + "?value=" + n;
        return HttpConnection.get(fullbase);

    }
}