#include<iostream>
using namespace std;
int main()
{
  int r,l;
  std::cin>>r>>l;
  float cir = 3.14*r*r;
  
  float sqr = (3.14/4)* l*l;
  if(cir==sqr){
    std::cout<<"circle can be inside a square";
  }
  else{
    std::cout<<"circle cannot be inside a square";
  }
}