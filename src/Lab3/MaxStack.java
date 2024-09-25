package Lab3;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> maxStack;
    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x > maxStack.peek()) {
            maxStack.push(x);
        }
    }
    public int max() {
        return maxStack.peek();
    }

    public int pop() {
        int temp = stack.pop();

        if(temp == maxStack.peek()) {
            maxStack.pop();
        }
        return temp;
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();

        //Test case 1
        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.push(6);
        System.out.println(maxStack.max());

        //Test case 2
        maxStack.pop();
        System.out.println(maxStack.max());

        //Test case 3
        MaxStack maxStack1 = new MaxStack();
        maxStack1.push(1);
        maxStack1.push(2);
        maxStack1.push(3);
        maxStack1.push(2);
        System.out.println(maxStack1.max());

    }

}
