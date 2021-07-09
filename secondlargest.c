#include <stdio.h>
#include <math.h>

int main()
{
    double a_val, b_val, c_val;

    printf("1st number :\n");
    scanf("%lf", &a_val);
    printf("2nd number :\n");
    scanf("%lf", &b_val);
    printf("3rd number :\n");
    scanf("%lf", &c_val);
    float a = floor(a_val);
    float b = floor(b_val);
    float c = floor(c_val);

    if (a >= b && a >= c)
    {
        if (b >= c)
        {

            printf("\n\n%.0f is the 2nd largest number\n", b);
        }
        else
        {
            printf("\n\n%.0f is the 2nd largest number\n", c);
        }
    }
    else if (b >= a && b >= c)
    {
        if (a >= c)
        {
            printf("\n\n%.0f is the 2nd largest number\n", a);
        }
        else
        {
            printf("\n\n%.0f is the 2nd largest number\n", c);
        }
    }

    else if (a >= b)
    {
        printf("\n\n%.0f is the 2nd largest number\n", a);
    }
    else
    {
        printf("\n\n%.0f is the 2nd largest number\n", b);
    }
    return 0;
}