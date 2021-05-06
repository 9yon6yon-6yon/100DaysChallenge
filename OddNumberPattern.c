#include <stdio.h>
int main()
{
    int n;
    int  row, col;
    scanf("%d", &n);

    if (n % 2 == 0)
        printf("Enter a odd number\n");

    else
    {

        int mid = n / 2 + 1; //if n=9 then mid value is 4.5
        for (row = 1; row <= n / 2; row++)
        {
            for (col = 1; col <= n; col++)
            {
                if (col == mid || col == mid - (row - 1) || col == mid + (row - 1)) //if colum ! = mid value prints _
                    printf("$");
                else
                    printf("_");
            }
            printf("\n"); //new line after a line is done
        }
        for (col = 1; col <= n; col++)
            printf("$"); //printing $ sign for n times
        printf("\n");
        for (row = n / 2; row >= 1; row--)
        {
            for (col = 1; col <= n; col++)
            {
                if (col == mid || col == mid - (row - 1) || col == mid + (row - 1))
                    printf("$");
                else
                    printf("_");
            }
            printf("\n");
        }
    }
}