package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.*;

import static java.util.Arrays.asList;

@Component("wordFrequency")
public class WordFrequency {

    public List<Map.Entry<String, Integer>> wordFrequencySolution(String input) {

        HashMap<String, Integer> freqMap = new HashMap<>();

        //split string and put words into a map
        asList(input.split(" ")).forEach(s -> {
            if (freqMap.containsKey(s)) {
                Integer count = freqMap.get(s);
                freqMap.put(s, count + 1);
            } else {
                freqMap.put(s, 1);
            }
        });

        // Create a list from words in the hash map
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(freqMap.entrySet());

        // Sort the list
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        // Print the list
        list.forEach((l) -> System.out.println(l.getValue() + " " + l.getKey()));

        return list;
    }
}
