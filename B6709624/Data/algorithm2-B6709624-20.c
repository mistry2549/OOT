#include <stdio.h>

int findMaxDiff(int A[], int n, long long* loop_count, int* min_result, int* max_result) {
    
    
    if (n < 2) {
        return 0;
    }

    int min_val = A[0];
    int max_val = A[0];
    *loop_count = 0; 

    for (int i = 1; i < n; ++i) {
        
        (*loop_count)++; 

        if (A[i] < min_val) {
            min_val = A[i];
        }
        
        if (A[i] > max_val) {
            max_val = A[i];
        }
    }
    
 
    *min_result = min_val;
    *max_result = max_val;
   
    
    return max_val - min_val;
}


int main() {
   
    int A[100]; 
    int n = 0;  
    int max_diff_result = 0;
    long long count_result = 0;
    
    
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

   
    max_diff_result = findMaxDiff(A, n, &count_result, &result_min, &result_max);

    
    printf("Maximum Difference: %d\n", max_diff_result);
  
    printf("Pair with max difference: (%d, %d)\n", result_max, result_min);
    printf("Loop Count (Algo 2): %lld\n", count_result);

    return 0; 
}