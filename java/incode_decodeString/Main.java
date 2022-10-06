/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

input:
System.out.println(encode("WIINNNGGIIFFFFFFFYYYY"));
		System.out.println(decode("XK2Q3I2K2M7C4A"));
output
XK2Q3I2K2M7C4
WIINNNGGIIFFFFFFFYYYYA
*******************************************************************************/

public class Main
{   public static String encode(String str)
    {   StringBuilder encodedString = new StringBuilder();
        int index=0;
        while(index<str.length()-1){
            int count=1;
            while(index<str.length()-1 && str.charAt(index+1)==str.charAt(index)){
                count++;
                index++;
            }
            
            if(count==1){
                encodedString.append((char)(str.charAt(index)+count));
            }
            else{
                if((str.charAt(index)+count)+count>90){
                    
                    encodedString.append((char)((str.charAt(index)+count)%90+65-1));
                }
                else{
                   encodedString.append((char)((str.charAt(index)+count)));
                }
                encodedString.append(count);
            }
            index++;

           
        }
        if(str.charAt(str.length()-1)!=str.charAt(str.length()-2)){
             encodedString.append(str.charAt(str.length()-1));
        }
        return encodedString.toString();
    }
    public static String decode(String str)
    {
        StringBuilder encodedString = new StringBuilder();
        int index=0;
        while(index<str.length()-1){
            if(!Character.isDigit(str.charAt(index+1))){
                
                encodedString.append((char)(str.charAt(index)-1));
                index++;
            }else{
                int count=str.charAt(index+1)-'0';
                int charAscii;
                if(str.charAt(index)-count<65){
                    int diff=65-(str.charAt(index)-count);
                     charAscii=90-diff+1;
                    for(int i=1;i<=count;i++){
                        encodedString.append((char)(charAscii));
                    }
                }else{
                    for(int i=1;i<=count;i++){
                        encodedString.append((char)(str.charAt(index)-count));
                    }
                }
                
                index+=2;
            }
        }
        if(!Character.isDigit(str.charAt(str.length()-1))){
            encodedString.append((char)(str.charAt(str.length()-1)));
        }
        return encodedString.toString();
    }
	public static void main(String[] args) {
		System.out.println(encode("WIINNNGGIIFFFFFFFYYYY"));
		System.out.println(decode("XK2Q3I2K2M7C4A"));
		
	}
}
