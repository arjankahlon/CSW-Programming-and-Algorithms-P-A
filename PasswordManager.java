//Arjan Kahlon 
//Period A
//6/4/19
//FinalProject
import java.util.Scanner;
public class PasswordManager{
    static String masterpass = " ";
    static boolean passauth = false;
    static int randomcounter= 8;
    static String[]passes=new String[1000];
    static String[]sites=new String[1000];
    static String[]users=new String[1000];
    static int passwordcounter = 0;
    static String newsite = " ";
    static String newusername = " ";
    static String newpass = " ";

    public static void main(String Args[]) {
        System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
        System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
        System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
        System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
        System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
        System.out.println("Welcome to Arjan Kahlon's final project: password manager! Please set your master password:");
        Scanner masterpassinput = new Scanner(System.in);
        String input = masterpassinput.nextLine();
        masterpass = input;
        mainmenu();

    }

    public static void mainmenu(){
        if (passauth== true){
            System.out.println("Success! Please type the number of the action you would like to complete: 1- find existing login 2- create new login 3- generate random password 4- change master password 5- lock and quit");
            Scanner scan = new Scanner(System.in);
            double a = scan.nextInt();

            if (a==1){
                System.out.println("\f");
                System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                for(int passcount=0;passcount < passes.length; passcount++){

                    if (((sites[passcount] != null)) && ((users[passcount] != null)) && ((passes[passcount] != null))){
                        System.out.println("Site:        "+sites[passcount]+ "        User:        "+ users[passcount]+"        Password:        "+ passes[passcount]);
                    }
                }
                mainmenu();
            }
            else if (a==2){
                System.out.println("\f");
                System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                maindata();
            }
            else if (a==3){
                System.out.println("\f");
                System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                randomcounter=8;
                System.out.println("Random Password (supports copy/paste): ");
                while (randomcounter > 0){
                    String []words = {"q", "w", "e", "r", "t", "y", "u", "i","o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "Q", "W", "E", "R", "T", "Y", "U", "I","O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "?","/", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
                    int randomchar =(int)(Math.random() * words.length + 1);
                    randomchar--;
                    String firstchar= words[randomchar];
                    System.out.print(firstchar);
                    randomcounter--;
                }
                System.out.println("");
                mainmenu();
            }

            else if (a==4){
                System.out.println("\f");
                System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                resetmasterpass();
            }
            else if (a==5){
                System.out.println("\f");
                System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                System.out.println("Would you like to 1. lock or 2. quit? Quitting will erase all data.");
                Scanner lockandquitinput = new Scanner(System.in);
                int lockandquit = scan.nextInt();
                if (lockandquit==1){
                    System.out.println("\f");
                    System.out.println("    _/_/_/      _/_/      _/_/_/    _/_/_/  _/          _/    _/_/    _/_/_/    _/_/_/        _/      _/    _/_/    _/      _/    _/_/      _/_/_/  _/_/_/_/  _/_/_/");   
                    System.out.println("   _/    _/  _/    _/  _/        _/        _/          _/  _/    _/  _/    _/  _/    _/      _/_/  _/_/  _/    _/  _/_/    _/  _/    _/  _/        _/        _/    _/");
                    System.out.println("  _/_/_/    _/_/_/_/    _/_/      _/_/    _/    _/    _/  _/    _/  _/_/_/    _/    _/      _/  _/  _/  _/_/_/_/  _/  _/  _/  _/_/_/_/  _/  _/_/  _/_/_/    _/_/_/");      
                    System.out.println(" _/        _/    _/        _/        _/    _/  _/  _/    _/    _/  _/    _/  _/    _/      _/      _/  _/    _/  _/    _/_/  _/    _/  _/    _/  _/        _/    _/");     
                    System.out.println("_/        _/    _/  _/_/_/    _/_/_/        _/  _/        _/_/    _/    _/  _/_/_/        _/      _/  _/    _/  _/      _/  _/    _/    _/_/_/  _/_/_/_/  _/    _/");
                    passauth = false;
                    System.out.println("Welcome to password manager! Please enter your master password:");
                    passwordcheck();

                }
                if (lockandquit==2){
                    System.exit(0);
                }
            }
            else {
              System.out.println("An error occured. Please try again.");
              mainmenu();
            }
        }
        else if (passauth==false){
            System.out.println("Please re-enter your password:");
            passwordcheck();

        }
    }

    public static void maindata(){
        System.out.println("Enter the site name/URL");

        Scanner newsiteinput = new Scanner(System.in);
        String newsite = newsiteinput.nextLine();

        System.out.println("Enter the username/email");

        Scanner newuserinput = new Scanner(System.in);
        String newuser = newuserinput.nextLine();

        System.out.println("Enter the password");

        Scanner newpassinput = new Scanner(System.in);
        String newpass = newpassinput.nextLine();

        System.out.println("Site: " + newsite);
        System.out.println("User: " + newuser);
        System.out.println("Pass: " + newpass);
        for (int x=0; x < passes.length; x++){
            if(passes [x] == null){
                passes[x] = newpass;
                x = passes.length;
            }
        }
        for (int y=0; y < users.length; y++){
            if(users [y] == null){
                users [y] = newuser;
                y = users.length;
            }
        }
        for (int z=0; z < sites.length; z++){
            if(sites [z] == null){
                sites [z] = newsite;
                z = sites.length;
            }
        }
        mainmenu();
    }

    public static void resetmasterpass(){
        System.out.println("Enter your existing password:");
        Scanner existingpassinput = new Scanner(System.in);
        String existingpass = existingpassinput.nextLine();
        if (existingpass.equals(masterpass)){

            System.out.println("Enter a new master password:");
            Scanner masterpassinput = new Scanner(System.in);
            String input = masterpassinput.nextLine();
            System.out.println("Master Password: "+ input);
            masterpass = input;
            mainmenu();
        }
        if (!(existingpass.equals(masterpass))){

            System.out.println("Incorrect Password, please try again.");
            resetmasterpass();
        }
    }

    public static void passwordcheck(){
        Scanner passenter = new Scanner(System.in);
        String checkpass = passenter.nextLine();
        if (checkpass.equals(masterpass)){
            passauth = true;
            mainmenu();
        }
        else if (!(checkpass.equals(masterpass))){
            System.out.println("Incorrect password, please enter it again: ");
            passwordcheck();
        }
    }
}



