```java
class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if only one row, return string as is
        if (numRows == 1 || s.length() <= numRows) return s;

        // Create a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            // Reverse direction if we hit top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;
        }

        // Merge all rows
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
```

