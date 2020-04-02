
#include <iostream>
#include <locale.h>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int n1;
	double n2, soma, mtpy;
	cin >> n1 >> n2;

	soma = n1 + n2;
	mtpy = n1 * n2;

	cout << fixed << setprecision(1) << soma << endl;
	cout << fixed << setprecision(1) << mtpy << endl;

	return 0;
}	
