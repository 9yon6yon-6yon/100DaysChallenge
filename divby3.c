#include <stdio.h>
int main()
{

    int i, n;
    scanf("%d", &n);
    int array[n];

    printf("Enter the numbers: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &array[i]);
    }
    for (i = 0; i < n; i++)
    {
        if (array[i] % 3 == 0)
        {
            array[i] = -1;
        }
    }
    for (i = 0; i < n; i++)
    {
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;
}