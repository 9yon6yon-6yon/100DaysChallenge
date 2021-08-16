#include <stdio.h>

int main()
{
    int n, m = 1;
    scanf("%d", &n);
    for (int i = n; i >= 1; i--)
    {
        for (int j = 1; j <= i - 1; j++)
        {
            printf(" ");
        }
        for (int k = 0; k < m; k++)
        {
            if (k > 0 && k % 3 == 0 && k < 3)
            {
                printf("%d", k);
            }
            else
                printf("%d", k * 3);
        }
        printf("\n");
        m++;
    }
    return 0;
}
//