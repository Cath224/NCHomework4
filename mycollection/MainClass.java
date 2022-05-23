package com.netcracker.homework.mycollection;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;

public class MainClass {
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static void main(String[] args) {
        Instant startTime ;
        Instant finishTime ;
        long elapsed;


        MyLinkedList myLinkedList = new MyLinkedList<>();
        MyLinkedList myLinkedListTest = new MyLinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        myLinkedList.add("Java");
        myLinkedList.add(1);
        myLinkedList.add("Love");
        System.out.println(myLinkedList);
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        myLinkedList.add(0, "Best");
        System.out.println(myLinkedList);
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        System.out.println(myLinkedList.get(1));
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        System.out.println(myLinkedList.indexOf(1));
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        myLinkedList.set(1,"Spring");
        System.out.println(myLinkedList);
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        myLinkedList.toArray();
        System.out.println("\n*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");



        myLinkedList.clear();
        System.out.println(myLinkedList);
        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");


        System.out.println("Comparison ");

        startTime = Instant.now();
        for (int i = 0; i < 900; i++) {
            myLinkedListTest.add(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Add)MyLinkedList,  " + elapsed );



        startTime = Instant.now();
        for (int i = 0; i < 900; i++) {
            linkedList.add(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Add)LinkedList,  " + elapsed );



        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");



        startTime = Instant.now();
        myLinkedListTest.add(900,12);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(AddIndex)MyLinkedList,  " + elapsed );



        startTime = Instant.now();
        linkedList.add(900,12);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(AddIndex)LinkedList,  " + elapsed );



        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");


        startTime = Instant.now();
        myLinkedListTest.get(900);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(get)MyLinkedList,  " + elapsed );

        startTime = Instant.now();
        linkedList.get(900);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(get)LinkedList,  " + elapsed );


        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        startTime = Instant.now();
        myLinkedListTest.indexOf(450);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(indexOf)myLinkedList,  " + elapsed );

        startTime = Instant.now();
        linkedList.indexOf(899);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(indexOf)LinkedList,  " + elapsed );



        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");


        startTime = Instant.now();
        myLinkedListTest.remove(900);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(remove)myLinkedList,  " + elapsed );

        startTime = Instant.now();
        linkedList.remove(899);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(remove)LinkedList,  " + elapsed );

        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");


        startTime = Instant.now();
        myLinkedListTest.set(899,12);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(set)myLinkedList,  " + elapsed );

        startTime = Instant.now();
        linkedList.set(899,12);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(set)LinkedList,  " + elapsed );

        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        startTime = Instant.now();
        myLinkedListTest.size();
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(size)myLinkedList,  " + elapsed );

        startTime = Instant.now();
        linkedList.size();
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(size)LinkedList,  " + elapsed );

        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");


        startTime = Instant.now();
        myLinkedListTest.clear();
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(clear)myLinkedList,  " + elapsed );


        startTime = Instant.now();
        linkedList.clear();
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(clear)LinkedList,  " + elapsed );

        System.out.println("*+*+*+*+*+*+*+**+*+*+*+*+*+*+*+*");

        System.out.println(linkedList.size());
        System.out.println( myLinkedListTest.size());
   }
}
