#include <stdio.h>
#include <stdlib.h>

int main()
{

    char c;
    int count;
    FILE *fp1 = fopen("FileOne.txt", "r");//you have to define yourself which file you want to copy and where..you can edit your text as you like
    if (fp1 == NULL)
    {
        printf("Better Luck Next TIME\nFile Does not EXISTS\n");
    }
    FILE *fp2 = fopen("FileTwo.txt", "w");

    if (fp1 == NULL || fp2 == NULL)
    {
        printf("What do you think you are doing.... Go and create file and try to give it something\nYou fool the file doesn't exits\n");
        return 1;
    }
    c = fgetc(fp1);
    while (c != EOF)
    {
        fputc(c, fp2);
        count++;
        c=fgetc(fp1);
    }
    
    printf("File copied Successfull\n%d lines/files were copied\n",count);

    fclose(fp1);
    fclose(fp2);

    return 0;
}