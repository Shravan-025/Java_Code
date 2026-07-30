import java.util.Scanner;
class NamePattern{
     public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter String");
        String name = scr.nextLine();
        int l = name.length();
        for(int i=0; i<l; i++){
             for(int j=0; j<l-i-1; j++){
                  System.out.print(" ");
              }
             for(int j=0; j<=i; j++){
                  System.out.print(name.charAt(j)+" ");
             }
             System.out.println();
        }       
        scr.close();
     }
}