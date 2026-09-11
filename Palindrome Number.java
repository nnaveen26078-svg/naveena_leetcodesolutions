class Solution {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int remainder = num % 10; 
            reversedNum = (reversedNum * 10) + remainder; 
            num /= 10; 
        }
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {
        int num1 = 12321;
        int num2 = 54321;
        System.out.println(num1 + " is palindrome? " + isPalindrome(num1)); // true
        System.out.println(num2 + " is palindrome? " + isPalindrome(num2)); // false
    }
}
