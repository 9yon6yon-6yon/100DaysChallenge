#include <stdio.h>
#include <string.h>

int num1, num2; //global variable num1 and num2
int f1(float x);
void f2(int x, float y);
int main()
{
    num1 = 3002 % 7; //num1 = 5
    printf("%d\n",num1);
    num2 = f1(num1); //in variable num2 calling f1 function and passing num1 as parameter
    printf("%d\n",num2);
    f2(12, 15.0);    //calling f2 function and passing 12 to parameter num1 and 15.0 to parameter num2
    return 0;
}
int f1(float x)
{
    num2 = x * num1; //num2 = 5*5=25
    return num2 - 1; //returning to global variable num2 = 25-1 = 24
}
void f2(int num1, float num2)
{
    num1 = num1 + num2; //num1 = 12+15.0
    num2 = num1 - num2; //num2 = 12-15.0
}