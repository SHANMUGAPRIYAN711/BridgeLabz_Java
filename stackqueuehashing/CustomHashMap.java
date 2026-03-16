package BridgeLabz_Java.stackqueuehashing;

import java.util.LinkedList;

public class CustomHashMap {

    // node to store key-value pair
    static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Node>[] table;
    int size;

    // constructor
    CustomHashMap(int size) {

        this.size = size;

        table = new LinkedList[size];

        // initialize buckets
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // simple hash function
    int hash(int key) {
        return key % size;
    }

    // insert key-value pair
    void put(int key, int value) {

        int index = hash(key);

        // check if key already exists
        for (Node node : table[index]) {

            if (node.key == key) {
                node.value = value;   // update value
                return;
            }
        }

        // otherwise add new node
        table[index].add(new Node(key, value));
    }

    // retrieve value
    int get(int key) {

        int index = hash(key);

        for (Node node : table[index]) {

            if (node.key == key) {
                return node.value;
            }
        }

        return -1; // key not found
    }

    // remove key
    void remove(int key) {

        int index = hash(key);

        for (Node node : table[index]) {

            if (node.key == key) {
                table[index].remove(node);
                return;
            }
        }
    }

    // display map
    void display() {

        for (int i = 0; i < size; i++) {

            System.out.print(i + " → ");

            for (Node node : table[i]) {
                System.out.print("(" + node.key + "," + node.value + ") ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap(10);

        map.put(1, 100);
        map.put(11, 200);
        map.put(21, 300);

        map.display();

        System.out.print("Value for key 11: " + map.get(11));

        map.remove(11);

        map.display();
    }
}