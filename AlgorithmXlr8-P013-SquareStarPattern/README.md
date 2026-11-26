<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Square Star Pattern

**Difficulty:** `Easy`

## Problem

Given a non-negative integer n, print a solid square of stars with n rows and n columns.

Every row of the square contains exactly n star characters (*) written next to each other with no spaces between them, and there are exactly n such rows. Each row is printed on its own line, so the output forms an n x n block of stars.

This is a basic pattern printing exercise: use one loop for the rows and, inside it, a second loop (or a repeated string) that prints n stars before moving to the next line. If n is 0 the square is empty and nothing is printed.

Input format: A single line containing the integer n.

Output format: Print n lines. Each line contains exactly n * characters and nothing else.

## Examples

### Example 1

**Input**
```
n = 4
```
**Output**
```
****
****
****
****
```

**Explanation:** There are 4 rows and each row has 4 stars, giving a 4 x 4 square.

### Example 2

**Input**
```
n = 1
```
**Output**
```
*
```

**Explanation:** A 1 x 1 square is a single star.

### Example 3

**Input**
```
n = 2
```
**Output**
```
**
**
```

**Explanation:** Two rows of two stars each.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/square-star-pattern).