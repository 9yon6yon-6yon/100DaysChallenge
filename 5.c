#include <stdio.h>
// int sumOfSevens(int array[], int n)
// {
//     int sum = 0, i;
//     for (i = 0; i < n; i++)
//     {
//         if (array[i] / 7 == 0)
//         {
//             sum += array[i];
//         }
//     }
//     return sum;
// }
int main()
{
    int n = 5, i;
    int sum = 0;
    int scores[n];
    for (i = 0; i < n; i++)
    {
        scores[i] = 2154 % 9 + 2 * i;
        printf("%d ", scores[i]);
    }
    //int result = sumOfSevens(scores, n);
    for (i = 0; i < n; i++)
    {
        if ((scores[i] % 7) == 0)//divisiable by 7 then
        {
            printf("\n%d + %d  ", sum, scores[i]);
            sum += scores[i];
            printf(" %d \n", sum);
        }
    }

    printf("%d\n", sum);

    return 0;
}