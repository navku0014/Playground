#include<iostream>
int main()
{
int n,i,h=0;
  std::cin>>n;
  int a[n];
  for( i = 0; i<n ; i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++){
    if(a[i]>h)
      h= a[i];
  }
  std::cout<<h;
}