<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Left Half Pyramid

**Difficulty:** `Easy`

## Problem

Given a non-negative integer n, print a left half pyramid of stars with n rows.

Row i (1-indexed, from top to bottom) contains exactly i stars '*'. The stars of every row are pushed to the right edge, so row i starts with n - i spaces followed by i stars, and every row is exactly n characters wide. The first row has a single star at the far right, and the last row is n stars with no spaces.

There are no spaces between stars and no trailing spaces at the end of a row. If n is 0, the pyramid has no rows and nothing is printed.

Input format: A single line containing the integer n.

Output format: Print n lines. Line i consists of n - i spaces followed by i '*' characters.

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

**Explanation:** There are 4 rows. Row 1 has 3 spaces and 1 star, row 2 has 2 spaces and 2 stars, row 3 has 1 space and 3 stars, and row 4 has 4 stars.

### Example 2

**Input**
```
n = 2
```
**Output**
```
 *
**
```

**Explanation:** Row 1 is one space followed by one star, and row 2 is two stars.

### Example 3

**Input**
```
n = 1
```
**Output**
```
*
```

**Explanation:** A single row with a single star.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/left-half-pyramid).