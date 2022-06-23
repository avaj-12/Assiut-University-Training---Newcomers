#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n, ev = 0, odd = 0, po = 0, ne = 0;
    cin >> n;
    int num[n];
    for (int i = 0; i < n; i++)
    {
        cin >> num[i];
        if (num[i] % 2 == 0)
        {
            ev++;
        }
        if (num[i] % 2 != 0)
        {
            odd++;
        }
        if (num[i] > 0)
        {
            po++;
        }
        if (num[i] < 0)
        {
            ne++;
        }
    }
    cout << "Even: " << ev << "\n";
    cout << "Odd: " << odd << "\n";
    cout << "Positive: " << po << "\n";
    cout << "Negative: " << ne << "\n";

    return 0;
}