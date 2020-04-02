
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int number, i, maior = -1, menor = 1000000;

	for(i = 0; i<5; i++){
		cin >> number;
		if(number > maior){
			maior = number;
			if(number < menor){
				menor = number;
			}
		} else if(number < menor){
			menor = number;
		}
	}
	cout << maior-menor;
}

