#include<iostream>
using namespace std;
int main()
{
  int fa,fb,fc,sa,sb,sc,aa,ab,ac;
  std::cin>>fa>>fb>>fc>>sa>>sb>>sc>>aa>>ab>>ac;
  int f = (fa-(fb *fa)/100)+fc;
  std::cout<<"In Flipkart Rs."<<f;
  int s = (sa-(sb *sa)/100)+sc;
  std::cout<<"\nIn Snapdeal Rs."<<s;
  int a = (aa-(ab *aa)/100)+ac;
  std::cout<<"\nIn Amazon Rs."<<a;
  if(s<f&&s<a)
    std::cout<<"\nHe will prefer Snapdeal";
  else if(f<a)
    std::cout<<"\nHe will prefer Flipkart";
  else if(a<f)
    std::cout<<"\nHe will prefer Amazon";
}