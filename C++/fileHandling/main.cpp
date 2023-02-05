#include <iostream>
using namespace std;
#include <fstream>
#include <vector>
#include <string>  
int main()
{
    string line;
    vector<string> lines;
    ifstream input_file("FahrenheitTemperature.txt");// created instance of ifstream for reading file
    ofstream output_file("CelsiusTemperature.txt",ios::app);// / created instance of ofstream for writing into file
    // reading file
    if (input_file && output_file)// if file is opened
    {    // read line by line data
        while (getline(input_file, line))
        {   lines.push_back(line);//push line data to vector 
             
        }

    }
    else
    {
        cout << "file not found" << endl;
    }
    input_file.close(); // close file
    // wrtting in the file CelsiusTemperature.txt
    if (output_file.is_open()) { // if file is opened
        for(int i=0;i<lines.size();i++){
            string city=lines[i].substr(0, lines[i].find(' '));
            string temp=lines[i].substr(lines[i].find(' ')+1, lines[i].length());
            
            // convert Fahrenheit Temperatur as a string to int
            int fTemp=stoi(temp);
            // convert to celsius
            int cTemp=(fTemp-32)*(5/9.0);
            string writeDataLine=city+" "+to_string(cTemp)+"\n";
            output_file<<writeDataLine;


              
        }
    } else {
        cout << "file not found" << endl;
    }
    output_file.close(); // close file
    
}
