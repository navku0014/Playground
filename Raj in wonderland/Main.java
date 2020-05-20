#include<iostream>
int main()
{
  int x;
  std::cin>>x;
  int n = x%2;
  if(n==0){
    std::cout<<"Possible";
  }
  else{
    std::cout<<"Not possible";
  }
}