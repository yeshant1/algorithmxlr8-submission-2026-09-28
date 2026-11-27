<p align="center"><img src="https://algorithmxlr8.io/logo-mark.png" width="56" alt="AlgorithmXlr8.io logo" /></p>
<h3 align="center">AlgorithmXlr8.io</h3>
<p align="center"><sub>Solved and synced automatically from <a href="https://algorithmxlr8.io">AlgorithmXlr8.io</a></sub></p>

---

# Inverted Right Half Pyramid

**Difficulty:** `Easy`

## Problem

Given a non-negative integer n, print an inverted half pyramid of stars (*) whose left edge is straight.

The figure has n rows. Row i (1-indexed, from top to bottom) consists of n - i + 1 stars with no leading spaces.

So the first row is n stars, every next row is one star shorter, and the last row is a single star. All rows start at the first column. Nothing is printed after the last star of a row, so no row has trailing spaces.

If n is 0 nothing is printed.

Input format: a single integer n.

Output format: print the n rows from top to bottom, one row per line.

## Examples

### Example 1

**Input**
```
n = 4
```
**Output**
```
****
***
**
*
```

**Explanation:** Rows 1 to 4 have 4, 3, 2 and 1 stars, all starting at the first column.

### Example 2

**Input**
```
n = 1
```
**Output**
```
*
```

**Explanation:** A single row with 1 star.

### Example 3

**Input**
```
n = 2
```
**Output**
```
**
*
```

**Explanation:** Row 1 has 2 stars and row 2 has 1 star.

---

Solved on [AlgorithmXlr8.io](https://algorithmxlr8.io/solve-dsa/inverted-right-half-pyramid).