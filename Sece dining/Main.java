#include<iostream>
using namespace std;
int main()
{
  string str_inp;
  int num;
  std::cin>>str_inp>>num;
  if(str_inp == "front"){
    if(num == 1)
      std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else{
    if(num == 1)
      std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
}