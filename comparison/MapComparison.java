package com.netcracker.homework.comparison;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class MapComparison {
    public static void main(String[] args) {

        Map<Integer,Integer> hashMap =new HashMap<>();
        Map<Integer,Integer> linkedHashMap =new LinkedHashMap<>();
        Map<Integer,Integer> treeMap =new TreeMap<>();


        System.out.println("(Put)HashMap,  " + putMap(hashMap) );
        System.out.println("(Put)LinkedHashMap,  " + putMap(linkedHashMap) );
        System.out.println("(Put)TreeMap,  " + putMap(treeMap) );




        System.out.println("(Get)HashMap,  " + getMap(hashMap) );
        System.out.println("(Get)LinkedHashMap,  " + getMap(linkedHashMap) );
        System.out.println("(Get)TreeMap,  " + getMap(treeMap) );

        System.out.println("(Remove)HashMap,  " + removeTest(hashMap) );
        System.out.println("(Remove)LinkedHashMap,  " + removeTest(linkedHashMap) );
        System.out.println("(Remove)TreeMap,  " + removeTest(treeMap) );

        System.out.println("(Clear)HashMap,  " + clearTest(hashMap) );
        System.out.println("(Clear)LinkedHashMap,  " + clearTest(linkedHashMap) );
        System.out.println("(Clear)TreeMap,  " + clearTest(treeMap) );

    }
    public static long putMap(Map<Integer, Integer> colection){
        Instant startTime;
        Instant finishTime;
        long elapsed;

        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            colection.put(i,i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

    public static long getMap(Map<Integer, Integer> colection) {

        Instant startTime;
        Instant finishTime;
        long elapsed;
        for (int i = 0; i < 12000; i++) {
            colection.put(i, i);
        }
            startTime = Instant.now();
            for (int i = 0; i < 12000; i++) {
                colection.get(i);
            }
            finishTime = Instant.now();
            elapsed = Duration.between(startTime, finishTime).toMillis();
        colection.clear();
        return elapsed;
    }

    public static long removeTest(Map<Integer, Integer> colection) {
        Instant startTime;
        Instant finishTime;
        long elapsed ;

        for (int i = 0; i < 12000000; i++) {
            colection.put(i, i);
        }
            startTime = Instant.now();
            for (int i = 0; i < 1200000; i++) {
                colection.remove(i);
            }
            finishTime = Instant.now();
            elapsed = Duration.between(startTime, finishTime).toMillis();

        colection.clear();
        return elapsed;
    }

    public static long clearTest(Map<Integer, Integer> colection) {
        Instant startTime;
        Instant finishTime;
        long elapsed = 0;

        for (int i = 0; i < 12000; i++) {
            colection.put(i, i);
        }
        for (int i = 0; i < 12000; i++) {
            startTime = Instant.now();
            colection.clear();
            finishTime = Instant.now();
            elapsed = Duration.between(startTime, finishTime).toMillis();
        }
        colection.clear();
        return elapsed;
    }

}
