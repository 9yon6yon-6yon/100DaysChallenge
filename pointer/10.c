#include <stdio.h>
void f2(int d)
{
    d = d + 1;
}
void f(int *c)
{
    *c = *c - 2;
    f2(*c);
}
int main()
{
    int a = 32, b = 27;
    int *p = &a;
    int *q;
    *p = *p + a;
    q = &b;
    *q = *q + b;
    f(&a);
    f(&b);
    if (a > b)
    {
        *q = *q + b;
    }
    else
    {
        *p = *p - a;
    }

    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}