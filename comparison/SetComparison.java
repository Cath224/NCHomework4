package com.netcracker.homework.comparison;

        import java.time.Duration;
        import java.time.Instant;
        import java.util.*;

public class SetComparison {
    public static void main(String[] args) {
        Instant startTime;
        Instant finishTime;
        long elapsed;


        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();



        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            hashSet.add(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Add)HashSet,  " + elapsed);

        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            linkedHashSet.add(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Add)LinkedHashSet,  " + elapsed);

        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            treeSet.add(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Add)TreeSet,  " + elapsed);


        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            hashSet.remove(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Remove)HashSet,  " + elapsed);

        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            linkedHashSet.remove(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Remove)LinkedHashSet,  " + elapsed);

        startTime = Instant.now();
        for (int i = 0; i < 1200000; i++) {
            treeSet.remove(i);
        }
        finishTime = Instant.now();
        elapsed = Duration.between(startTime, finishTime).toMillis();
        System.out.println("(Remove)TreeSet,  " + elapsed);


    }
}