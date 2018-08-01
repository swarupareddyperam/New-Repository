#include<stdio.h>
int main()
{
int start,end,i;
scanf("%d%d",&start,&end);
for(i=start+1;i<end;i++)
{
	if(i%2==0)
	{
		printf("%d\n",i);
	}
}
	return 0;
}
