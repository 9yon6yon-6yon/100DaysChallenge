#include <stdio.h>
void f(int c)
{
    c++;
}
int main()
{
    int a = 5, b = 3;
    int *p = &a;
    int *q;
    f(a);
    *p = *p + 1;
    q = &b;
    *q = *q + 1;
    f(b);
    f(a);
    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}