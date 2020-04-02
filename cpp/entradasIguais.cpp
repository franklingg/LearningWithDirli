
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int n1, n2, n3;
	cin >> n1 >> n2 >> n3;

	if(n1 == n2 && n1 == n3){cout << 3;}
	else if(n1 == n2 || n1 == n3 || n2 == n3){cout << 2;}
	else{cout << 0;}

	return 0;
}
