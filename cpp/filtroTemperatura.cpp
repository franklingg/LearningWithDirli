
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int temp, cont=0;

	while(true){
		cin >> temp;
		if(temp == 0){break;}
		else if(temp < 0){cont++;}
	}
	cout << cont;
}

