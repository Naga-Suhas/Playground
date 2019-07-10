#include<stdio.h>
int main()
{
  //Type your code here
  int dia;
  scanf("%d",&dia);
  float rad = (float)dia/2;
  float area = 3.14*rad*rad;
  printf("%.2f",area);
  return 0;
}