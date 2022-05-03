# Matrix-Flatten

## The exact way the matrix is converted into the array
- Multi-dimension arrays are mapped into an equivalent one dimensional array using a specified mapping function
- Consider variable A declared as:  
  A: array[L1 .. U1, L2 .. U2, L3 .. U3] of element (L1 <= i <= U1) and (L2 <= j <= U2) and (L3 <= k <= U3)
- Each element of the array requires c cells of memory
- The address of the first element of A is Loc( A[L1, L2, L3] )
- The location of A[i, j, k] is given by the linear addressing function:  
  Loc (A[i , j, k]) = Loc ( A[L1, L2, L3] ) + c * { (U3 - L3 + 1) (U2 - L2 + 1) (i1 - L1 ) + (U3 - L3 + 1 ) ( j - L2 ) + ( k - L3 ) }

## The complexity of the solution
- createVector() method is taking O(n^3):  
  since each element from the matrix is copied to the 1D vector.
 - convertIndexing() method is taking O(1):  
   since it just computes an expression.
## This Task was developed with Java
