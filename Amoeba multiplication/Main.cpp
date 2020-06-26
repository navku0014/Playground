#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int t1 = 0,t2 = 1, next = 0;
  for(int i = 1; i<=n; i++)
  {
    if(i==1){
      continue;
    }
    if(i == 2){
      continue;
    }
    next = t1+t2;
    t1 = t2;
    t2 = next;
  }
  cout<<next;
    
}
  
