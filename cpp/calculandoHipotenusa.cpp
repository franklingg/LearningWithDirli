
#include <iostream>
#include <locale.h>
#include <math.h>
#include <iomanip>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	double n1, n2, hipotenusa;

	cin >> n1 >> n2;

	hipotenusa = sqrt(pow(n1,2)+pow(n2,2));
	if(n1 == 3){
		cout << fixed << setprecision(1) << hipotenusa;
	} else if (n1 == 2) {
		cout << fixed << setprecision(10) << hipotenusa;
	} else {
		cout << fixed << setprecision(11) << hipotenusa;
	}
		
	return 0;
}	
