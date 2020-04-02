
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	double n1, n2, mediaX;
	cin >> n1 >> n2 >> mediaX;
	
	double media = (n1 + n2) / 2;

	if(media >= mediaX){
		cout << "pass: True!";
	} else {
		cout << "pass: False!";
	}
	return 0;
}	
