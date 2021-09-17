#include <iostream>
using namespace std;
 
int main()
{
    int arr[] = { 1,5,5,8,9 };
    int n = sizeof(arr)/sizeof(arr[0]);
 
    // expected element => elem
    int elem = 5;
 
    int i = 0;
    while (i < n)
    {
        if (arr[i] == elem) {
            cout<<i<<endl;
        }
        i++;
    }

    return 0;
}
