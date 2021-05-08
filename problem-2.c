#include <stdio.h>

int main()
{

    int row,col,n,input;

    scanf("%d",&input);

    if(input%2==0)
    {
        printf("Enter Odd number");
    }
    else
    {
        n=input;
        int mid=n/2+1;
        for(row=1; row<=n/2; row++)
        {
            for(col=1; col<=n; col++)
            {
                if(col==mid || col==mid-(row-1) || col==mid+(row-1))
                {
                    printf("$");
                }
                else
                {
                    printf("_");
                }
            }
            printf("\n");
        }

        for(row=1; row<=n; row++)
        {
            printf("$");
        }
        printf("\n");

        for(row=n/2; row>=1; row--)
        {
            for(col=1; col<=n; col++)
            {
                if(col==mid || col==mid-(row-1) || col==mid+(row-1))
                {
                    printf("$");
                }
                else
                {
                    printf("_");
                }
            }
            printf("\n");
        }

    }

    return 0;
}


