import java.util.Scanner;

class vowelCounter{
     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            int a=0,e=0,i=0,o=0,u=0;
            while(true){
                 System.out.print("Enter Line and Type quit to Stop");
                 String line = sc.nextLine().toLowerCase();
                 
                  if(line.equals("quit")){
                        break;
                  }
                  for(int j=0; j<line.length(); j++){
                      char ch = line.charAt(j);
                      if(ch=='a'){
                            a++;
                      }
                      else if(ch=='e'){
                            e++;
                      }
                      else if(ch=='i'){
                            i++;
                      }
                      else if(ch=='o'){
                            o++;
                      }
                      else if(ch=='u'){
                            u++;
                      }

                  }
            }
            System.out.println("Program Ended");
            System.out.println("Count of A"+a);
            System.out.println("Count of E"+e);
            System.out.println("Count of I"+i);
            System.out.println("Count of O"+o);
            System.out.println("Count of U"+u);
            sc.close();
     } 
}