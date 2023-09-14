package org.example.controller;

import org.example.service.IqsbzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
public class iqsbzController {
    @Autowired
    private IqsbzService iqsbzService;

    @GetMapping("/")
    public String main(){
        return "iqsbz";
    }

    @GetMapping("/iqsbz")
    public String iqsbz() {
        List<Map<String, Object>> selectAll = iqsbzService.selectAll();
        return "iqsbz";
    }
}