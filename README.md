# Algorithms and Data Structures

Implementation of various algorithms and data structures. You can find more information about each of them further below.

**Note**: the goal of this project is not to demonstrate how to write high-quality object-oriented code. Instead, focus is on implementing and demonstrating usage of various algorithms and data structures, while keeping the code as simple as possible. 

-----

### Sorting algorithms

Selection sort
- Best case time complexity: O(n^2)
- Worst case time complexity: O(n^2)
- Stable: no
- Note: small amount of writes, becomes useful when writes are slow

Bubble sort
- Best case time complexity: O(n) if optimized, otherwise O(n^2)
- Worst case time complexity: O(n^2)
- Stable: yes
- Note: considered as very inefficient

Insertion sort
- Best case time complexity: O(n)
- Worst case time complexity: O(n^2)
- Stable: yes
- Note: considered as the fastest algorithm when n<10

Merge sort
- Best case time complexity: O(n*log(n))
- Worst case time complexity: O(n*log(n))
- Stable: yes
- Note: stable algorithm with O(n*log(n)) worst case time complexity; space complexity is O(n) (can be an issue for huge n)

Quick sort
- Best case time complexity: O(n*log(n))
- Worst case time complexity: O(n^2)
- Stable: no
- Note: worst case scenario in practice should never happen; considered as the quickest algorithm

Heap sort
- Best case time complexity: O(n*log(n))
- Worst case time complexity: O(n*log(n))
- Stable: no
- Note: suitable when memory is an issue, since space complexity is O(1)
