package com.example.demo.controller;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class GetParamController {

    @RequestMapping("/getParamFromUrl")
    public String getParamFromUrl(MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        String name = file.getName();
        long size = file.getSize();
        Resource resource = file.getResource();
        return "sss";
    }

}
