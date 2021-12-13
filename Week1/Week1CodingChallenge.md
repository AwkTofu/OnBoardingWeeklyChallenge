Good Morning: Today's Activity:
Weekly Coding Challenge:

Coding Exercise 1. Almost - Palindrome
A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.

Examples
almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".
almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".
almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false

Coding Exercise 2. Staircase of Recursion
Write a function that returns the number of ways a person can climb n stairs, where the person may only climb 1 or 2 steps at a time.

To illustrate, if n = 4 there are 5 ways to climb:

[1, 1, 1, 1]
[2, 1, 1]
[1, 2, 1]
[1, 1, 2]
[2, 2]
Examples
waysToClimb(1) ➞ 1
waysToClimb(2) ➞ 2
waysToClimb(5) ➞ 8

Notes
A staircase of height 0 should return 1.