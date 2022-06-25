#include <bits/stdc++.h>
using namespace std;
int main()
{

    string s;
    cin >> s;
    int n;
    cin >> n;
    int num[n];
    for (int i = 0; i < n; i++)
    {
        cin >> num[i];
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < num[i]; j++)
        {
            cout << s;
        }
        cout << "\n";
    }

    return 0;
}