#include <stdio.h>

int main()
{
    int row, col, i = 1, j = 1;

    printf("Enter row and collumn : ");
    scanf("%d%d", &row, &col);

    int m = row;
    int n = col;

    int a[m][n];

    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            scanf("%d", &a[i][j]);
        }
        printf("\n");
    }

    int max = a[0][0];
    int location_1, location_2;

    for (int i = 0; i < row; i++)
    {
        for (int j = 1; j < col; j++)
        {
            if (max < a[i][j])
            {
                max = a[i][j];
                location_1 = i;
                location_2 = j;
            }
        }
    }

    printf("Max:%d\n", max);

    if (max == a[0][0])
    {
        printf("Location:[%d][%d]", i - 1, j - 1);
    }
    else
    {
        printf("Location:[%d][%d]", location_1, location_2);
    }

    return 0;
}
