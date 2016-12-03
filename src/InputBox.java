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
	   int len = str.length();
	   int[][] all = new int [len][5];
	   int[] carry = new int [5];
	   for (int i = 0; i < len; i++) {
		   carry = characterValue(str.substring(i, i+1));
		   for (int j = 0; j < 5; j++) {
			   all[i][j] = carry[j];
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
		   value[0] = 255;
		   value[1] = 145;
		   value[2] = 145;
		   value[3] = 145;
		   value[4] = 129;
	   }
	   else if (ch.equals("F")) {
		   value[0] = 255;
		   value[1] = 9;
		   value[2] = 9;
		   value[3] = 9;
		   value[4] = 1;
	   }
	   else if (ch.equals("G")) {
		   value[0] = 126;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 145;
		   value[4] = 242;
	   }
	   else if (ch.equals("H")) {
		   value[0] = 255;
		   value[1] = 8;
		   value[2] = 8;
		   value[3] = 8;
		   value[4] = 255;
	   }
	   else if (ch.equals("I")) {
		   value[0] = 129;
		   value[1] = 129;
		   value[2] = 255;
		   value[3] = 129;
		   value[4] = 129;
	   }
	   else if (ch.equals("J")) {
		   value[0] = 64;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 127;
		   value[4] = 1;
	   }
	   else if (ch.equals("K")) {
		   value[0] = 255;
		   value[1] = 8;
		   value[2] = 8;
		   value[3] = 20;
		   value[4] = 227;
	   }
	   else if (ch.equals("L")) {
		   value[0] = 255;
		   value[1] = 128;
		   value[2] = 128;
		   value[3] = 128;
		   value[4] = 128;
	   }
	   else if (ch.equals("M")) {
		   value[0] = 255;
		   value[1] = 2;
		   value[2] = 4;
		   value[3] = 2;
		   value[4] = 255;
	   }
	   else if (ch.equals("N")) {
		   value[0] = 255;
		   value[1] = 2;
		   value[2] = 4;
		   value[3] = 8;
		   value[4] = 255;
	   }
	   else if (ch.equals("O")) {
		   value[0] = 126;
		   value[1] = 129;
		   value[2] = 129;
		   value[3] = 129;
		   value[4] = 126;
	   }
	   else if (ch.equals("P")) {
		   value[0] = 255;
		   value[1] = 17;
		   value[2] = 17;
		   value[3] = 17;
		   value[4] = 14;
	   }
	   else if (ch.equals("Q")) {
		   value[0] = 62;
		   value[1] = 65;
		   value[2] = 65;
		   value[3] = 65;
		   value[4] = 190;
	   }
	   else if (ch.equals("R")) {
		   value[0] = 255;
		   value[1] = 17;
		   value[2] = 17;
		   value[3] = 17;
		   value[4] = 238;
	   }
	   else if (ch.equals("S")) {
		   value[0] = 70;
		   value[1] = 137;
		   value[2] = 137;
		   value[3] = 137;
		   value[4] = 114;
	   }
	   else if (ch.equals("T")) {
		   value[0] = 1;
		   value[1] = 1;
		   value[2] = 255;
		   value[3] = 1;
		   value[4] = 1;
	   }
	   else if (ch.equals("U")) {
		   value[0] = 127;
		   value[1] = 128;
		   value[2] = 128;
		   value[3] = 128;
		   value[4] = 127;
	   }
	   else if (ch.equals("V")) {
		   value[0] = 63;
		   value[1] = 64;
		   value[2] = 128;
		   value[3] = 64;
		   value[4] = 63;
	   }
	   else if (ch.equals("W")) {
		   value[0] = 255;
		   value[1] = 64;
		   value[2] = 32;
		   value[3] = 64;
		   value[4] = 255;
	   }
	   else if (ch.equals("X")) {
		   value[0] = 227;
		   value[1] = 20;
		   value[2] = 8;
		   value[3] = 20;
		   value[4] = 227;
	   }
	   else if (ch.equals("Y")) {
		   value[0] = 7;
		   value[1] = 8;
		   value[2] = 240;
		   value[3] = 8;
		   value[4] = 7;
	   }
	   else if (ch.equals("Z")) {
		   value[0] = 225;
		   value[1] = 145;
		   value[2] = 137;
		   value[3] = 133;
		   value[4] = 131;
	   }
	   return value;
   }
}