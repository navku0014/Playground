#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int m=n%10;
  int o = n/1000;
  int result = m+o;
  cout<<result;
}