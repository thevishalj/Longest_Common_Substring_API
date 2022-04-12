package com.vishal.lcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LcsApplication
{
    public static void main(String[] args) {
        SpringApplication.run(LcsApplication.class, args);         //Without this, the server will not start
    }
}
