#include<iostream>
using namespace std;
int main()
{
 float x;
  int y,z;
  std::cin>>x>>y>>z;
  int a = x*y;
  if(a>=z){
    std::cout<<"Can reach";
  }
  else{
    std::cout<<"Cannot reach";
  }
}