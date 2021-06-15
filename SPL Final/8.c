#include <stdio.h>
int main()
{
    int i, count = 0;
    char sentence[100];
    printf("Enter a sentence : ");
    gets(sentence);
    for (i = 0; sentence[i] != '\0'; i++)
    {
        if (sentence[i] >= 'A' && sentence[i] <= 'Z')
        {
            count++;
        }
    }
    if (count % 2 == 1)
    {
        printf(" Bejoy Munshi\n");
    }
    else
        printf(" 011202154\n");
    return 0;
}