package BridgeLabz_Java.stackqueuehashing;

import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // enqueue operation
    public void enqueue(int value) {
        // simply push into stack1
        stack1.push(value);
    }

    // dequeue operation
    public int dequeue() {

        // if both stacks are empty, queue is empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        // if stack2 is empty, move elements from stack1
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // pop from stack2 (this gives FIFO behaviour)
        return stack2.pop();
    }

    // peek front element
    public int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }
}

public class QueueUsingStackTest{

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    }
}