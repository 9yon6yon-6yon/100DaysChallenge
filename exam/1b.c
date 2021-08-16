#include <stdio.h>

int main()
{
    int i, j;
    for(i=8;i>=4;i--)
    {
        for(j=8;j>=i;j--)
        {
            printf("%d",i);
        }
        printf("\n");
    }

    return 0;
}
//