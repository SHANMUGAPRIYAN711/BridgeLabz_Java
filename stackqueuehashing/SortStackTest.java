package BridgeLabz_Java.stackqueuehashing;

import java.util.Stack;

class SortStack {

    // function that sorts the stack
    static void sortStack(Stack<Integer> stack) {

        // base condition
        if (!stack.isEmpty()) {

            // remove the top element
            int temp = stack.pop();

            // sort the remaining stack
            sortStack(stack);

            // insert the removed element
            // back in sorted position
            insertSorted(stack, temp);
        }
    }

    // helper function to insert element
    // at correct position
    static void insertSorted(Stack<Integer> stack, int value) {

        // if stack empty OR top element smaller
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // otherwise remove top
        int temp = stack.pop();

        // recursive call
        insertSorted(stack, value);

        // push removed element back
        stack.push(temp);
    }

}

public class SortStackTest{

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        // sort the stack
        SortStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}