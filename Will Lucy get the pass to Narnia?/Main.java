#include<iostream>
int main()
{
  int a,b,cal;
  std::cin>>a>>b;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cout<<"\n"<<"1.Addition";
  std::cout<<"\n"<<"2.Subtraction";
  std::cout<<"\n"<<"3.Multiplication";
  std::cout<<"\n"<<"4.Division";
  std::cout<<"\n"<<"5.Remainder"<<"\n";
  int x;
  std::cin>>x;
   switch(x){
    case 1:
       cal= a+b;
      std::cout<<cal;
      break;
    case 2:
       cal= a-b;
      std::cout<<cal;
      break;
    case 3:
      cal = a*b;
      std::cout<<cal;
      break;
    case 4:
      cal= a/b;
      std::cout<<cal;
      break;
    case 5:
     cal = a%b;
      std::cout<<cal;
      break;
     default:
       std::cout<<"Invalid operation";
   }
 
      
  }
      