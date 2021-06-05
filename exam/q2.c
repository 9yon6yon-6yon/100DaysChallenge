#include <stdio.h>
struct student
{
    int id;
    char name[20];
    int age;
    int iq;
};
int main()
{
    int n;
    int max;
    FILE *inp = fopen("input.txt", "r");
    FILE *otp = fopen("output.txt", "w");
    if (inp == NULL)
    {
        printf("404 not found\n");
    }
    fscanf(inp, "%d\n", &n);
    struct student st[n];

    int i;
    for (i = 0; i < n; i++)
    {
        fscanf(inp, "%s\t%d\t%d\t%d\n", st[i].name, &st[i].id, &st[i].age, &st[i].iq);
    }
    max = st[0].iq;
    int p = 0;
    for (i = 0; i < n; i++)
    {
        if (max < st[i].iq)
        {
            max = st[i].iq;
            p = i;
        }
    }

    fprintf(otp, "%s %d %d %d", st[p].name, st[p].id, st[p].age, st[p].iq);
    fclose(inp);
    fclose(otp);
}