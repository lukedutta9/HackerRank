#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    int n; 
    scanf("%d", &n);
    int *a = malloc(sizeof(int) * n);
    for(int a_i = 0; a_i < n; a_i++){
    	scanf("%d",&a[a_i]);
    }

    int numSwaps;

    for(int i = 0; i < n; i++) {
        int temp_swap = 0;
        for(int j = 0; j < n-1; j++) {
            if(a[j] > a[j+1]) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                temp_swap++;
            }
        }

        numSwaps += temp_swap;

        if(temp_swap == 0)
            break;
    }

    printf("Array is sorted in %d swaps.\n", numSwaps);
    printf("First Element: %d\n", a[0]);
    printf("Last Element: %d", a[n-1]);

    // Write Your Code Here
    return 0;
}

