#include <stdio.h>

unsigned long long int factorial(unsigned int i)
{

    printf("%d * ", i);
    if (i <= 1)
    {
        return 1;
    }
    return i * factorial(i - 1);
}

int main()
{
    int i = 4;
    printf("\nFactorial of %d is %d\n", i, factorial(i));
    return 0;
}