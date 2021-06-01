#include <stdio.h>

struct car
{
    int car_id;
    char brand_name[15];
    int model;
};
void print(struct car info[], int n)
{
    int i;
    FILE *otp = fopen("caroutput.txt", "a");
    for (i = 0; i < n; i++)
    {
        fprintf(otp, "\nID : %d \n Name : %s \n Model : %d ", info[i].car_id, info[i].brand_name, info[i].model);
    }
    fclose(otp);
}
int latestModel(struct car info[], int n)
{
    int i, p;
    FILE *otp = fopen("caroutput.txt", "a");
    int latest = info[0].model;
    for (i = 0; i < n; i++)
    {
        if (latest < info[i].model)
        {
            latest = info[i].model;
            p = i;
        }
    }
    fprintf(otp, "\n========================");
    fprintf(otp, "\nLatest Model :\n ID : %d \n Name : %s \n Model : %d", info[p].car_id, info[p].brand_name, info[p].model);
    fclose(otp);
}
int main()
{
    int i, n;
    int milestone1, milestone2;
    FILE *inp = fopen("carinput.txt", "r");
    FILE *otp = fopen("caroutput.txt", "w");
    if (inp == NULL)
    {
        printf("404 not found\n");
    }
    fscanf(inp, "%d", &n);
    struct car info[n];

    for (i = 0; i < n; i++)
    {
        fscanf(inp, "%d \t %s \t %d \n", &info[i].car_id, info[i].brand_name, &info[i].model);
    }
    print(info, n);
    latestModel(info, n);
    fclose(inp);
    fclose(otp);
    return 0;
}

/*Declare a structure car with attributes car_id, brand_name(Toyota, Nissan etc.), 
model(2016, 2018  etc.), mileage(value in the range 0‐200 denoting thousands of miles).
Write a program to  
   Take five cars’ information as input.  
   Print all four attributes of the car which is the latest model. 
   Take a mileage range as input from user. Find the car_id of all cars within that mileage  range. 
Note: All inputs must be taken from a file “input.txt” and all outputs must be sent to a file “output.txt”. 
You must submit the source code, the input file and the output file.*/