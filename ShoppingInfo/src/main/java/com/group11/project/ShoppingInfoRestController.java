package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shoppinginfo")
public class ShoppingInfoRestController {

    @Autowired
    private ShoppingInfoService shoppingInfoService;

    @GetMapping("/fetch-login/{loginId}")
    public String fetchLoginId(@PathVariable String loginId) {
    
        return shoppingInfoService.getWebUserData(loginId);
        
    }
}