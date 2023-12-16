package ru.mirea.LAB27.task3;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        for (int i = 1; i <= 10; i++) {
            String key = "key" + i;
            String value = "value" + i;
            hashTable.hashtabAdd(key, value);
        }

        String keyToSearch = "key5";
        String foundValue = hashTable.hashtabLookup(keyToSearch);
        if (foundValue != null) {
            System.out.println("Element with key " + keyToSearch + " found: " + foundValue);
        } else {
            System.out.println("Element with key " + keyToSearch + " not found.");
        }

        String keyToDelete = "key5";
        hashTable.hashtabDelete(keyToDelete);
        System.out.println("Element with key " + keyToDelete + " deleted.");

        foundValue = hashTable.hashtabLookup(keyToDelete);
        if (foundValue != null) {
            System.out.println("Element with key " + keyToDelete + " found: " + foundValue);
        } else {
            System.out.println("Element with key " + keyToDelete + " not found after deletion.");
        }
    }
}
