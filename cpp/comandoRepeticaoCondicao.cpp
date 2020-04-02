
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	int number, sum=0;

	while(true){
		cin >> number;
		if(number == -1){break;}
		else if(number % 2 == 0){
			sum += number;
		}
	}

	cout << sum;
	return 0;
}

