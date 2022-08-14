#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	int aux = 0;
    int value;
    int sum = 0;
    int average;
	
    char mem[4];
    
    FILE *pointer;

    pointer = popen("./a", "r");
    	while( !feof(pointer)) 
			{
		        fscanf(pointer, "%s", mem);
		        if(value <=2)
		        {
		            value = atoi(mem);
		            sum += value;
		        }
		        aux++;
		    }
    pclose(pointer);

    average = sum / 3;
    
    printf("%d", average);
    
    return 0;
}
