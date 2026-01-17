package com.example.springbootapp.springbootapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice")
public class Invoice {

    @GetMapping
    public String invoiceApiHomePage() {
        return "Invoice Default Route!!!";
    }

    @GetMapping("/getAllInvoice")
    public String getAllInvoice() {
        return "All Invoice!!";
    }

    @PostMapping("/createInvoice")
    public String createInvoice() {
        return "Invoice Created";
    }

    @PutMapping("/updateInvoice")
    public String updateInvoice() {
        return "Invoice Updated";
    }

    @DeleteMapping("/deleteInvoice")
    public String deleteInvoice() {
        return "Invoice Deleted Successfully!";
    }

}
