#include <stdio.h>
#include <stdlib.h>
#include<string.h>

int main()
{
    char val;

    FILE *fp1 = fopen("/media/thebird/user/rockyou.txt", "r");
    if (fp1 == NULL)
    {
        printf("Error Opening File\n");
    }
    scanf("%s",&val);
    while (fp1!=EOF)
    {
        if(val);
    }

    //FILE *fp2=fopen();
    fclose(fp1);
    //fclose(fp2);

    return 0;
}