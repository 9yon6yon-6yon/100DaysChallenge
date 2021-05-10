#include <stdio.h>
#include <string.h>

void main()
{
    char str[100];
    int i;

    

    printf("Input the string : ");
    fgets(str, sizeof str, stdin);
    for (i = 0; i < strlen(str); i += 2)
    {
         if(str[i] >= 'a' && str[i] <= 'z') {
         str[i] = str[i] -32;}
        printf("%c",str[i]);
           
    }

   
}