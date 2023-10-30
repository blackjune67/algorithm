package com.example.algorithm_test.dataStructure;

public class Hash {
    public Slot[] hashTable;

    public Hash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;
        Slot() {
            this.value = value;
        }
    }
}
