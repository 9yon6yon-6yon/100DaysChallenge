#include <stdio.h>
void first(int b, char s[])
{
    b = 5;
    s[0] = 'F';
}
void second(int *b, char *t)
{
    *b = 5;
    t[0] = 'G';
    printf("\n");
}
int main()
{
    int a = 4;
    int *p = &a;
    char str[40] = "No one beats the wiz";
    char *t = str;
    first(a, str);
    printf("After first call : %d %s \n", a, str);
    second(p, t);
    printf("After second call : %d %s\n", a, str);
    return 0;
}