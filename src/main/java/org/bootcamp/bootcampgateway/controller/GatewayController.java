package org.bootcamp.bootcampgateway.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GatewayController {

    @GetMapping("/authorized")
    public Map<String,String> authorized(@RequestParam String code){
        Map<String,String> map = new HashMap<>();
        map.put("code",code);
        return map;
    }

    @PostMapping("/logout")
    public Map<String,String> logout(){
        return Collections.singletonMap("logout", "OK");
    }
}
