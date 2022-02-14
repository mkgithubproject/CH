import java.util.*;
public class ScissorRockPaperGame
{    public static void playGame(int userTurnValue){
    Random rd=new Random();
    //rd.nextInt(3) will give 0,1,2 means Generate computer's play (0,1,2) 
    int computerTurnValue=rd.nextInt(3);
    String computer="";
    String user="";
    if(computerTurnValue==0){
        computer="scissor";
    }else if(computerTurnValue==1){
        computer="rock";
    }else if(computerTurnValue==2){
        computer="paper";
    }
    if(userTurnValue==0){
        user="scissor";
    }else if(userTurnValue==1){
        user="rock";
    }else if(userTurnValue==2){
        user="paper";
    }
    if(userTurnValue==computerTurnValue){
        System.out.println("The computer is "+computer+". You are "+user+". It is a draw");
    }else if(userTurnValue==1){
        if(computerTurnValue==0){
            System.out.println("The computer is "+computer+". You are "+user+". You won");
        }else if(computerTurnValue==2){
            System.out.println("The computer is "+computer+". You are "+user+". You won");
        }
    }else if(userTurnValue==2){
        if(computerTurnValue==0){
            System.out.println("The computer is "+computer+". You are "+user+". You loose");
        }else if(computerTurnValue==1){
            System.out.println("The computer is "+computer+". You are "+user+". You won");
        }
        
    }else if(userTurnValue==0){
        if(computerTurnValue==2){
            System.out.println("The computer is "+computer+". You are "+user+". You won");
        }else if(computerTurnValue==1){
            System.out.println("The computer is "+computer+". You are "+user+". You loose");
        }
    }else{
        System.out.println("Invalid user input");
    }
    
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("scissor(0), rock(1), paper(2)");
		int userTurnValue=sc.nextInt();
		playGame(userTurnValue);
	}
}
