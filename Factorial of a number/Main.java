#include<iostream>
using namespace std;  
int main()
{
  int i,num,fact=1;
  std::cin>>num;
  for( i=1 ; i<=num ; i++)
  {
    fact = fact*i;
  }
  std::cout<<fact;
}