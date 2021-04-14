package com.example.netty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        List<String> result = list.stream().filter(item->false).collect(Collectors.toList());
//        System.out.println(result.size());
//        System.out.println(result);

        List<BigDecimal> list = new ArrayList<>();
        list.add(new BigDecimal("1"));
        list.add(new BigDecimal("2"));
        list.add(new BigDecimal("3"));
        System.out.println(list.size());
        System.out.println(list);
        List<BigDecimal> result = list.stream().filter(item->false).collect(Collectors.toList());
        System.out.println(result.size());
        System.out.println(result);
        BigDecimal totalValue = result.stream().
                reduce(new BigDecimal(0), BigDecimal::add);
        System.out.println(totalValue);
    }
}
