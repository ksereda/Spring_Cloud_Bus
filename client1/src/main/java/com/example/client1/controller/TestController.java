package com.example.client1.controller;

import com.example.client1.model.InfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private InfoModel infoModel;

    @GetMapping(value = "/getInfo")
    public String getInfoFromServer() {
        return "Data: " + infoModel.getDataField();
    }
}