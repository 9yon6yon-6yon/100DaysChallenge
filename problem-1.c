#include <stdio.h>

int main()
{
    char string[80];
    char string2[20];
    char ch[80];
    int k = 0, L = 0, i, j, count;

    gets(string);
    gets(string2);

    while (string[k] != '\0')
        k++;
    k--;

    while (string2[L] != '\0')
        L++;
    L--;

    for (i = 0; i <= k - L; i++)
    {
        for (j = i; j < i + L; j++)
        {
            count = 1;
            if (ch[j] = tolower(string[j]) != string2[j - i])
            {
                count = 0;
                break;
            }
        }
        if (count == 1)
        {
            break;
        }
    }
    if (count == 1)
    {
        printf("\nSubstring.\n\n");
    }
    else
    {
        printf("\nNot Substring. \n\n");
    }

  return 0;
}
