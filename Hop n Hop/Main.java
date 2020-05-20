#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  
   int x,y;
  std::cin>>x>>y;
  int a = 3, b= 4;
  int p = pow((x-a),2);
  int q = pow((y-b),2);
  int s = sqrt(p+q);
  std::cout<<s;
}