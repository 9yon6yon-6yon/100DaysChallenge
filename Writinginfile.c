#include <stdio.h>
//#include <stdlib.h>
int main()
{
    char a[100];
    
    FILE *file = fopen("WritingtFile.txt", "w");
    if (file == NULL)
    {
        printf("Error!");
        return 0;
    }
    int i;
    for (i = 0; i < 10; i++)
    {

        printf("Enter String values %d :", i + 1);
         fgets(a, sizeof(a), stdin);

        fprintf(file, "%s",a);
    }

    fclose(file);

    return 0;
}