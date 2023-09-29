package com.giovanny.APIRest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController {
    @PostMapping("/new")
    fun newTransfer(){
        print("Saved")
    }

    @GetMapping("/all")
    fun getAllTransfers(): String {
        return "Hello"
    }
}