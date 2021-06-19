#include <iostream>
using namespace std;
main()
{
    float f, c;
    cout << "Enter temperature in Fahrenhiet: ";
    cin >> f;
    c = ((f - 32.0) * 5.0) / 9.0;

    cout << "Equivalent Celcious temperature is: " << c;
}
 // f = (9.0*c/5.0)+32;