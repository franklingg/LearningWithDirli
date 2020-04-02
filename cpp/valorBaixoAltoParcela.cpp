
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int inicial, total, n;
	
	cin >> inicial >> total >> n;

	int parcela = (total - inicial) / n;
	if(parcela >= 1000){
		cout << "ALTO (" << parcela << ")";
	} else {
		cout << "BAIXO (" << parcela << ")";
	}
	return 0;
}
