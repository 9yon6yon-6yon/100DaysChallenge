#include <stdio.h>
float avarage = 0.0;
struct Employee
{
    char name[20];
    char phoneNo[11];
    float salary;
};
void takeEmployeesInfoFromKeyboard(struct Employee einfo[], int n)
{

    int i;
    for (i = 0; i < n; i++)
    {
        printf("\n Employee info %d : ", i + 1);
        printf("\n Enter name of employee -\t");
        scanf("%s", einfo[i].name);
        printf(" Enter Phone No of employee -\t");
        scanf("%s", einfo[i].phoneNo);
        printf(" Enter salary of employee -\t");
        scanf("%f", &einfo[i].salary);
    }
}
int computeAverageSalary(struct Employee einfo[], int n)
{
    int i;
    float total = 0.0;
    for (i = 0; i < n; i++)
    {

        total += einfo[i].salary;
    }
    avarage = total / n;

    return avarage;
}

void findAboveAvgSalariedEmployees(struct Employee einfo[], int n)
{
    int i;
    printf(" Employee Name  –  Employee Phone No  –  Salary\n");
    for (i = 0; i < n; i++)
    {
        if (einfo[i].salary > avarage)
        {
            printf(" %s\t\t%s\t\t%.2f\n", einfo[i].name, einfo[i].phoneNo, einfo[i].salary);
        }
    }
}
int main()
{
    int N;
    char choice;
    printf("Enter the number of employees... ");
    scanf("%d", &N);
    struct Employee einfo[N];
    printf("\n ======= Office Pay Roll System =========\n");
    printf("🔹Enter 'a', to take information of all employee into the Employee structure array of size N.\n");
    printf("🔹Enter 'b', to compute and display the average salary of all the employees.\n");
    printf("🔹Enter 'c', to display the info of all the employees who have above average salary.\n");
    printf("🔹Enter 'q', to quit/exit the menu ssystem\n");

    while (1)
    {
        getchar();
        printf("\n Enter your choice: ");
        scanf("%c", &choice);

        if (choice == 'q')
            break;

        switch (choice)
        {

        case 'a':
        {
            takeEmployeesInfoFromKeyboard(einfo, N);
            break;
        }
        case 'b':
        {
            computeAverageSalary(einfo, N);
            printf(" Avarage of the salaries of all employees  = %.2f", avarage);

            break;
        }
        case 'c':

        {
            findAboveAvgSalariedEmployees(einfo, N);
            break;
        }

        default:
        {
            printf(" Invalid Input. \n ");
            break;
        }
        }
    }
    return 0;
}
/*You will extend the assignment one. Here is the description.

(a)(i) Create an Employee structure that will have the following members: name (string type), phoneNo (string type), and a salary (float type).

(ii) In the main function, create an array of size N of Employee structure type. This array will be used by all the functions. You will pass this array and # of employees as arguments to the functions.

(b) Create a function “takeEmployeesInfoFromKeyboard” that takes an Employee structure array and the size of the array as parameters. It takes information of all the Employees from keyboard and stores in the Employee structure array. Do you know that arrays are passed by reference?

(c) Create a function “computeAverageSalary” that takes an Employee structure array and the size of the array as parameters. It computes and returns the average of the salaries of all the employees.

(d) Create a function “findAboveAvgSalariedEmployees” that takes an Employee structure array and the size of the array as parameters. It finds all the employees who have higher than average salary and displays their information in a tabular format with following values (including the given column heading):

Employee Name – Employee Phone No - Salary

         ?                          ?                              ?     

(e) Write other necessary code to create the following menu system similar to assignment one. The following menu will always be displayed except if exited by pressing ‘q’.

 

======= Office Pay Roll System =========

• Enter ‘a’, to take information of all the employees into the Employee structure array of size N.

• Enter ‘b’, to compute and display the average salary of all the employees.

• Enter ‘c’, to display the info of all the employees who have above average salary.

• Enter ‘q’, to quit/exit the menu system.

• For any other input, display “Invalid Input.”

After the menu is displayed, the program will prompt the user “Enter your choice: “ to enter a choice from the menu. After user enters his choice, using switch case the program will call appropriate functions to do the task.*/