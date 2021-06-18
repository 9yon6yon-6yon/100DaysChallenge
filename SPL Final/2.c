#include <stdio.h>
#include <string.h>
int main()
{
    int a = 3036 % 8;//id 
    printf("%d",a);
    char str1[50] = "011203036";
    char arr[4][20] = {"is truthful",
                       "is honest",
                       "is friendly",
                       "is brave",
                       "is trustworthy",
                       "is straightforward",
                       "is simple",
                       "is dependable"};
    strcat(str1, "-"); //concating 011202154 + -s
    puts(str1);
    printf("\n");
    strcat(str1, arr[a]); //concating  str1 and arr value is friendly
    puts(str1);
    printf("\n");
    strcpy(str1, strstr(str1, "s ")); //find s in str1 then copying the value from s to '\0' in str1
    puts(str1);
    printf("\n");
    return 0;
}