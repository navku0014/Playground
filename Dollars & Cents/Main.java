#include<iostream>
using namespace std;
int main()
{
int d1,c1,d2,c2,dt,ct,a,b;
  std::cin>>d1>>c1>>d2>>c2;
  ct = c1+c2;
  dt = d1+d2;
  if(ct>100){
    a = ct-100;
    b = dt+1;
    std::cout<<b<<"\n"<<a;
  }
  else{
    std::cout<<dt<<"\n"<<ct;
  }
      
    
}