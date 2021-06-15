#include <stdio.h>
struct Soldier
{
    char id[10];
    int age;
    float weight;
};
void takeInput(struct Soldier info[], int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        scanf("%s", info[i].id);
        scanf("%d", &info[i].age);
        scanf("%f", &info[i].weight);
    }
}

int main()
{
    int i, n;
    printf("Enter  how many member: ");
    scanf("%d", &n);
    struct Soldier soldier1[n];

    takeInput(soldier1, n);
    for (i = 0; i < n; i++)
    {
        printf("ID : %s\n", soldier1[i].id);
        printf("Age: %d\n", soldier1[i].age);
        printf("Weight: %.0f\n", soldier1[i].weight);
    }
    return 0;
}
