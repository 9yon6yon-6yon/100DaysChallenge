#include <stdio.h>

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}
void bubbleSort(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n - 1; i++)

        // Last i elements are already in place
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(&arr[j], &arr[j + 1]);
}

int main()
{
    int i, low, high, mid, n, key, array[100];
    printf("\tEnter number of elements :\t");
    scanf("%d", &n);
    printf("\n\tEnter %d integers \n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &array[i]);
    bubbleSort(array, n);
    printf("\tShorted Array is : ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
    printf("\n\tEnter value to find :\t");
    scanf("%d", &key);

    low = 0;
    high = n - 1;
    mid = (low + high) / 2;
    while (low <= high)
    {
        if (array[mid] < key)
            low = mid + 1;
        else if (array[mid] == key)
        {
            printf("\n\t%d found at location %d ", key, mid + 1);
            break;
        }
        else
            high = mid - 1;
        mid = (low + high) / 2;
    }
    if (low > high)
        printf("\n\tNot found! %d isn't present in the list \n", key);
    return 0;
}