#include<stdio.h>
int main()
{
    int row,column,space,in,n,k,M_loop;

    printf("Enter the value of N: ");
    scanf("%d",&n);

    k=n;

    for(row=1;row<=n;row++)
    {
        for(column=1;column<=row;column++)
        {
            printf("*");
        }
        printf("\n");
    }
    for(M_loop=1;M_loop<=n-1;M_loop++)
    {
        for(row=1;row<=n;row++)
        {
            for(space=1;space<=k;space++)
            {
            printf("_");
            }
            for(column=1;column<=row;column++)
            {
            printf("*");
            }
            printf("\n");
            }

       k=k+n;
    }
    
    return 0;
}
