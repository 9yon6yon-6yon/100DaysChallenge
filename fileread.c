#include <stdio.h>

int main()
{

    FILE *file = fopen("FirstFile.txt", "r");
    if (file == NULL)
    {
        printf("1.Error Opening file\n");
        FILE *file = fopen("FirstFile.txt", "w");
        if (file != NULL)
            printf("File Created successfully\n");

        else
            printf("2.Error Opening File\n");
    }
  

    fclose(file);

    return 0;
}