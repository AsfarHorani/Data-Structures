#include <iostream>

using namespace std;

int main()
{
    int *pi;
    int s=7;
    pi=&s;

    cout << *pi << endl;

      cout << pi << endl;
      pi++;
      *pi++;
       cout << *pi << endl;

      cout << pi << endl;
    return 0;
}
