#include <stdio.h>

int sum(int n1, int n2);
int keyCheck(char key);

int main()
{
    int n1, n2;
    char key;

    printf("\nEnter the first number: ");
    scanf("%d", &n1);

    printf("\nEnter the second number: ");
    scanf("%d", &n2);
    printf("\nPress the third button (ENTER) : ");
    getchar();
    scanf("%c", &key);

    if (keyCheck(key) == 1)
    {
        if (sum(n1, n2) == 0)
            printf("0-PROXYCITY\n");
        else if (sum(n1, n2) == 1)
            printf("1-DNSUEY!\n");
        else if (sum(n1, n2) == 2)
            printf("2-P.Y.N.G.\n");
        else if (sum(n1, n2) == 3)
            printf("3-SERVERS\n");
        else if (sum(n1, n2) == 4)
            printf("4-CRIPTONIZE\n");
        else if (sum(n1, n2) == 5)
            printf("5-HOST!\n");
        else if (sum(n1, n2) == 6)
            printf("6-OFFLINEDAY\n");
        else if (sum(n1, n2) == 7)
            printf("7-SALT\n");
        else if (sum(n1, n2) == 8)
            printf("8-ANSWER!\n");
        else if (sum(n1, n2) == 9)
            printf("9-RAR?\n");
        else if (sum(n1, n2) == 10)
            printf("10-WIFI ANTENNAS\n");
    }
}

int sum(int n1, int n2)
{
    return n1 + n2;
}

int keyCheck(char key)
{
    if (key == 0x0A)
        return 1;
    else
        return 0;
}