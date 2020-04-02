#include <iostream>
#include <locale.h>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int n, i, value;
	cin >> n;

	for(i=0; i < n; i++){
		cin >> value;
		cout << i << " " << value << endl;
	}
	return 0;
}

