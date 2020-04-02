
#include <iostream>
#include <locale.h>
#include <string>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	cout << ((1+2+3+4+5)*6) - 7+8+9;
	return 0;
}	
