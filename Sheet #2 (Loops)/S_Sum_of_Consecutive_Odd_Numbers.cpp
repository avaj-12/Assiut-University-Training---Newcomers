#include <bits/stdc++.h>

using namespace std;
int main()
{

    int t;
    cin >> t;
    while (t--)
    {
        int a, b;
        cin >> a >> b;

        int min = 0, max = 0, odd = 0;

        if (a > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        if (min % 2 == 1)
            min += 1;
        for (int i = min; i < max; i++)
        {
            if (i % 2 == 1)
                odd += i;
        }
        cout << odd << "\n";
    }
    return 0;
}