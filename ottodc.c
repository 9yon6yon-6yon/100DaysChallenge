#include<stdio.h>

int OctToDec(int oct)
{
    int rem, dec=0, mul=1;
    while(oct!=0)
    {
        rem = oct%10;
        dec = dec + (rem*mul);
        mul = mul*8;
        oct = oct/10;
    }
    return dec;
}
int main()
{
    int oct_num, dec_num=0, rem, mul=1;
    printf("Enter any Octal Number: ");
    scanf("%d", &oct_num);
    dec_num = OctToDec(oct_num);
    printf("Decimal Value = %d\n", dec_num);
    return 0;
}
