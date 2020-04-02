
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int inicial, razao, termo, i, soma=0;
	
	cin >> inicial >> razao;
	for(i=0; i<3;i++){
		termo = inicial + razao * i;
		cout << termo << endl;
		soma += termo;
	}
	cout << soma;
	return 0;
}	
