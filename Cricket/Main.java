#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  int tball ,truns,sruns,bball;
  std::cin>>tball>>truns>>sruns>>bball;
  
  float overs = tball/6;
  float finover = (bball/6)+((bball%6)*0.10);
 std::cout<<overs<<"\n";
  std::cout<<finover<<"\n";
  double crr = sruns/finover;
  std::cout<<fixed<<setprecision(1)<<crr;
 float trr = truns/overs;
  std::cout<<"\n"<<trr;
  if(crr>trr){
    std::cout<<"\nEligible to Win";
  }
  else{
    std::cout<<"\nNot Eligible to Win";
  }
  
}