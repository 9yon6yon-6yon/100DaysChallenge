#include <stdio.h>
#include <stdlib.h>
int main()
{
    int n, i;
    int *array1, *array2;
    int *array3;

    printf("Enter the size of array :");
    scanf("%d", &n);
    array1 = (int *)malloc(n * sizeof(int));
    array2 = (int *)malloc(n * sizeof(int));
    array3 = (int *)malloc(n * sizeof(int));
    printf("Enter first Array : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array1[i]);
    }
    printf("Enter second Array : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array2[i]);
    }
    printf("\nThe sum is : ");
    for (i = 0; i < n; i++)
    {

        array3[i] = array1[i] + array2[i];
        printf(" %d ", array3[i]);
    }

    return 0;
}