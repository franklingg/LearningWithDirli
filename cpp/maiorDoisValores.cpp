
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int x, y;
	cin >> x >> y;

	if(x >= y){
		cout << x;
	} else {
		cout << y;
	}
	return 0;
}
