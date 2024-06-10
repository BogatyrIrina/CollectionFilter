package org.example;

interface Filter<T> {
    T apply(T object);
}
