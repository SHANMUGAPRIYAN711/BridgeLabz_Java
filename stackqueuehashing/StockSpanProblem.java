package BridgeLabz_Java.stackqueuehashing;

import java.util.Stack;

public class StockSpanProblem {

    // function to calculate stock span
    public static int[] calculateSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        // first day span is always 1
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            // pop elements while current price is greater
            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }

            // if stack becomes empty, span is i+1
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] result = calculateSpan(prices);

        System.out.println("Stock Span:");
        for (int span : result) {
            System.out.print(span + " ");
        }
    }
}
