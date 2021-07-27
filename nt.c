#include <stdio.h>
int main()
{
    int sum, num = 0;
    int n;
    int i, j = 3, k = 1;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        num = j * k;
        sum += num;
        k++;
    }
    printf("Result : %d\n", sum);
    return 0;
}