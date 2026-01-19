package com.example.springbootapp.springbootapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tag")
public class Barcode {
    @GetMapping
    public String tagApi() {
        return "Barcode Api!";
    }

    @GetMapping("/getAlltags")
    public String getAllDeliveryNotes() {
        return "All Delivery Tages!";
    }

    @GetMapping("/showTagDetails")
    public String showTagDetails() {
        return "Tag Details!";
    }

    @PostMapping("/createTag")
    public String createDeliveryNote() {
        return "New Tag Created!";
    }

    @DeleteMapping("/deleteTag")
    public String deleteDeliveryNote() {
        return "Tag Deleted!";
    }

}
