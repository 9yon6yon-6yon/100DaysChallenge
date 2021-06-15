#include <stdio.h>
int main()
{
    int a = 2154 % 7;
    int num[10], sum = 0;
    for (int i = 0; i < 10; i++)
    {
        num[i] = 3 * i + a;
    }
    for (int i = 0; i < 10; i++)
    {
        if (i % 3 == 0)
        {
            printf("% d\n", *(num + i));
        }
        sum += *(num + i);
    }
    sum /= 10;
    printf("%d\n", sum);
    return 0;
}