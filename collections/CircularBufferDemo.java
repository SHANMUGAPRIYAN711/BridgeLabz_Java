package BridgeLabz_Java.collections;

import java.util.*;

class CircularBuffer {

    int[] buffer;
    int size;
    int front = 0;
    int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element
    public void add(int value) {

        int rear = (front + count) % size;

        buffer[rear] = value;

        if (count == size) {
            // Buffer full → overwrite oldest
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    // Display buffer
    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferDemo {
    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display(); // 1 2 3

        cb.add(4); // overwrite
        cb.display(); // 2 3 4
    }
}
