#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n;
    cin >> n;
    int num[n];
    for (int i = 0; i < n; i++)
    {
        cin >> num[i];
    }

    sort(num, num + n);

    cout << num[n - 1];

    return 0;
}