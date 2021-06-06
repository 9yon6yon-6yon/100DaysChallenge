#include <stdio.h>
int main()
{
    int a = 2, b = 4;
    int s[] = {10, 2, 3, 5, 7, -2};
    int *p = &a;
    int *q;
    *p = *p + a;
    q = &b;
    *q = *q + b;
    if (a > b)
        *q = *q + b;
    else
        *p = *p + a;
    a = *(s + 2) + a + b;
    b = *(s + 4) - a + b;
    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
} 