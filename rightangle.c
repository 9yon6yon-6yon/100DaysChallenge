#include <stdio.h>
#include <math.h>

int main()
{
    float a, b, c, area;
    printf("1st side :");
    scanf("%f", &a);
    printf("2nd side :");
    scanf("%f", &b);
    printf("3rd side :");
    scanf("%f", &c);
    int c2 = sqrt((a * a) + (b * b));
    if (c == c2)
    {
        area = 0.5 * a * b;
        printf("Right-angled : Yes\n");
        printf("Area : %.0f\n", area);
    }
    else
        printf("\nRight-angled : False");
    return 0;
}
