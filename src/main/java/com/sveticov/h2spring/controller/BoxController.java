package com.sveticov.h2spring.controller;

import com.sveticov.h2spring.model.Box.Box;
import com.sveticov.h2spring.service.ServiceBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class BoxController {

    private ServiceBox serviceBox;
    @Autowired
  public   BoxController(ServiceBox serviceBox){
        this.serviceBox=serviceBox;
    }

    @GetMapping("/create")
    public void createNewBox(){
        serviceBox.addBox(new Box("box 1",16,1200,2400,400));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Box>> allBox(){
        return new ResponseEntity<>(serviceBox.getAllBox(), HttpStatus.OK);
    }

}
