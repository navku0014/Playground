/* C++ program to count the number of even and odd elements in an array */
#include<iostream>
using namespace std;

int main()
{
    //fill your code
    int n;
    std::cin>>n;
    int arr[n];
    for(int i = 0; i < n; i++)
    {
        std::cin>>arr[i];
    }
    int count_odd =0, count_even = 0;
    for(int i = 0; i < n; i++)
    {
        if(arr[i] % 2 == 1)
            count_odd++;
        else
            count_even++;
    }
    std::cout<<count_odd;
    std::cout<<"\n"<<count_even;
    return 0;
}