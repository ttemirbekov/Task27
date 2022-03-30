package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Box> box = new LinkedList<>();
        box.add(new Box<>("Method"));
        box.add(new Box<>(688));
        System.out.println(Box.method(box));
    }
}
