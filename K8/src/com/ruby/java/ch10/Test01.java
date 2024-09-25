package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // 비동기화된 ArrayList 생성
        list.add("서울"); list.add("북경"); list.add("상해");
        list.add("서울"); list.add("도쿄"); list.add("뉴욕");

        for (String i : list) { // 각 요소를 출력
            System.out.println(i);
        }
        
        list.add("런던"); list.add("로마"); list.add("방콕");
        list.add("북경"); list.add("도쿄"); list.add("서울");

        System.out.println("1 : " + list.toString());

        // void add(int index, E element)
        list.add(1, "LA"); 
        print(2, list);

        // int indexOf(object o) / int lastIndexOf(object o)
        System.err.println("3 : " + list.indexOf("서울"));
        System.err.println("4 : " + list.lastIndexOf("서울"));

        // boolean remove(object o)
        list.remove("LA"); 
        print(5, list);

        // E remove(int index)
        list.remove(2); 
        print(6, list);

        // boolean contains(object o)
        System.out.println("7 : " + list.contains("LA")); // contains 포함 여부 확인

        // object[] toArray()
        Object[] obj = list.toArray(); 
        System.out.println("8 : " + Arrays.toString(obj));

        // <T> T[] toArray(T[] a)
        String[] cities = list.toArray(new String[0]);  
        System.out.println("9 : " + Arrays.toString(cities));

        // void clear()
        list.clear(); 
        print(10, list);

        // boolean isEmpty()
        System.out.println("11: " + list.isEmpty());

        list.add("파리");
        list.add("방콕");
        list.add("LA");

        // Arrays 클래스의 static <T> List<T> asList(T... a)
        List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
        print(12, list2);

        // boolean addAll(Collection<? extends E> c)
        list.addAll(list2); 
        print(13, list);

        // boolean containsAll(Collection<?> c)
        System.out.println("14 : " + list.containsAll(list2));

        // boolean retainAll(Collection<?> c)
        list.retainAll(list2); 
        print(15, list);

        // boolean removeAll(Collection<?> c)
        list.removeAll(list2); 
        print(16, list);
    }

    public static void print(int n, List<String> list) {
        System.out.println(n + " : " + list);
    }
}
