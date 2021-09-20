#include <stdio.h>
#include <string.h>
void print_last(char str[], int n)
{
    for(int i=strlen(str)-n-1;i!=strlen(str);i++)
    printf("%c",str[i]);

}
int main()
{

    printf("Enter String : ");
    char str[20];
    fgets(str, 19, stdin);
    printf("Enter integer : ");
    int n;
    scanf("%d", &n);
    printf("The last %d characters of the string is : ", n);
    print_last(str, n);

    return 0;
}