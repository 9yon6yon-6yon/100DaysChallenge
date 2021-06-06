#include <stdio.h>
#include <string.h>
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
            if (strcmp(info[i].phoneNo, phno) == 0)

            // if (atoi(info[i].phoneNo) == atoi(phno)) //atoi to convert string into int
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

/*
You will extend the assignment one. Here is the description.

(a)(i) Create an Employee structure that will have the following members: name (string type), phoneNo (string type), and a salary (float type).

(ii) In the main function, create an array of size N of Employee structure type. This array will be used by all the functions. You will pass this array and # of employees as arguments to the functions.

(b) Create a function “takeEmployeesInfoFromKeyboard” that takes an Employee structure array and the size of the array as parameters. It takes information of all the Employees from keyboard and stores in the Employee structure array. Do you know that arrays are passed by reference?

(c) Create a function “searchAnEmployee” that takes an Employee structure array, a phone number, and the size of the array as parameters. It finds and displays the employee’s information from the array searching by the phone number.

(d) Create a function “displayAllEmployeesInfoReverse” that takes an Employee structure array and the size of the array as parameters. It displays all employees’ information in reverse index order in a tabular format with following values (including the given column heading):

Employee  Name – Employee  Phone No - Salary

         ?                          ?                              ?     

(e) Write other necessary code to create the following menu system similar to assignment one. The following menu will always be displayed except if exited by pressing ‘q’.

 

======= Office Pay Roll System =========

• Enter ‘r, to take information of all the employee into the Employee structure array of size N.

• Enter ‘s’, to search an employee by phone no. If found, display the info of employee. If not, display “Not Found”.

• Enter ‘t’, to display the information of all the employees in reverse index order in a tabular format.

• Enter ‘q’, quit/exit the menu system. 

• For any other input, display “Invalid Input”

 

After the menu is displayed, the program will prompt the user “Enter your choice: “ to enter a choice from the menu. After user enters his choice, using switch case the program will call appropriate functions to do the task.*/


#include <stdio.h>
float Highest = 0.0;
struct Employee
{
    char name[20], phoneNo[12];
    float salary;
};
int main()
{
    int N;
    char choice;
    struct Employee e[N];
    printf("Enter the size of the array : ");
    scanf("%d", &N);
    printf("\n======= Office Pay Roll System =========\n");
    printf("Enter 'x', to take information of all employee into the Employee structure array of size N.\n");
    printf("Enter 'y', to find and display the info of employee with the highest salary.\n");
    printf("Enter 'z', to display the information of employees with less than half of the highest salary in tabular format.\n");
    printf("Enter 'q', to quit/exit the menu system\n");

    while (1)
    {
        getchar();
        printf("\nEnter your choice: ");
        scanf("%c", &choice);

        if (choice == 'q')
            break;

        switch (choice)
        {
        case 'x':
        {
            takeEmployeesInfoFromKeyboard(e, N);
            break;
        }
        case 'y':
        {
            findEmployeeWithHighestSalary(e, N);
            break;
        }
        case 'z':

        {
            displayAllEmployeesInfo(e, N);
            break;
        }

        default:
        {
            printf("Invalid Input. \n ");
            break;
        }
        }
    }
    return 0;
}
void takeEmployeesInfoFromKeyboard(struct Employee e[], int n)
{

    int i;
    for (i = 0; i < n; i++)
    {
        printf("\n Employee no %d : ", i + 1);
        printf("\n Enter name of employee - ");
        scanf("%s", e[i].name);
        printf(" Enter Phone No of employee - ");
        scanf("%s", e[i].phoneNo);
        printf(" Enter salary of employee - ");
        scanf("%f", &e[i].salary);
    }
}
int findEmployeeWithHighestSalary(struct Employee e[], int n)
{
    int i, position;
    Highest = e[0].salary;
    printf("\n Employee with highest salary :");
    for (i = 0; i < n; i++)
    {
        if (Highest < e[i].salary)
        {
            Highest = e[i].salary;
            position = i;
        }
    }
    printf("\n Name : %s\n Phone NO :%s\n Salary : %.2f\n", e[position].name, e[position].phoneNo, e[position].salary);
    return Highest;
}
void displayAllEmployeesInfo(struct Employee e[], int n)
{
    int i;
    double half = Highest / 2;
    printf("\n Employees’ information whose salary is less than half of the highest salary :");
    printf("\n Employee Name  –  Employee Phone No  –  Salary\n");
    for (i = 0; i < n; i++)
    {
        if (e[i].salary < half)
        {
            printf(" %s\t\t%s\t\t%.2f\n", e[i].name, e[i].phoneNo, e[i].salary);
        }
    }
}

/*(a)(i) Create an Employee structure that will have the following members: name (string type), phoneNo (string type), and a salary (float type).

(ii) In the main function, create an array of size N of Employee structure type. This array will be used by all the functions. You will pass this array and # of employees as arguments to the functions.

(b) Create a function “takeEmployeesInfoFromKeyboard” that takes an Employee structure array and the size of the array as parameters. It takes information of all the Employees from keyboard and stores in the Employee structure array. Do you know that arrays are passed by reference?

(c) Create a function “findEmployeeWithHighestSalary” that takes an Employee structure array and the size of the array as parameters. It finds and displays the employee’s information who has the highest salary.

(d) Create a function “displayAllEmployeesInfo” that takes an Employee structure array and the size of the array as parameters. It displays those Employees’ information whose salary is less than half of the highest salary in a tabular format with following values (including the given column heading):

Employee Name – Employee Phone No - Salary

         ?                          ?                              ?     

g) Write other necessary code to create the following menu system similar to assignment one. The following menu will always be displayed except if exited by pressing ‘q’.

 

======= Office Pay Roll System =========

• Enter ‘x’, to take information of all the employee into the Employee structure array of size N.

• Enter ‘y’, to find and display the info of employee with the highest salary.

• Enter ‘z’, to display the information of employees with less than half of the highest salary in tabular format.

• Enter ‘q’, quit/exit the menu system.

• For any other input, display “Invalid Input”

After the menu is displayed, the program will prompt the user “Enter your choice: “ to enter a choice from the menu. After user enters his choice, using switch case the program will call appropriate functions to do the task.*/