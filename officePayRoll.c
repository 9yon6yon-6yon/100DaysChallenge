#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int f = 0;
struct Employee
{
    char name[20];
    char phoneNo[11];
    float salary;
};
int takeEmployeesInfoFromKeyboard(struct Employee info[], int n)
{

    int i;
    for (i = 0; i < n; i++)
    {
        printf("\n Enter name of employee -\t");
        scanf("%s", info[i].name);
        printf("\n Enter Phone No of employee -\t");
        scanf("%s", info[i].phoneNo);
        printf("\n Enter salary of employee -\t");
        scanf("%f", &info[i].salary);
    }
    f = 1;
    return f;
}
void searchAnEmployee(struct Employee info[], int n, char phno[])
{
    int i, found = 0;
    if (f == 0)
        printf("\n =========== Not Found(e.g. Enter 'r') ===========\n");
    else

    {

        for (i = 0; i < n; i++)
        {

            if (atoi(info[i].phoneNo) == atoi(phno)) //atoi to convert string into int
            {
                printf("\n Name : %s\n Phone NO :%s\n Salary : %.2f\n", info[i].name, info[i].phoneNo, info[i].salary);
                break;
            }
        }
    }
}
void displayAllEmployeesInfoReverse(struct Employee info[], int n)
{
    int i;
    printf(" Employee Name  -  Employee Phone No  -  Salary\n");
    for (i = n - 1; i >= 0; i--)
    {
        printf(" %s\t\t%s\t\t%.2f\n", info[i].name, info[i].phoneNo, info[i].salary);
    }
}
int main()
{
    int n, f = 0;
    char ch;
    char phone[11];
    printf("Enter the number of employees... ");
    scanf("%d", &n);
    struct Employee info[n];

    printf("\n =======Office Pay Roll System=======\n");
    printf("🔹Enter 'r', to take information of all employee into the Employee structure array of size N.\n");
    printf("🔹Enter 's', to search an employee by phone no.\n");
    printf("🔹Enter 't', to display the information of all the employees in reverse index order in a tabular format.\n");
    printf("🔹Enter 'q', to quit/exit the menu ssystem\n");

    while (1)
    {
        getchar();
        printf("\n Enter your choice: ");
        scanf("%c", &ch);

        if (ch == 'q')
            break;

        switch (ch)
        {
        case 'r':
        {
            takeEmployeesInfoFromKeyboard(info, n);
            break;
        }
        case 's':
        {
            printf("\n Enter Phone No :");
            scanf("%s", phone);
            searchAnEmployee(info, n, phone);
            break;
        }
        case 't':
        {
            displayAllEmployeesInfoReverse(info, n);
            break;
        }

        default:
        {
            puts(" \t"
                 "Invalid Input"
                 "\n ");
            break;
        }
        }
    }
    return 0;
}
