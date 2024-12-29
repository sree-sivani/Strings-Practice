/**
 * This program checks whether a string `s2` is a subsequence of another string `s1`.
 *
 * A subsequence is a sequence derived from another sequence by deleting some or no elements
 * without changing the order of the remaining elements.
 *
 * How it works:
 * - The program takes two strings as input: `s1` and `s2`.
 * - It iterates through both strings simultaneously, checking if the characters of `s2`
 *   appear in `s1` in the same order.
 * - If all characters of `s2` are found in `s1` in sequence, it prints "Sub Sequence Found".
 * - Otherwise, it prints "Sub Sequence Not Found".
 */

import java.util.*;

class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: Two strings, `s1` (source) and `s2` (subsequence to check)
        String s1 = sc.next();
        String s2 = sc.next();

        int j = 0; // Pointer for `s2`

        // Iterate through `s1` while ensuring we don't exceed the length of `s2`
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) { // If characters match
                j++; // Move to the next character in `s2`
            }
            // If characters do not match, just move to the next character in `s1`
            // (No explicit `else` block needed as `i` is incremented by the loop itself)
        }

        // After the loop, check if all characters of `s2` were found in sequence
        if (j == s2.length()) {
            System.out.println("Sub Sequence Found");
        } else {
            System.out.println(j); // Debugging information: how many characters matched
            System.out.println("Sub Sequence Not Found");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
