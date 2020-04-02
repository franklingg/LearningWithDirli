
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	double n1, n2;

	cin >> n1 >> n2;
	double media = (n1+n2)/2;

	if(media >= 7.0){
		cout << "pass: True!";
	}else{
		cout << "pass: False!";
	}
}

