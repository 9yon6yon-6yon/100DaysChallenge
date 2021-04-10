#include<stdio.h>
int main(){
    int n;
    int i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        if(i%2==1)
        printf("%d ",i);
        else continue;
    }



    return 0;
}