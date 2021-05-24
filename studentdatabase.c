#include <stdio.h>
#include <string.h>
#include <stdlib.h>
//chayon
struct student
{
    char name[20];
    char id[11];
    float arr[3][4];
    float cgpa;
};
void print(struct student st[], int n)
{
    int i, j, k;
    FILE *otp = fopen("output.txt", "a");//chayon
    for (i = 0; i < n; i++)
    {
        fprintf(otp, "-------------------------------------------\n");
        fprintf(otp, "Student %d : \nName : %s \nID: %s\n", i + 1, st[i].name, st[i].id);
        //Chayon
        for (j = 0; j < 3; j++)
        {
            fprintf(otp, "Subject %d marks: ", j + 1);
            for (k = 0; k < 4; k++)
            {
                fprintf(otp, "%.2f ", st[i].arr[j][k]);
            }
            fprintf(otp, "\n");
        }
        fprintf(otp, "CGPA : %.2f\n", st[i].cgpa);
    }

    fclose(otp);
}
void printtotal(struct student st[], int n)
{
    int i, j, k = 0;
    FILE *otp = fopen("output.txt", "a");
    float t[2];
    for (i = 0; i < n; i++)
    {
        fprintf(otp, "-------------------------------------------\n");
        fprintf(otp, "Student %d\n", i + 1);
        for (j = 0; j < 3; j++)
        {
            t[j] = st[i].arr[j][k] + st[i].arr[j][k + 1] + st[i].arr[j][k + 2] + st[i].arr[j][k + 3];
            fprintf(otp, "Subject %d total =  %.2f", j + 1, t[j]);
            fprintf(otp, "\n");
        }
        fprintf(otp, "-------------------------------------------\n");
    }
    fclose(otp);
}
int maxCGPA(struct student st[], int n)
{
    int i;
    FILE *otp = fopen("output.txt", "a");
    float max = st[0].cgpa;
    float min = st[0].cgpa;
    for (i = 1; i < n; i++)
    {

        if (max < st[i].cgpa)
        {
            max = st[i].cgpa;
        }
        if (min > st[i].cgpa)
        {
            min = st[i].cgpa;
        }
    }
    fprintf(otp, "-------------------------------------------\n");
    fprintf(otp, "Maximum score = %.2f\n", max);
    fprintf(otp, "Minimum score = %.2f\n", min);
    fprintf(otp, "-------------------------------------------\n");
    fclose(otp);
}
int main()
{
    FILE *inp = fopen("input.txt", "r");
    FILE *otp = fopen("output.txt", "w");
    if (inp == NULL)
    {
        printf("404 not found\n"); //chayon
    }
    int n;
    fscanf(inp, "%d", &n);

    struct student st[n];
    int i, j, k;
    for (i = 0; i < n; i++)
    {
        fscanf(inp, "%s\n", st[i].name);
        fscanf(inp, "%s\n", st[i].id);
        for (j = 0; j < 3; j++)
        {
            for (k = 0; k < 4; k++)
            {
                fscanf(inp, "%f \t", &st[i].arr[j][k]);
            }
        }
        fscanf(inp, "%f", &st[i].cgpa);
    }
    print(st, n);
    maxCGPA(st, n);
    printtotal(st, n);
    fclose(inp);
    fclose(otp);
    return 0;
}