#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n, row = 1;
    cin >> n;

    while (n > 0)
    {
        for (int i = 1; i < n; i++)
        {
            cout << " ";
        }
        for (int j = 1; j <= row; j++)
        {
            cout << "*";
        }

        row += 2;
        n--;
        cout << "\n";
    }

    return 0;
}