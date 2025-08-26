<---------Valid Anagram--------->

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true


1) Make a empty Array for all letter a-z.
2) Check if both Strings s and t has same length.
3) Place all letters of s into the Array.
4) After placing reduce the elements using t.
5) if every element placed matches with prev array and array goes empty return true
6) Otherwise one of the Strings has greater number of Letters.