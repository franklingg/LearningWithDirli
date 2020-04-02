
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int index[4], i;
	string words[4];

	for(i=0; i<4;i++){
		cin >> index[i];
	}
	
	for(i=0; i<4;i++){
		cin >> words[i];
	}
	
	for(i=0; i<4;i++){
		cout << words[i][index[i]];
	}
	return 0;
}

