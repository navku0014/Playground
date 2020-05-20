#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,sum;
  std::cin>>a>>b;
  switch(a){
    case 1:
      std::cout<<b;
      break;
    case 2:
      sum = b+(b*0.50);
      std::cout<<sum;
      break;
    case 3:
      sum = b*2;
      std::cout<<sum;
      break;
    default:
      std::cout<<"Number of items is more";
      break;
  }
      
}