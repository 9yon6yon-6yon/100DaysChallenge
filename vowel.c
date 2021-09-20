#include <stdio.h>
#include <string.h>

int main()
{
    int a = 0, e = 0, I = 0, o = 0, u = 0;
    char str[50];
    printf("Enter a string: ");
    fgets(str, 49, stdin);
    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] == 'a' || str[i] == 'A')
        {
            a++;
        }
        if (str[i] == 'e' || str[i] == 'E')
        {
            e++;
        }
        if (str[i] == 'i' || str[i] == 'I')
        {
            I++;
        }
        if (str[i] == 'o' || str[i] == 'O')
        {
            o++;
        }
        if (str[i] == 'u' || str[i] == 'U')
        {
            u++;
        }
    }
    printf("a: %d\ne: %d\ni: %d\no: %d\nu: %d\n", a, e, I, o, u);
    return 0;
}