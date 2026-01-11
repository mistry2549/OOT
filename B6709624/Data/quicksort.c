#include <stdio.h>

// ฟังก์ชันสำหรับสลับค่า (Swap)
void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// ฟังก์ชัน Partition ตามหน้า 12 [cite: 34, 35, 36]
int partition(int A[], int left, int right) {
    int m = (left + right) / 2; // หาค่ากลาง
    swap(&A[left], &A[m]);      // ย้าย pivot ไปไว้ตัวแรก
    int pivot = A[left];        // เก็บค่า pivot
    
    int lo = left + 1;
    int hi = right;

    while (lo <= hi) {
        // หาตัวที่น้อยกว่า pivot จากฝั่งขวา (ต้นฉบับใช้ >)
        while (hi >= lo && A[hi] < pivot) { 
            hi = hi - 1;
        }
        
        // หาตัวที่มากกว่า pivot จากฝั่งซ้าย (ต้นฉบับใช้ <=)
        while (lo <= hi && A[lo] >= pivot) {
            lo = lo + 1;
        }

        // สลับค่าถ้า lo ยังไม่ข้าม hi
        if (lo <= hi) {
            swap(&A[lo], &A[hi]);
            lo = lo + 1;
            hi = hi - 1;
        }
    }
    
    // เอา pivot กลับมาวางตรงกลาง (ตำแหน่งที่ถูกต้องคือ hi)
    swap(&A[left], &A[hi]);
    return hi;
}

// ฟังก์ชัน Quick Sort หลัก [cite: 37]
void quicksort(int A[], int left, int right) {
    if (left < right) {
        int q = partition(A, left, right);
        quicksort(A, left, q - 1);  // เรียงฝั่งซ้าย
        quicksort(A, q + 1, right); // เรียงฝั่งขวา
    }
}

int main() {
    int arr[] = {38, 81, 22, 48, 13, 69, 93, 14, 45, 58, 79, 72};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original Array: ");
    for (int i = 0; i < n; i++) printf("%d ", arr[i]);
    printf("\n");

    quicksort(arr, 0, n - 1);

    printf("Sorted Ascending: ");
    for (int i = 0; i < n; i++) printf("%d ", arr[i]);
    printf("\n");

    return 0;
}