#include <stdio.h>

int main()

{
    printf("\t\t========== Office Pay Roll System ==============\n\n");

    printf("\t\t===== Enter r, to take salary of all Employee Array of size N.====\n");

    printf("\t\t===== Enter s, to find and display Salary Ammount.====\n");
    printf("\t\t===== Enter y, to find and display the height Salary Ammount.====\n");

    printf("\t\t===== Enter t, to display Salary  of all the Employee.====\n");

    printf("Press q to quit\n");
    int r[1000], s, t, N, f = 0, i;
    char ch;
    int search;

    while (1)
    {
        printf("\nPress 'enter' key to continue...");
        getchar();
        printf("\n Enter your choice: ");
        scanf("%c", &ch);

        if (ch == 'q')
            break;

        switch (ch)
        {

        case 'r':
        {
            printf("\nEnter number of Employee: ");
            scanf("%d", &N);
            printf("\nEnter Salary of Employee: \n");

            for (i = 0; i < N; i++)
            {
                printf("Salary info : %d\n", i + 1);

                scanf("%d", &r[i]);
            }
            f = 1;
            break;
        }

        case 's':
        {
            if (f == 0)
                printf("\n =========== No Salary found ===========\n");
            else

            {
                printf("Enter salary :");
                scanf("%d", &search);
                for (i = 0; i < N; i++)
                {
                    if (search == r[i])
                    {
                        printf("\n\t Salary : %d\n\tFound at index: %d ", search, i + 1);
                        break;
                    }
                }
            }
            break;
        }

        case 'y':
        {
            if (f == 0)
                printf("\n =========== No Salary found ===========\n");
            else
            {
                int max = r[0];
                for (i = 0; i < N; i++)
                {
                    if (max < r[i])
                    {
                        max = r[i];
                    }
                }
                printf("Height Salary among all is : %d \n", max);
            }
            break;
        }
        case 't':
        {
            if (f == 0)
                printf("\n =========== No Salary found ===========\n");
            else
            {
                printf("\n Salary of all Employee");
                for (i = 0; i < N; i++)
                {
                    printf("\n  %d . %d", i + 1, r[i]);
                }
            }
            break;
        }

        default:
            printf("\n =============================================\n ");
            printf("\n =============== Invalid Input ===============\n ");
            printf("\n =============================================\n ");
            break;
        }
    }
}