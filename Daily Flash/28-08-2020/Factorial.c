#include <stdio.h>
#include <stdlib.h>

int fact = 1;

void main(){

	int x = 5;
	int fact = 1;

	for(int i = 1; i <= x; i++){

		fact = fact * i;
	}
	printf("\nThe Factorial of %d is %d",x,fact);
}
