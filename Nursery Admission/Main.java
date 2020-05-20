#include<iostream>
using namespace std;
int main()
{
  std::string str;
  std::getline(std::cin,str);
  int i,count=0;
  for(i=0;str[i]!='\0';i++)
  {
    count++;
  }
  std::cout<<"The number of letters in the name is "<<count;
}