package com.spe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpeMiniProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeMiniProjectApplication.class, args);
        System.out.println("Build successfully with jenkins");

    }
}
