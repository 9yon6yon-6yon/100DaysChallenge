#include <stdio.h>
int main()
{
    int n;
    int i, flag = 0;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            
            flag++;
        }
    }
    if (flag == 2)
    {
        printf("Prime Number\n");
    }
    else
    {
        printf("Not Prime\n");
    }

    return 0;
}