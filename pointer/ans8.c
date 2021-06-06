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
    int a = 5, b = 3;
    int *p = &a;
    int *q;
    f(&a);
    *p = *p + 1;
    q = &b;
    *q = *q + 1;
    f(&b);
    f(&b);
    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}