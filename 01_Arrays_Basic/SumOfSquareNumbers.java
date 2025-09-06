// Problem: Sum of Square Numbers
// Link: https://leetcode.com/problems/sum-of-square-numbers/
// Difficulty: Easy/Medium
// Objective: Given a non-negative integer c, determine if there exist two integers a and b
//            such that a^2 + b^2 = c.

public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long b = (long) Math.sqrt(c - a * a);  // check the other number
            if (a * a + b * b == c) {
                return true; // pair found
            }
        }
        return false; // no pair found
    }

    public static void main(String[] args) {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        System.out.println(solver.judgeSquareSum(5)); // true
        System.out.println(solver.judgeSquareSum(3)); // false
        System.out.println(solver.judgeSquareSum(0)); // true
        System.out.println(solver.judgeSquareSum(2)); // true
    }
}
