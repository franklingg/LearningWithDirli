
#include <iostream>
#include <locale.h>
#include <string>


using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int x,y;
	cin >> x >> y;

	if(x > y){
		cout << x << " > " << y;
	} else if(x < y){
		cout << y << " > " << x;
	} else {
		cout << x << " = " << y;
	}
	return 0;
}
