package com.example.springbootapp.springbootapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliveryNote")
public class DeliveryNote {
    public String delivaryNoteApi() {
        return "Delivery Note Apr Routes:- [ /getAllDeliveryNotes, /showTagDetails, /createDeliveryNote, /deleteDeliveryNote  ]";
    }

    @GetMapping("/getAllDeliveryNotes")
    public String getAllDeliveryNotes() {
        return "All Delivery Notes!";
    }

    @GetMapping("/showTagDetails")
    public String showTagDetails() {
        return "Tag Details!";
    }

    @PostMapping("/createDeliveryNote")
    public String createDeliveryNote() {
        return "Delivery Note Created!";
    }

    @DeleteMapping("/deleteDeliveryNote")
    public String deleteDeliveryNote() {
        return "Delivery Note Delete!";
    }

}
