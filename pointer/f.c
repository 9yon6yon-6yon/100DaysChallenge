#include <stdio.h>
void f(int c)
{
    c = c + 2;
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
    f(b);
    printf("%d\n", *(q) + 2);

    return 0;
}