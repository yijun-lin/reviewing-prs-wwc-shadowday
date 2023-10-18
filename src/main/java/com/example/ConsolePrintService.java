package com.example;

public class ConsolePrintService implements PrintService {
    public void print(String message) {
        System.out.println(message);
    }
}
