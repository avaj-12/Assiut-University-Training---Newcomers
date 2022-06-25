#include <bits/stdc++.h>

using namespace std;
int main()
{

    int n, j;
    cin >> n;

    string ans = "yes";

    for (int i = 2; i <= n; i++)
    {
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                ans = "no";
                break;
            }
            else
            {
                ans = "yes";
            }
        }
        if (ans == "yes")
            cout << i << " ";
    }

    return 0;
}