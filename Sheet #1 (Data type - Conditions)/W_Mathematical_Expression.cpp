#include <bits/stdc++.h>
#define Ashwin                        \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);
using namespace std;
int main()
{
    Ashwin;

    int a, b, c;
    char d, e;
    cin >> a >> d >> b >> e >> c;
    int sum = a + b;
    int diff = a - b;
    int prod = a * b;
    if (d == '+')
    {
        if (a + b == c)
        {
            cout << "Yes";
        }
        else
        {
            cout << sum;
        }
    }
    else if (d == '-')
    {
        if (a - b == c)
        {
            cout << "Yes";
        }
        else
        {
            cout << diff;
        }
    }
    else
    {
        if (a * b == c)
        {
            cout << "Yes";
        }
        else
        {
            cout << prod;
        }
    }

    return 0;
}