#include <stdio.h>

void main()
{
    int i, j, rows;
    printf (" Enter a number to define the rows: \n ");
    scanf("%d", &rows);
    printf("\n");
    for (i = rows; i > 0; i--)
    {
        for (j = i; j > 0; j--)
        {


  if((i+j)%2==1){
     printf("0");
  }
  else{
      printf("1");
  }
}
printf("\n");
    }
    return 0;
}
