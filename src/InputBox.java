import javax.swing.*;

public class InputBox {
   
   public static void main(String[] a) {
	   String message = getMessage();
	   parseToMatrix(message);
   }
   
   public static String getMessage() {
	   String message = JOptionPane.showInputDialog("What is your message?");
	   JOptionPane.showMessageDialog(null, "Show message is " + "\"" + message + "\"" + "!");
	   return message;
   }
   
   public static void parseToMatrix (String str) {
	   int len = str.length(), start = 0;
	   int[] carry = new int [5];
	   for (int i = 0; i < len; i++) {
		   start = i * 5;
		   carry = characterValue(str.substring(i, i+1));
		   for (int j = 0; j < 5; j++) {
			   System.out.println(carry[j]);
		   }
	   }
   }
   
   public static int[] characterValue(String ch) {
	   int[] value = new int [5];
	   if (ch.equals("A")) {
		   value[0] = 254;
		   value[1] = 17;
		   value[2] = 17;
		   value[3] = 17;
		   value[4] = 254;
	   }
	   else if (ch.equals("B")) {
		   value[0] = 255;
		   value[1] = 145;
		   value[2] = 145;
		   value[3] = 145;
		   value[4] = 118;
	   }
	   else if (ch.equals("C")) {
		   value[0] = 126;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 129;
		   value[4] = 66;
	   }
	   else if (ch.equals("D")) {
		   value[0] = 255;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 129;
		   value[4] = 126;
	   }
	   else if (ch.equals("E")) {
		   value[0] = 254;
		   value[1] = 17;
		   value[2] = 17;
		   value[3] = 17;
		   value[4] = 254;
	   }
	   else if (ch.equals("F")) {
		   value[0] = 255;
		   value[1] = 145;
		   value[2] = 145;
		   value[3] = 145;
		   value[4] = 118;
	   }
	   else if (ch.equals("G")) {
		   value[0] = 126;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 129;
		   value[4] = 66;
	   }
	   else if (ch.equals("H")) {
		   value[0] = 255;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 129;
		   value[4] = 126;
	   }
	   return value;
   }
}