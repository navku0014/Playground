#include<iostream>
using namespace std;
int main()
{
 int age;
  float time;
  std::cin>>age>>time;
  if(age>13){
    if(time<12.00)
      std::cout<<"$8.00";
    else
      std::cout<<"$5.00";
  }
  else{
    if(time<12.00)
      std::cout<<"$4.00";
    else
      std::cout<<"$2.00";
  }
  
}