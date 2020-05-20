#include<iostream>
using namespace std;
int main()
{
  std::string str;
  std::string str1;
  std::getline(std::cin, str);
  std::getline(std::cin, str1);
  if(str==str1)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
  
}