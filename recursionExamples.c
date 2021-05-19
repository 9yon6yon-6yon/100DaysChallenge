#include <stdio.h>
#include<stdlib.h>
int global = -3;
int sum(int n)
{
    if (n != 10)
        //return n + n + sum(n - 1);
        //return n + sum(n - 1);
        //return n - 2 * n + sum(n - 1);
       // return 2 * n - 2 + sum(n +1);
        //return n-2+sum(n+1);
       // return n + global + sum(n +1);
        return 2 * n + global + sum(n + 1);
    //return n+sum(n-1);

    else
        return n;
}
int main()
{
    system("date");
   
    int number, result;
    scanf("%d", &number);
    result = sum(number);
    printf("sum = %d\n", result);
    return 0;
}