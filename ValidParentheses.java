import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        // Initialize a stack to store open brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an open bracket, push it onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If the stack is empty, there is no corresponding open bracket for the current close bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Check if the current close bracket matches the top of the stack
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // After iterating through the string, if the stack is not empty, there are unmatched open brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]"; // Example input string
        System.out.println(isValid(s)); // Output: false
    }
}

