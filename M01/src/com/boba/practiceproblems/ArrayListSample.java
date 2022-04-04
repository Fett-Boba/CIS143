package com.boba.practiceproblems;
import java.util.*;

public class ArrayListSample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("four");
        list.add("score");
        list.add("seven");
        list.add("years");
        list.add("what was next?");
        list.add("ago");
        list.add(2, "and");
        list.remove(5);
        System.out.println("list = " + list);
        System.out.println(list.indexOf("seven"));
    }
}