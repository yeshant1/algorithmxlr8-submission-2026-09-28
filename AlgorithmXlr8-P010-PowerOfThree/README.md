<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Power of Three

**Difficulty:** `Easy`

## Problem

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three if there exists an integer x such that n == 3^x.

Some cases to keep in mind:
- 1 is a power of three, because 3^0 = 1.
- 0 and every negative number are never powers of three, because 3^x is always positive, and for negative x it is a fraction such as 1/3, not an integer.
- A number such as 45 = 3^2 * 5 is not a power of three, because it has a prime factor other than 3.

Follow up: Could you solve it without loops or recursion?

Input format: a single line containing the integer n.

Output format: print true if n is a power of three, otherwise print false (lowercase).

## Examples

### Example 1

**Input**
```
n = 27
```
**Output**
```
true
```

**Explanation:** 27 = 3^3, so 27 is a power of three.

### Example 2

**Input**
```
n = 0
```
**Output**
```
false
```

**Explanation:** There is no integer x such that 3^x = 0.

### Example 3

**Input**
```
n = -3
```
**Output**
```
false
```

**Explanation:** There is no integer x such that 3^x = -3, because every power of three is positive.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/power-of-three).