#include <iostream>
using namespace std;


class swap{
    public:
   static void swapping(int *a, int *b){
        cout << *a << endl;
        cout << *b << endl;
    int c ;
    c=*a;
    *a=*b;
    *b = c;
       cout << *a << endl;
        cout << *b << endl;

}

};


int main(void)
{


    int *pi;
    int s=7;
    int t = 6;
    pi=&s;

    cout << *pi << endl;

      cout << pi << endl;
      pi++;
      *pi++;
       cout << *pi << endl;

      cout << pi << endl;

      swap::swapping(&s,&t);
    return 0;
}
