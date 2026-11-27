<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Right Half Pyramid

**Difficulty:** `Easy`

## Problem

Given a non-negative integer n, print a right half pyramid made of stars with n rows.

The pyramid is built row by row from top to bottom. Row i (counting rows from 1 at the top) contains exactly i star characters '*', written next to each other with no spaces between them. Every row starts at the left edge, with no leading spaces, so the left side of the shape is a straight vertical line and the right side grows by one star per row like a staircase. The first row therefore has 1 star and the last row has n stars, and the whole pattern uses 1 + 2 + ... + n = n * (n + 1) / 2 stars.

Do not print trailing spaces at the end of a row. If n is 0, the pyramid has no rows and nothing is printed.

Input format: a single line containing the integer n.

Output format: print n lines; line i contains i stars and nothing else.

## Examples

### Example 1

**Input**
```
n = 4
```
**Output**
```
*
**
***
****
```

**Explanation:** There are 4 rows. Row 1 has 1 star, row 2 has 2 stars, row 3 has 3 stars and row 4 has 4 stars, all aligned to the left.

### Example 2

**Input**
```
n = 1
```
**Output**
```
*
```

**Explanation:** A pyramid with one row is a single star.

### Example 3

**Input**
```
n = 3
```
**Output**
```
*
**
***
```

**Explanation:** Three rows with 1, 2 and 3 stars.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/right-half-pyramid).