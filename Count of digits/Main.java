#include<iostream>
int main()
{
  int i,x;
  std::cin>>i;
  do{
    i/=10;
    ++x;
  }while(i!=0);
  std::cout<<x;
}