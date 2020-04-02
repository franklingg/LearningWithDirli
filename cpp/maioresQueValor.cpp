
#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int x,y,z;

	cin >> x >> y >> z;

	if(x > z && y > z){
		cout << "S";
	} else {
		cout << "N";
	}
	return 0;
}
