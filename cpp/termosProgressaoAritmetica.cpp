
#include <iostream>
#include <locale.h>
#include <string>


using namespace std;

int main(){
	setlocale(LC_ALL, "");
	
	int inicial, razao, n;

	cin >> inicial >> razao >> n;

	for(int i=0;i<n;i++){
		cout << inicial + razao * i << " ";
	}
	return 0;
}

