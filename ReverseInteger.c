#include <stdio.h>
int main()
{
    int n, r = 0, m;

    printf("Enter any number you want: ");
    scanf("%d", &n);
    while (n != 0)
    {

        m = n % 10;
        r = r * 10 + m;
        n /= 10;
    }
    printf("After reverse: %d\n", r);

    return 0;
}