#include <bits/stdc++.h>

using namespace std;
int main()
{
    int n, rev = 0, temp;
    cin >> n;

    int num = n;
    do
    {
        temp = num % 10;
        rev = rev * 10 + temp;
        num /= 10;
    } while (num != 0);
    cout << rev << "\n";

    if (rev != n)
        cout << "NO";
    else
        cout << "YES";

    return 0;
}