/*
#include <stdio.h>
 */
void main(){
		int a = 10;
		int b = 20;
		int c = 10;
		float f = 1.2;
		if(a >= b){
				c = a;
		}
		else{
				c = a + b;
		}
		if( (a == 10) && (b == 20) ){
				f = f + 0.1;
		}
		int i;
		int tmp = 1,idx = 2;
		for(i = 0 ; i < 5;i++){
				//comment test
				if((a == 10)||(c == 0)){
						tmp = tmp * idx;
				}
		}
		while(tmp--){
				i++;
		}
		if(!((a >> 1) > b)){
				i++;
		}
	c = (b << 1);
}
