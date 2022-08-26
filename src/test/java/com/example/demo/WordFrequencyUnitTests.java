package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class WordFrequencyUnitTests {

    @Autowired
    WordFrequency wordFrequency;

    @Test
    public void testSample() {
        final String test1 = "cat is in the bag the";

        final List<Map.Entry<String, Integer>> expected = new LinkedList<>();

        final Map.Entry<String,Integer> the =
                new AbstractMap.SimpleEntry<String, Integer>("the", 2);
        final Map.Entry<String,Integer> cat =
                new AbstractMap.SimpleEntry<String, Integer>("cat", 1);
        final Map.Entry<String,Integer> is =
                new AbstractMap.SimpleEntry<String, Integer>("is", 1);
        final Map.Entry<String,Integer> in =
                new AbstractMap.SimpleEntry<String, Integer>("in", 1);
        final Map.Entry<String,Integer> bag =
                new AbstractMap.SimpleEntry<String, Integer>("bag", 1);
        expected.add(the);
        expected.add(cat);
        expected.add(is);
        expected.add(in);
        expected.add(bag);

        System.out.println(test1); //for command line output

        final List<Map.Entry<String, Integer>> result = wordFrequency.wordFrequencySolution(test1);

        System.out.println("\n"); //for command line output

        for (Map.Entry<String, Integer> r: result) {
            assert (expected.contains(r));
        }
    }

    @Test
    public void testSample2() {
        final String test2 = "Ann while Bob had had had had had had had had had had had a better effect on on the teacher";

        final List<Map.Entry<String, Integer>> expected = new LinkedList<>();

        final Map.Entry<String,Integer> had =
                new AbstractMap.SimpleEntry<String, Integer>("had", 11);
        final Map.Entry<String,Integer> on =
                new AbstractMap.SimpleEntry<String, Integer>("on", 2);
        final Map.Entry<String,Integer> ann =
                new AbstractMap.SimpleEntry<String, Integer>("Ann", 1);
        final Map.Entry<String,Integer> better =
                new AbstractMap.SimpleEntry<String, Integer>("better", 1);
        final Map.Entry<String,Integer> the =
                new AbstractMap.SimpleEntry<String, Integer>("the", 1);
        final Map.Entry<String,Integer> a =
                new AbstractMap.SimpleEntry<String, Integer>("a", 1);
        final Map.Entry<String,Integer> teacher =
                new AbstractMap.SimpleEntry<String, Integer>("teacher", 1);
        final Map.Entry<String,Integer> bob =
                new AbstractMap.SimpleEntry<String, Integer>("Bob", 1);
        final Map.Entry<String,Integer> effect =
                new AbstractMap.SimpleEntry<String, Integer>("effect", 1);
        final Map.Entry<String,Integer> whilee =
                new AbstractMap.SimpleEntry<String, Integer>("while", 1);
        expected.add(the);
        expected.add(had);
        expected.add(on);
        expected.add(ann);
        expected.add(better);
        expected.add(a);
        expected.add(teacher);
        expected.add(bob);
        expected.add(effect);
        expected.add(whilee);

        System.out.println(test2); //for command line output

        final List<Map.Entry<String, Integer>> result = wordFrequency.wordFrequencySolution(test2);

        System.out.println("\n"); //for command line output

        for (Map.Entry<String, Integer> r: result) {
            assert (expected.contains(r));
        }
    }

    @Test
    public void testSample2WrongNumber() {
        final String test2 = "Ann while Bob had had had had had had had had had had had a better effect on on the teacher";

        final Map.Entry<String,Integer> had =
                new AbstractMap.SimpleEntry<String, Integer>("had", 10);

        System.out.println(test2); //for command line output

        final List<Map.Entry<String, Integer>> result = wordFrequency.wordFrequencySolution(test2);

        System.out.println("\n"); //for command line output

        assert (!result.contains(had));
    }

}
