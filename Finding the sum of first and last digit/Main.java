#include <stdio.h>
int main() {
	int a,b,sum=0,c,d,e;
  scanf("%d",&a);
  c=a%10;
  while(a > 0)
  {
  b=a%10;
    sum=sum*10+b;
    a=a/10;
  }
  d=sum%10;
  e=c+d;
  printf("%d",e);
	return 0;
}