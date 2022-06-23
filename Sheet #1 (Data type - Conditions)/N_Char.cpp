#include <bits/stdc++.h>

using namespace std;
int main()
{
    char c;
    cin >> c;

    int a = c;

    if (a < 97)
        a = a + 32;
    else
        a = a - 32;

    cout << char(a);

    return 0;
}