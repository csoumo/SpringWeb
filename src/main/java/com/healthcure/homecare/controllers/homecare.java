package com.healthcure.homecare.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class homecare {

    @GetMapping("/users/")
    public String getUserDetails(){
        return "Soumo test";
    }

    @RequestMapping(method= RequestMethod.GET,  path="/id/")
    public ResponseEntity get(@PathVariable long consumerId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

