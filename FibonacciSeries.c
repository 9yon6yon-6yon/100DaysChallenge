#include <stdio.h>

unsigned long long int fibonacci(int i)
{

    if (i == 0)
    {
        return 0;
    }

    if (i == 1)
    {
        return 1;
    }
    return fibonacci(i - 1) + fibonacci(i - 2);
}

int main()
{

    int i;

    for (i = 0; i < 50; i++)
    {
        printf("%lld\t\n", fibonacci(i));
    }

    return 0;
}