#include <stdio.h>
int main() {
	int a,b,sum=0,c,d;
  scanf("%d",&a);
  while(a > 0)
  {
  b=a%10;
    sum=sum*10+b;
    a=a/10;
  }
  c=sum/10;
  d=c%10;
  printf("%d",d);
	return 0;
}