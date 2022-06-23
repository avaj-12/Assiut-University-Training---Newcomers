#include <bits/stdc++.h>

using namespace std;
int main()
{

    int a;
    cin >> a;

    while (a >= 10)
        a /= 10;

    // cout << a;

    if (a % 2 == 1)
        cout << "ODD";
    else
        cout << "EVEN";

    return 0;
}