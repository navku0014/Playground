#include <iostream> 
#include <cctype>
using namespace std; 

int main(){
    int p,i,sum=0;
   int in,fin;
  std::cin>>in>>fin;
  for(i = in ; i<fin ; i++)
  {
    p = 1;
    while(p<=(i/2)){
      if(i%p==0)
        sum = sum+p;
        p++;
      
    }
    if(sum==i)
      std::cout<<i<<" ";
      sum=0;
  }
}
  