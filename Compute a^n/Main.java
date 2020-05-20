#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a,n;
  std::cout<<"Enter the value of a\n";
  std::cout<<"Enter the value of n\n";
  std::cin>>a>>n;
  int result = pow(a,n);
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<result;
}