package com.example.lab05service;

import java.util.ArrayList;

public class Word {
    public ArrayList<String> badWords;
    public ArrayList<String> goodWords;

    public Word() {
        this.badWords = new ArrayList<>();
        this.goodWords = new ArrayList<>();
    }
}