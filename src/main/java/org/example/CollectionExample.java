package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static <T> T[] filter(T[] array, Filter<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for (T item : array) {
            T filteredItem = filter.apply(item);
            if (filteredItem != null) {
                filteredList.add(filteredItem);
            }
        }
        @SuppressWarnings("unchecked")
        T[] result = (T[]) filteredList.toArray(array);
        return result;
    }
}
