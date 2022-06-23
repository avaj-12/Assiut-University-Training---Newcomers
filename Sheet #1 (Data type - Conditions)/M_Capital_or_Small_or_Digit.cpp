#include <bits/stdc++.h>

using namespace std;
int main()
{

    char c;
    cin >> c;

    int a = c;
    // cout << a;

    if (a >= 48 && a < 65)
        cout << "IS DIGIT";
    else if (a >= 65 && a < 97)
        cout << "ALPHA"
             << "\n"
             << "IS CAPITAL";
    else
        cout << "ALPHA"
             << "\n"
             << "IS SMALL";

    return 0;
}