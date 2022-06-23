#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n;
    cin >> n;
    int a = n / 365;
    cout << a << " years"
         << "\n";
    int b = (n % 365) / 30;
    cout << b << " months"
         << "\n";
    int c = (n % 365) % 30;
    cout << c << " days"
         << "\n";

    return 0;
}