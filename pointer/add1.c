#include <stdio.h>
int main()
{
    int a = 3, b = 2;
    int s[] = {2, 0, -3, 5, 7, -2};
    int *p = &a;
    int *q, *add1, *add2;
    *p = *p + a;
    q = &b;
    *q = *q + b;
    a = *(s + 2) + a + 1;
    b = *(s + 4) + b + 1;
    add1 = s;
    add2 = s;
    if (a < b)
    {
        add1 = s + 2;
        add2 = s + 1;
    }
    else
    {
        add2 = s + 3;
        add1 = s + 4;
    }
    printf("%d\n", add1);
    printf("%d\n", add2);
    return 0;
}