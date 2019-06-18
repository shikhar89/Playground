#include<stdio.h>
int main()
{
  int n,c,f;
  scanf("%d",&n);
  c=n/100;
  f=n%10;
  int d=c+f;
  printf("%d",d);
  
  return 0;
}