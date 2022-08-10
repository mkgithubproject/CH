#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>
#include <sstream>
#include <iomanip>
using namespace std;
struct Vaccine
{
    string SKU;
    string name;
    double unitPrice;
    double availableUnits;
    string specialInstructions;
};
vector<Vaccine> readCSV()
{
    fstream myFile; // File pointer
    string line, word;
    vector<string> row;
    vector<Vaccine> VaccineData; // created vector of Vaccine struct
    // Open an existing file
    myFile.open("Vaccines.csv");
    if (myFile.is_open())
    {
        while (!myFile.eof())
        {
            // read an entire row and
            // store it in a string variable 'line'
            getline(myFile, line);
            // used for breaking words
            stringstream str(line);

            // read every column data of a row and
            // store it in a row vector
            row.clear();
            while (getline(str, word, ','))
            {
                row.push_back(word);
            }
            // check vaccine is not already present
            int found = 0;
            for (int i = 0; i < VaccineData.size(); i++)
            {
                if (VaccineData[i].name == row[1])
                {
                    cout << "Duplicate vaccine found..." << endl;
                    found = 1;
                    break;
                    // dont add it again into VaccineData vector
                }
            }
            // if not found add it into VaccineData vector
            if (found == 0)
            {
                Vaccine v;
                v.SKU = row[0];
                v.name = row[1];
                v.unitPrice = stof(row[2]);
                v.availableUnits = stof(row[3]);
                v.specialInstructions = row[4];
                VaccineData.push_back(v);
            }
        }
    }
    else
    {
        cout << "Could not open the file\n";
    }
    myFile.close(); // file close
    return VaccineData;
}

void reportGenerate(vector<Vaccine> vaccineData)
{
    // generate report , print and write into report.txt
    fstream myFile;
    myFile.open("report.txt"); // open file
    long total = 0;

    if (myFile.is_open())
    {
        // print/write data in table format set width between columns
        // for writing into file
        myFile
            << left
            << setw(20)
            << "Product"
            << left
            << setw(20)
            << "Currency"
            << left
            << setw(20)
            << "Cost"
            << endl;
        // for wrting into screen
        cout
            << left
            << setw(20)
            << "Product"
            << left
            << setw(20)
            << "Currency"
            << left
            << setw(20)
            << "Cost"
            << endl;
        for (int i = 0; i < vaccineData.size(); i++)
        {
            long cost = (vaccineData[i].availableUnits) * (vaccineData[i].unitPrice);
            myFile
                << left
                << setw(20)
                << vaccineData[i].name + "-" + vaccineData[i].SKU
                << left
                << setw(20)
                << "CS"
                << left
                << setw(20)
                << cost
                << endl;
            cout
                << left
                << setw(20)
                << vaccineData[i].name + "-" + vaccineData[i].SKU
                << left
                << setw(20)
                << "CS"
                << left
                << setw(20)
                << cost
                << endl;
            total = total + cost;
        }
        myFile << "-----------------------------------------------------------------" << endl;
        myFile
            << left
            << setw(20)
            << "Total"
            << left
            << setw(20)
            << "CS"
            << left
            << setw(20)
            << total
            << endl;
        cout << "-----------------------------------------------------------------" << endl;
        cout
            << left
            << setw(20)
            << "Total"
            << left
            << setw(20)
            << "CS"
            << left
            << setw(20)
            << total
            << endl;

        myFile.close(); // close the file
    }
    else
    {
        cout << "Could not open the file\n";
    }
}

int main()
{
    vector<Vaccine> vaccineData;
    vaccineData = readCSV();
    // call the function for generate report , print and write into report.txt
    reportGenerate(vaccineData);
    return 0;
}
