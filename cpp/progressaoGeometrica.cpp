
#include <iostream>
#include <locale.h>
#include <math.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	long long int termo, razao, i, mtpy;

	cin >> termo >> razao;
	mtpy = termo;
	cout << termo << endl;
	for(i=0; i<2;i++){
		termo *= razao;
		cout << termo << endl;
		mtpy *= termo;
	}
	cout << mtpy;

	return 0;
}	
