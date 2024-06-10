package org.example;

import static org.example.CollectionExample.filter;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        String[] strings = {"apple", "banana", "cherry", "date"};
        String[] filteredStrings = filter(strings, new Filter<String>() {
            @Override
            public String apply(String s) {
                if (s.length() > 5) {
                    return s.toUpperCase();
                }
                return null;
            }
        });

        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }
}