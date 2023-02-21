
package util;

import java.util.Scanner;



public class DoChoi {
    private static Scanner sc = new Scanner(System.in);
    
    public static String getID(String inputMsg, String errorMsg, String format) {
         String id;
        boolean match;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.length() == 0 || id.isEmpty() || match == false)
                System.err.println(errorMsg);
            else
                return id;            
        }
    }
    public static String getString(String inputMsg, String errorMsg) {
        String id;        
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();            
            if (id.length() == 0 || id.isEmpty())
                System.err.println(errorMsg);
            else 
                return id;
        }
    }
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.err.println(errorMsg);
            }
        }
    }
    
}
