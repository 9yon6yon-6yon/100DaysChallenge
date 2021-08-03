#include <stdio.h>

int main()
{

    int array[] = {5, 8, 0, 1, 2, 4, 7, 5, 8, 8, 6, 5, 3, 2, 1};

    int length = sizeof(array) / sizeof(array[0]);
    int temp;

    for (int i = 0; i < length; i++)
    {
        for (int j = i + 1; j < length; j++)
        {
            if (array[i] > array[j])
            {

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    int frequent[length];
    int visited = -1;

    for (int i = 0; i < length; i++)
    {
        int count = 1;
        for (int j = i + 1; j < length; j++)
        {
            if (array[i] == array[j])
            {
                count++;

                frequent[j] = visited;
            }
        }
        if (frequent[i] != visited)
            frequent[i] = count;
    }

    printf("The frequents of the numbers are : ");

    for (int i = 0; i < length; i++)
    {
        if (frequent[i] != visited)
        {

            printf("  %d", frequent[i]);
        }
    }
    printf("\n");

    return 0;
}