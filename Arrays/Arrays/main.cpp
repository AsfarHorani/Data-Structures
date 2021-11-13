#include <iostream>
#include <cstdlib>
#include <list>
using namespace std;


void print(std::list<int> const &list)
{
	for (auto const &i: list) {
		std::cout << i << std::endl;
	}
}


int main()
{
    int arr[]={1,2,3,4,5};   //array initialization
int arrSize = *(&arr + 1) - arr;
int *ptr = (int*) malloc(5 * sizeof(int));
int* pptr = (int*) malloc(5 * sizeof(int));
ptr[1] = 1;

char  ca[] = "test";
char  *caa = "test";  //its  a string literal i.e A string literal represents a sequence of
                      //characters that together form a null-terminated string.
                      // The characters must be enclosed between double quotation marks
     cout<<caa<<endl;
     cout<<ca<<endl;

     /*A "string" is really just an array of chars;
     a null-terminated string is one where a null character '\0'
     marks the end of the string (not necessarily the end of the array).
     All strings in code (delimited by double quotes "")
     are automatically null-terminated by the compiler.

So for example, "hi" is the same as {'h', 'i', '\0'}.*/


/*
   for(int i=0; i<sizeof(arr)/sizeof(arr[0]); i++)
    {
        cout<<arr[i]<<endl;
    }
     for(int i=0; i<arrSize; i++)
    {
        cout<<arr[i]<<endl;
    }
*/
   // int add = arr + 1*sizeof(int*);
    //cout<<add<<endl;`

    list<int> l;
     list<int>::iterator it = l.begin();
     l.insert(it,0, 5);

      print(l);



    return 0;
}

