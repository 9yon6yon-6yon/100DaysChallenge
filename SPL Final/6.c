#include <stdio.h>
#include <string.h>
int main()
{
    int i, j;
    char sentence[100], id[10];
    printf("Enter sentence : ");
    gets(sentence);
    printf("Enter id : ");
    gets(id);
    for (i = 0; sentence[i] != '\0'; i++)
    {

        if (i == 0)
        {
            if ((sentence[i] >= 'a' && sentence[i] <= 'z'))
                sentence[i] = sentence[i] - 32;
            continue;
        }
        if (sentence[i] == ' ')
        {

            ++i;
            if (sentence[i] >= 'a' && sentence[i] <= 'z')
            {
                sentence[i] = sentence[i] - 32;
                continue;
            }
        }
        else
        {

            if (sentence[i] >= 'A' && sentence[i] <= 'Z')
                sentence[i] = sentence[i] + 32;
        }
    }
    strcat(sentence, id);
    puts(sentence);
    return 0;
}