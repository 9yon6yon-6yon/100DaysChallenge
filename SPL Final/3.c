#include <stdio.h>
int main()
{
    int sum = 0, a = 2013 % 7, num[4];
    FILE *fp = fopen("finalinput.txt", "w"); //creating a file name input.txt in write mode
    fprintf(fp, "% s\n", "Good Morning");    //print Good Morning and a new line in input.txt
    for (int i = 0; i < 5; i++)
    {
        num[i] = 2 * i + a; //in num array sending value for 5 time and each time with different value as num[0]=5
        //num[1]= 7
        //num[2]= 9
        //num[3]= 11
        //num[4]= 13
    }
    for (int i = 0; i < 4; i++)
    {
        sum += num[i]; //sum = sum+num[0]
        //sum =0+5=5
        //sum = 5+7=12
        //sum = 12+9=21
        //sum = 21+11=32
        fprintf(fp, "% d\n", num[i]); //printing sum value in input.txt file
    }
    fprintf(fp, "% d", sum); //printing the sum value after calculating the array num values for 4 time sum =32
    fclose(fp);              //closing file
    return 0;
}