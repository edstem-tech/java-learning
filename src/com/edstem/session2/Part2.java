package com.edstem.session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Part2 {

    static void someMethod(int i, int j) {
        i = 10;
        j = 20;
    }

    static MyData someMethod(MyData m) {
        MyData newM = new MyData(m.getNumber() + 1);
        return newM;
    }

    static double average(MyData... d) {
        double sum = 0;
        for (MyData m : d) {
            sum += m.getNumber();
        }
        return sum / d.length;
    }

    public static void main(String[] args) {
//        int i= 1;
//        int j = 5;
//        someMethod(i, j);
//        System.out.println(i);
//        System.out.println(j);

//        MyData m = new MyData(5);
//        System.out.println(m);
//        MyData nm = someMethod(m);
//        System.out.println(nm);

        System.out.println(average(new MyData(5), new MyData(10), new MyData(3)));

//        Integer[] s = new Integer[100];
//        List<String> list = new ArrayList<>();
//        // add elements to the list
//        list.add("A");
//        list.add("B");
//        list.add("C");
//
//        list.add(3, "D");
////        System.out.println(list);
//
//        List<MyData> numbers = new ArrayList<>();
//        numbers.add(new MyData(1));
//        numbers.add(new MyData(3));
//        numbers.add(new MyData(2));
//        numbers.add(new MyData(5));
//        System.out.println(numbers);
//        numbers.sort((a, b) -> b.getNumber() - a.getNumber());
////        numbers.sort(new MyDataComparator());
//        System.out.println(numbers);

//        System.out.println(numbers.contains(1));
//        System.out.println(numbers.contains(11));

//        List<Integer> numbers2 = new ArrayList<>();
//        numbers2.addAll(numbers);
//
//        List<Integer> subList = numbers.subList(2, 5);

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }

//        for (int element : numbers) {
//            System.out.println(element);
//        }

//        numbers.stream().forEach(System.out::println);

//        Collections.sort(numbers);
    }

//    static class MyDataComparator implements Comparator<MyData> {
//        @Override
//        public int compare(MyData a, MyData b) {
//            return a.getNumber() - b.getNumber();
//        }
//    }


}
