#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, b;

    while (cin >> a >> b)
    {
        if (a <= 0 || b <= 0)
            break;
        else
        {
            int min = 0, max = 0, sum = 0;

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

            for (int i = min; i <= max; i++)
            {
                sum += i;
            }
            for (int i = min; i <= max; i++)
            {
                cout << i << " ";
            }
            cout << "sum"
                 << " =" << sum;

            cout << "\n";
        }
    }

    return 0;
}