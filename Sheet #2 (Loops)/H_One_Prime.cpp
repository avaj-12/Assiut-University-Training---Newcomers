#include <bits/stdc++.h>

using namespace std;
int main()
{

    int n;
    cin >> n;
    int ans = 0;
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            ans = 1;
            break;
        }
        // ans = 1;
    }

    if (ans == 1)
        cout << "NO";
    else
        cout << "YES";

    return 0;
}