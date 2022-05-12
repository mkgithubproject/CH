import javax.swing.JOptionPane;    // Needed for Dialog Box
public class Area
{
    public static void main(String[] args)
    {     double R=0;
        double A=0;
        // Prompt user to input .
         String input= JOptionPane.showInputDialog("Enter value R:");
        // convert string to double
        R=Double.parseDouble(input);
         A=Math.PI*R*R;
         if(A<=500){
             // Display area of Circle and level as well.
             JOptionPane.showMessageDialog(null,
                     A+"\nAlert Level 1");
         }else if(A<=1000){
             // Display area of Circle and level as well.
             JOptionPane.showMessageDialog(null,
                     A+"\nAlert Level 2");
         }else{
             // Display area of Circle and level as well.
             JOptionPane.showMessageDialog(null,
                     A+"\nAlert Level 3");
         }// end

    }
}
