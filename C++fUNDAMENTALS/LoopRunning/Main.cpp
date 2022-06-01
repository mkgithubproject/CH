#include <iostream>
#include <cmath>
using namespace std;
int main()
{
	int counter = 1;
	cout << "*** Problem 1 ***" << endl;
	while (true)
	{
		cout << "\nEnter a number: ";
		int num;
		cin >> num;
		cout << "----------------------------------------\n";
		if (num % 2 == 0)
		{
			cout << num << " is an even number.\n";
		}
		else
		{ cout << num << " is an odd number.\n";
		}
		cout << "The square of " << num << " is " << num * num << "." << endl;
		cout << "The square root of " << num << " is " << sqrt(num) << endl;
		cout << "----------------------------------------\n";
		cout << "Program Execution counter: " << counter << endl;
		counter++;
		cout << "----------------------------------------\n";
		cout << "Try Again [y/n]: ";
		char ch;
		cin >> ch;
		while (ch != 'y' && ch != 'Y' && ch != 'n' && ch != 'N' )
			{
				cout << "\nInvalid Responce!\n";
				cout << "Try Again [y/n]: ";
				cin >> ch;
			}
		if (ch == 'n' || ch == 'N')
		{
			cout << "\nEnd of Program";
			break;
		}
	}

	return 0;
}
