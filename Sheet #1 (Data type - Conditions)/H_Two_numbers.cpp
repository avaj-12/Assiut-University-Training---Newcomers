#include <bits/stdc++.h>
#include <cmath>
using namespace std;
int main()
{

    double a, b;
    cin >> a >> b;

    cout << "floor " << a << " / " << b << " = " << floor(a / b) << "\n";
    cout << "ceil " << a << " / " << b << " = " << ceil(a / b) << "\n";
    cout << "round " << a << " / " << b << " = " << round(a / b);

    return 0;
}