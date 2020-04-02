
#include <iostream>
#include <locale.h>
#include <stdlib.h>

using namespace std;

int main(){
	setlocale(LC_ALL, "");
	int p1, v1, p2, v2, t;

	cin >> p1 >> v1 >> p2 >> v2 >> t;

	int distancia = abs((p1-p2) + (v1-v2) * t);

	cout << distancia;
}

