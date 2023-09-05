package br.com.mappy.mappyapi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocaisController {

    public static void main(String[] args) {
        SpringApplication.run(LocaisController.class, args);
    }
}
