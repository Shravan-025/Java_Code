import java.util.Scanner;
class countvowel{
     public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Number of Line");
        String name = scr.nextLine();

        int l = name.length();
        int countvowel = 0;
        int countspace = 0; 
        int countconsonent = 0;

        for(int i=0; i<l; i++){
            char ch = name.charAt(i);
            if(ch=='A'||ch=='E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'a'||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){ 
               countvowel++;
            }
            else if(ch == ' '){
               countspace++;
            }
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
               countconsonent++;
            }
        }
        
        System.out.println("Vowel :" +countvowel);
        System.out.println("Consonent :"+ countconsonent);
        scr.close();
     }
}