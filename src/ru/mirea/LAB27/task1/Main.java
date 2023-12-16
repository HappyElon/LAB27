package ru.mirea.LAB27.task1;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            String value = "value" + i;
            hashTable.hashtabAdd(key, value);
        }

        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            System.out.println("Lookup " + key + ": " + hashTable.hashtabLookup(key));
        }

        hashTable.hashtabDelete("key5");
        System.out.println("Lookup key5 after deletion: " + hashTable.hashtabLookup("key5"));
    }
}
