package BridgeLabz_Java.collections;

import java.util.*;

class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q2.add(x);

        // Move all elements from q1 → q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    public int pop() {
        return q1.remove();
    }

    // Top operation
    public int top() {
        return q1.peek();
    }
}

public class StackQueueDemo {
    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // 3
        System.out.println("Pop: " + stack.pop()); // 3
    }
}
