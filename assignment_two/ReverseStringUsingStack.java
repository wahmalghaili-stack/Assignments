package assignment_two;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("Reversed: " + reverseString("Hello"));
    }
}
