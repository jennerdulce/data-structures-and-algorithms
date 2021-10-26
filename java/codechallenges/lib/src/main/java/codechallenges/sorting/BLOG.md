# Sorting Methods

## Insertion Sort

- First we start with an unsorted list of integer

![Image here](assets/one.png)

- The algorithm starts by comparing the index of 1 with the index of 0
- If the index at i is less than the index at j then the two numbers swap

![Image here](assets/two.png)
![Image here](assets/three.png)

- Moving on to the next iteration
- As i gets bigger, j also gets bigger
- As long as j is greater than or equal to 0 AND value of index i is less than value at index j, the swap will happen
- We always start by comparing the index of i with the index of j and swap them if the index at i is less than the index of j
- It continues making comparisons like so

![Image here](assets/four.png)
![Image here](assets/five.png)
![Image here](assets/six.png)
![Image here](assets/seven.png)

- This cycle repeats for every iteration of the array of integers until sorted


![Image here](assets/eight.png)
![Image here](assets/nine.png)
![Image here](assets/ten.png)
![Image here](assets/eleven.png)
![Image here](assets/twelve.png)
![Image here](assets/thirteen.png)
![Image here](assets/end.png)

## Efficency

Time: O(n^2)
(Additional) Space: O(1)
