#include<stdio.h>

int main()
{
    int i,j,r1,c1,n,sum=0;

    printf("Enter the value of N : ");
    scanf("%d",&n);

    int A[n][n];

    printf("\n");

    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < n; j++)
        {
            scanf("%d",&A[i][j]);
        }
        printf("\n");
    }


    for ( i = 0; i < n; i++)
    {

        for ( j = 0; j < n; j++)
        {

            if(i%2!=0 || j%2!=0)
            {
                sum+=A[i][j];
            }
        }
    }

    printf("%d",sum);

    
}

