#include <stdio.h>

int main()

{
    printf("\t\t========== Office Pay Roll System ==============\n\n");

    printf("\t\t===== Enter r, to take salary of all Employee Array of size N.====\n");

    printf("\t\t===== Enter s, to find and display Salary Ammount.====\n");

    printf("\t\t===== Enter t, to display Salary  of all the Employee.====\n");

    printf("Press q to quit\n");
    int r[1000], s, t, N, f = 0, i;
    char ch;
    int search;
    int found = 0;

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
                    else
                        printf("No Salary found\n");
                    break;
                }
            }
        }
        break;

        case 't':
        {
            if (f == 0)
                printf("No Salary found");
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