#include <bits/stdc++.h>
using namespace std;
int main()
{

    long long int t;
    cin >> t;

    while (t--)
    {
        long long int n;
        cin >> n;

        if (n == 0)
        {
            cout << 0 << "\n";
        }
        else
        {
            while (n > 0)
            {
                int temp = n % 10;
                cout << temp << " ";
                n = n / 10;
            }
            cout << "\n";
        }
    }
    return 0;
}