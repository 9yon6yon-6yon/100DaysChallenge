#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct student_marks
{
    char id[10];
    int bangla;
    int english;
    int math;
};

float calc_grade(int Mark)
{
    float Grade;
    if (Mark <= 100 && Mark >= 80)
        Grade = 4.00;

    else if (Mark < 80 && Mark >= 75)
        Grade = 3.75;

    else if (Mark < 75 && Mark >= 70)
        Grade = 3.50;

    else if (Mark < 70 && Mark >= 65)
        Grade = 3.25;

    else if (Mark < 65 && Mark >= 60)
        Grade = 3.00;

    else if (Mark < 60 && Mark >= 55)
        Grade = 2.75;

    else if (Mark < 55 && Mark >= 50)
        Grade = 2.50;

    else if (Mark < 50 && Mark >= 45)
        Grade = 2.25;

    else if (Mark < 45 && Mark >= 40)
        Grade = 2.00;

    else
        Grade = 0;

    return Grade;
}

void make_gradesheet(struct student_marks X)
{
    char fileName[13];
    strcpy(fileName, X.id);
    strcat(fileName, ".txt");
    FILE *f = fopen(fileName, "a");
    fprintf(f, "Student ID : %s\n", X.id);
    fprintf(f, "Bangla     : %d (%.2f)\n", X.bangla, calc_grade(X.bangla));
    fprintf(f, "English    : %d (%.2f)\n", X.english, calc_grade(X.english));
    fprintf(f, "Math       : %d (%.2f)\n", X.math, calc_grade(X.math));
}

int main()
{
    FILE *fp = fopen("marks.txt", "r");
    if (fp == NULL)
    {
        printf("file does not exist\n");
        exit(0);
    }
    else
    {
        int n;
        fscanf(fp, "%d", &n);
        for (int i = 0; i < n; ++i)
        {
            struct student_marks s;
            fscanf(fp, "%s\t\t  %d\t\t %d\t\t %d", s.id, &s.bangla, &s.english, &s.math);
            make_gradesheet(s);
        }
    }
    fclose(fp);
    return 0;
}
