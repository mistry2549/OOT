#include <stdio.h>
#include <stdlib.h> 
#include <string.h> 


int compare_integers(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

int findMaxDiff_Algo3(int A[], int n, int* min_result, int* max_result) {
    if (n < 2) {
        return 0;
    }

    
    int* A_copy = (int*)malloc(n * sizeof(int));
    if (A_copy == NULL) {
        printf("Error: Malloc failed!\n");
        return -1; 
    }
    memcpy(A_copy, A, n * sizeof(int));

    
    qsort(A_copy, n, sizeof(int), compare_integers);

    
    *min_result = A_copy[0];
    *max_result = A_copy[n - 1];

    
    int diff = *max_result - *min_result;

    
    free(A_copy);

    return diff;
}


int main() {
   
    int A[100]; 
    int n = 0;  
    int max_diff_result = 0;

  
    int result_min = 0;
    int result_max = 0;

    
    printf("Enter the number of elements (max 100): ");
    scanf("%d", &n);

    
    if (n > 100 || n < 2) {
        printf("Error: Number of elements must be between 2 and 100.\n");
        return 1; 
    }

    
    printf("Enter %d integers (separated by spaces or new lines):\n", n);
    for (int i = 0; i < n; ++i) {
        scanf("%d", &A[i]);
    }

    
    max_diff_result = findMaxDiff_Algo3(A, n, &result_min, &result_max);

    printf("Maximum Difference: %d\n", max_diff_result);
    printf("Pair with max difference: (%d, %d)\n", result_max, result_min);
    printf("Loop Count: N/A (Complexity O(n log n))\n");

    return 0; 
}