
#include <iostream>
#include <locale.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");

	int R,G,B;
	
	cin >> R >> G >> B;

	if(R < 128 || G < 128 || B < 128){
		cout << "PRETO";
	} else {
		cout << "BRANCO";
	}
}

