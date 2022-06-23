#include <bits/stdc++.h>

using namespace std;
int main()
{

    double d;
    cin >> d;

    if (d - (int)d == 0)
        cout << "int " << (int)d;
    else
        cout << "float " << (int)d << " " << d - (int)d;

    return 0;
}