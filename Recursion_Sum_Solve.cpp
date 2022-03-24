#include <bits/stdc++.h>

using namespace std;
int sum = 0;
int recursive_sum(int n, int i, int j, int k)
{

    if (n == 0)
        return i * j * k;
    int calc = i * j * k;
    cout << calc << " + ";
    sum += calc;

    return recursive_sum(n - 1, i * 2, j + 2, k - 1);
}
int main()
{

    int n;
    cin >> n;
    recursive_sum(n, 2, 3, 4);
    cout << " = " << sum << endl;
    return 0;
}