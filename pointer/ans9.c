#include <stdio.h>
void f2(int d)
{
    d = d + 1;
}
void f(int *c)
{
    f2(*c);
}
int main()
{
    int a = 32, b = 27;
    int *p = &a;
    int *q;
    *p = *p + b;
    q = &b;
    *q = *p + a;
    f(&a);
    f(&b);

    if (a > b)
        *q = *q + b;
    else
        *p = *p - a;
    printf("%d\n", a);
    printf("%d\n", a);
    return 0;
}