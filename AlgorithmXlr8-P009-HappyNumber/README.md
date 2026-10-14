<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Happy Number

**Difficulty:** `Easy`

## Problem

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:
- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
- Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

An unhappy number always falls into the cycle 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4, so you can detect the loop with a set of seen values or with Floyd's slow and fast pointers.

Input format: a single integer n.

Output format: print true if n is happy, otherwise print false.

## Examples

### Example 1

**Input**
```
n = 19
```
**Output**
```
true
```

**Explanation:** 1^2 + 9^2 = 82, 8^2 + 2^2 = 68, 6^2 + 8^2 = 100, 1^2 + 0^2 + 0^2 = 1. The process reaches 1, so 19 is happy.

### Example 2

**Input**
```
n = 2
```
**Output**
```
false
```

**Explanation:** 2 -> 4 -> 16 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4. The number 4 repeats, so the process loops forever without reaching 1.

### Example 3

**Input**
```
n = 7
```
**Output**
```
true
```

**Explanation:** 7 -> 49 -> 97 -> 130 -> 10 -> 1, so 7 is happy.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/happy-number).