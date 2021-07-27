#include <bits/stdc++.h>

using namespace std;

int count_sort(int arr[], int size)
{

    int max = *max_element(arr, arr + size);

    int count_array[max];

    for (int i = 0; i <= max; i++)
    {
        count_array[i] = 0;
    }

    for (int i = 0; i < size; i++)
    {
        count_array[arr[i]] = count_array[arr[i]] + 1;
    }

    int x = 0;
    int y = 0;

    while (x <= max)
    {

        if (count_array[x] > 0)
        {
            arr[y] = x;
            count_array[x]--;
            y++;
        }
        else
            x++;
    }
}

int main()
{

    int arr[] = {1, 12, 2, 6, 4, 0, 5, 11, 9, 12};

    int len = sizeof(arr) / sizeof(arr[0]);

    count_sort(arr, len);

    for (int i = 0; i < len; i++)
    {
        cout << arr[i] << " ";
    }
}