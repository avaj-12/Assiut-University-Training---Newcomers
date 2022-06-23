#include <bits/stdc++.h>

using namespace std;
int main()
{
    // fast_I_O();

    int a, b, c;
    cin >> a >> b >> c;

    int a1 = a, b1 = b, c1 = c;

    if (a > b)
        swap(a, b);
    if (a > c)
        swap(a, c);
    if (b > c)
        swap(b, c);

    cout << a << "\n"
         << b << "\n"
         << c << "\n";
    cout << "\n"
         << a1 << "\n"
         << b1 << "\n"
         << c1 << "\n";

    return 0;
}