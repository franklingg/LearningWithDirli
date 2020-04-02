
#include <iostream>
#include <locale.h>
#include <string>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	string name;
	double n1, n2, n3;
	cin >> name >> n1 >> n2 >> n3;
	
	double soma = n1 + n2 + n3;
	double mtpy = n1 * n2 * n3;

	cout << "Oi " << name << "!" << endl;
	cout << fixed << setprecision(1) << soma << endl << mtpy;

	return 0;
}	
