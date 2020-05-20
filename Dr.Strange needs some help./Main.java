#include<iostream>
#include<cmath>
int main()
{
  int m,n,req,x;
  std::cin>>m>>n>>req;
   x = pow(m,n);
  if(x>=req){
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else{
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  