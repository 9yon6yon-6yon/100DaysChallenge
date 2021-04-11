#include <stdio.h>
typedef struct
{
    char student_name[50];
    char student_id[15];
    float cgpa;
    float score;
} student;
void takeInputFromKeyboard(student info[], int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        printf("Enter name of student  -\t");
        getchar();
        fgets(info[i].student_name, 49, stdin);
        printf("Enter id of student    -\t");
        fgets(info[i].student_id, 49, stdin);
        printf("Enter cgpa of student  -\t");
        scanf("%f", &info[i].cgpa);
        printf("Enter score of student -\t");
        scanf("%f", &info[i].score);
        printf("\n-----------------------");
        printf("-----------------------\n");
    }
    getchar();
}
void average(student info[], int n)
{
    float sum = 0;
    int i;
    for (i = 0; i < n; i++)
    {
        sum += info[i].score;
    }
    sum = sum / n;
    printf("Average = %.2f\n", sum);
    puts("\n");
    getchar();
}
void computeMin(student info[], int n)
{
    int i;
    float minimum = info[0].score;
    for (i = 1; i < n; i++)
    {
        if (minimum > info[i].score)
        {
            minimum = info[i].score;
        }
    }
    printf("Minimum score = %.2f\n", minimum);
    puts("\n");
    getchar();
}
void countAsBsEtc(student info[], int n)
{
    int i, a = 0, b = 0, c = 0, d = 0, f = 0;
    for (i = 0; i < n; i++)
    {
        if (info[i].score >= 90)
            a++;
        else if (info[i].score <= 89 && info[i].score >= 80)
            b++;
        else if (info[i].score <= 79 && info[i].score >= 70)
            c++;
        else if (info[i].score <= 69 && info[i].score >= 60)
            d++;
        else
            f++;
    }
    printf("Number of students who got A: %d\n", a);
    printf("Number of students who got B: %d\n", b);
    printf("Number of students who got C: %d\n", c);
    printf("Number of students who got D: %d\n", d);
    printf("Number of students who got F: %d\n", f);
    puts("\n");
    getchar();
}
void displayValues(student info[], int n)
{
    int i;
    printf("Student Name\t-\tStudent Id\t-\tCGPA\t-\tScore\n\n");
    for (i = 0; i < n; i++)
    {
        printf(" %s\t\t %s\t\t %.2f \t\t %.2f\n",info[i].student_name,info[i].student_id,info[i].cgpa,info[i].score);
    }
    getchar();
}
int main()
{
    int i, n, size;
    printf("How many students: ");
    scanf("%d", &n);
    getchar();
    student info[n];
    char menu;
    printf("=====================\n");
    printf("        Menu       \n");
    printf("=====================\n");
    puts("***Enter Your Choice***\n\n");
    puts(">>>Enter 1, to take information of all the students from keyboard and stores in the array..\n");
    puts(">>>Enter 2, to compute and display the average of the scores of all the students..\n");
    puts(">>>Enter 3, to compute and display the min value of the scores of all the students..\n");
    puts(">>>Enter 4, to count the # of students who received A's, B's, C's, D's, F's separately and display all the 5 numbers..\n");
    puts(">>>Enter 5, to display the student information in a tabular format..\n");
    puts(">>>Enter q, to quit this menu.\n");

    while (1)
    {
        printf("\nEnter You choice: ");
        scanf("%c", &menu);

        switch (menu)
        {
        case '1':
            takeInputFromKeyboard(info, n);
            break;
        case '2':
            average(info, n);
            break;
        case '3':
            computeMin(info, n);
            break;
        case '4':
            countAsBsEtc(info, n);
            break;
        case '5':
            displayValues(info, n);
            break;
        case 'q':
            return 0;
        default:
            puts(" \t"
                 "Invalid Input"
                 "\n ");
            break;
        }
    }
    return 0;
}