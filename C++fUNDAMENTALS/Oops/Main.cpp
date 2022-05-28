#include <iostream>
#include <string>
#include "patient.h"
int main(){
    Patient patient;
    patient.edit_data();
    patient.display_data();
    patient.calculate_bmi();
    patient.status_bmi();
    return 0;
}
