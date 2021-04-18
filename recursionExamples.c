#include <stdio.h>
//int global = 10;
int sum(int n)
{
    if (n != 0)
        //return n + n + sum(n - 1);
        //return n + sum(n - 1);
        return n - 2 * n + sum(n - 1);
       // return 2*n-2+sum(n+1);
        //return n-2+sum(n+1);
        //return n + global + sum(n +1);
        //return 2*n+global+sum(n+1);
    
    else
        return n;
}
int main()
{
    int number, result;
    scanf("%d", &number);
    result = sum(number);
    printf("%d\n", result);
    return 0;
}