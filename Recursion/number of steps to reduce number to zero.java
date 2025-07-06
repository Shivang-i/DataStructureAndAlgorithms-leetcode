//leetcode=1342

/*The code is written to count the number of steps required to reduce a given integer to zero. At each step:

If the number is even, divide it by 2.

If the number is odd, subtract 1 from it. */




// Class definition
class Solution {
    
    // Main method that initiates the recursive helper function
    public int numberOfSteps(int num) {
        return helper(num, 0);  // Starts recursion with count initialized to 0
    }

    // Recursive helper method to count steps
    public int helper(int num, int count) {

        // Base case: if number becomes 0, return the total count of steps
        if(num == 0)
            return count;

        // If the number is even, divide by 2 and increment step count
        if(num % 2 == 0){
            return helper(num / 2, count + 1);
        }
        // If the number is odd, subtract 1 and increment step count
        else {
            return helper(num - 1, count + 1);
        }
    }
}
