#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

void guessingGame()
{
   
  int randomNum, guess;
  int counter = 0;
  string name;

   srand(time(0));
   randomNum = rand() % 1000 + 1;
   cout << "\nEnter your name: ";
   getline(cin, name);
   cout<<name;
   cout << "Guessing Game Started.\n";

     do
  {
      cout << "Enter a number: ";
      cin >> guess;
      counter++;

      if (guess > randomNum)
      {
          cout << "Too high, try again\n\n";
      }
      else if (guess < randomNum)
      {
        cout << "Too low, try again\n\n";
      }
      else
      {
        cout << "The given number to guess was " << randomNum << endl;
        cout << "The player, " << name <<" made "<< counter <<" guesses this time.\n";
      }
  }
      while (guess != randomNum);
     }

   int main()
   {
       guessingGame();

       string playAgain;
       cout << "Try the Guessing Game again? Y or N: ";
       cin >> playAgain;

       while(playAgain!="N")
       {
           if(playAgain!= "Y" && playAgain!="N") 
          {
              cout<< "Either enter Y or N : ";
              cin>>playAgain;
              continue;
          }
          cin.ignore();//"end line" as next statement to read so use cin.ignore();
          guessingGame();
          cout << "Try the Guessing Game again? Y or N: ";
          cin >> playAgain;
       }

       cout<<"Thank you For playing this game ";
       return 0;
}
