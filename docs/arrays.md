Arrays
======

Arrays are data structures that are linear and are stored in memory contiguously. For that reason, arrays must be 
initialised with a maximum capacity. Sometimes, we do not know the exact capacity that we would need and arrays 
do not fit as the right data structure. To alleviate this problem, we can use an algorithm for dynamically 
resize arrays. The following algorithm shows how we can achieve this:

```
   Algorithm: Resize array
   Input: array A
   Output: array of twice the legth of A and contains all elements of A  
   
   Define temp array T with twice the capacity of A
   Copy elements of A into T
   Return T
```

