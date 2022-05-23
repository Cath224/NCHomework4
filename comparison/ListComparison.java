package com.netcracker.homework.comparison;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class ListComparison {
    public static void main(String[] args) {

           ArrayList<Integer> arrayList =new ArrayList<>();
           LinkedList<Integer> linkedList =new LinkedList<>();




            System.out.println("(addListBegin)ArrayList,  " + addListBegin(arrayList) );
            System.out.println("(addListBegin) LinkedList,  " + addListBegin(linkedList) );

            System.out.println("(addListCenter)ArrayList,  " +  addListCenter(arrayList) );
            System.out.println("(addListCenter) LinkedList,  " +  addListCenter(linkedList) );

            System.out.println("(addListEnd)ArrayList,  " +  addListEnd(arrayList) );
            System.out.println("(addListEnd) LinkedList,  " +  addListEnd(linkedList) );


            System.out.println("(setListEnd)ArrayList,  " + setListEnd(arrayList) );
            System.out.println("(setListEnd) LinkedList,  " + setListEnd(linkedList) );

            System.out.println("(setListBegin)ArrayList,  " + setListBegin(arrayList) );
            System.out.println("(setListBegin) LinkedList,  " + setListBegin(linkedList) );

            System.out.println("(setListCenter)ArrayList,  " + setListCenter(arrayList) );
            System.out.println("(setListCenter) LinkedList,  " +setListCenter(linkedList) );

            System.out.println("(getListEnd)ArrayList,  " + getListEnd(arrayList) );
            System.out.println("(getListEnd) LinkedList,  " + getListEnd(linkedList) );

            System.out.println("(getListBegin)ArrayList,  " + getListBegin(arrayList) );
            System.out.println("(getListBegin)LinkedList,  " + getListBegin(linkedList) );

            System.out.println("(getListCenter)ArrayList,  " + getListCenter(arrayList) );
            System.out.println("(getListCenter)LinkedList,  " + getListCenter(linkedList) );

            System.out.println("(removeListEnd)ArrayList,  " + removeListEnd(arrayList) );
            System.out.println("(removeListEnd) LinkedList,  " + removeListEnd(linkedList) );

            System.out.println("(removeListBegin)ArrayList,  " + removeListBegin(arrayList) );
            System.out.println("(removeListBegin) LinkedList,  " + removeListBegin(linkedList) );

            System.out.println("(removeListCenter)ArrayList,  " + removeListCenter(arrayList) );
            System.out.println("(removeListCenter)LinkedList,  " + removeListCenter(linkedList) );

            System.out.println("(clearList)ArrayList,  " + clearList(arrayList) );
            System.out.println("(clearList)LinkedList,  " + clearList(linkedList) );



        }
    public static long addListBegin(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;
        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        for (int i = 0; i < 120000; i++) {
            colection.add(0, 2);;
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

        public static long addListCenter(List<Integer> colection) {

            Instant startTime;
            Instant finishTime;
            long elapsed;

            for (int i = 0; i < 120000; i++) {
                colection.add(i);
            }

            startTime = Instant.now();
            colection.add(colection.size() / 2, 2);
            finishTime = Instant.now();
            elapsed = Duration.between(startTime, finishTime).toMillis();
            colection.clear();
            return elapsed;
        }
    public static long addListEnd(List<Integer> colection) {

        Instant startTime;
        Instant finishTime;
        long elapsed;
        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }

        for (int i = 0; i < 120000; i++) {
            colection.add(colection.size() / 2 -1,2);
        }

        startTime = Instant.now();
        colection.add(colection.size() / 2, 2);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }


    public static long setListEnd(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.set(colection.size()-1, 2);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

    public static long setListBegin(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.set(0, 2);

        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }
    public static long setListCenter(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.set(colection.size()/2 -1, 2);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }


    public static long getListEnd(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.get(colection.size()-1);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

    public static long getListBegin(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.get(0);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }
    public static long getListCenter(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;
        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.get(colection.size()/2 -1);

        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }
    public static long removeListEnd(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.remove(colection.size()-1);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

    public static long removeListBegin(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.remove(0);

        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }
    public static long removeListCenter(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.remove(colection.size()/2 -1);
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }


    public static long clearList(List<Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        for (int i = 0; i < 120000; i++) {
            colection.add(i);
        }
        startTime = Instant.now();
        colection.clear();
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        return elapsed;
    }


}
