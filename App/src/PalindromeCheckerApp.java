import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "civic";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both queue and stack
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare characters
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}