# Reverse an Array
<!-- Short summary or background information -->
- Write a function that reverses an array, in place
- Be careful of: empty arrays, arrays with only 1, odd numbered count, even numbered count

## Challenge
<!-- Description of the challenge -->

- Were were tasked to write a function that reverses an array that is passed in as an argument. We were tasked to do this without using any built-in methods. This was also an in-line task.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

- Identify the start and end of the array (0 and length -1)
- Swap the arr[start] with arr[end]
- Move Start forward by 1
- Move End backwards by 1
- Repeat while start <= end

## Solution
<!-- Embedded whiteboard image -->
![WhiteBoard](./assets/array-reverse.png)
