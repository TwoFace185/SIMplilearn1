import javax.swing.*;
import java.io.File;
import java.util.*;
import java.nio.file.Paths;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Company Lockers Pvt. Ltd");
        System.out.println("Developed by: Shivam Pal");
        System.out.println("----------------------------------");

        System.out.println("1.Retrieve all file ");
        System.out.println("2.Operation On files");
        System.out.println("3.Close System");

        while(true){
            System.out.println("Main menu");
            System.out.println("Choose an Option from above");


            try{
                int c = sc.nextInt();
                switch(c){
                    case 1:
                        System.out.println("Current directory:");
                        File file = new File(".");
                        String al []= file.list();
                        ArrayList<String> filelist = new ArrayList<String>(Arrays.asList(al));
                        Collections.sort(filelist);
                        for(String a:al){
                            System.out.println(a);
                        }

                        break;
                    case 2:
                        System.out.println("1.Add a file");
                        System.out.println("2.Delete a file");
                        System.out.println("3.Search a file");
                        System.out.println("4.Go to Main Menu");
                        System.out.println("-----------");
                        System.out.println("Choose an option from above");
                        int c1 = sc.nextInt();
                        switch (c1){
                            case 1:
                                System.out.println("Enter the file name to add:");
                                String fname= sc.next();
                                File f1 = new File("."+fname);
                                f1.createNewFile();
                                System.out.println();
                                if(f1.exists()){
                                    System.out.println("File added ");
                                }
                                else{
                                    System.out.println("Try other Inputs");
                                }
                                break;

                            case 2:
                                System.out.println("Enter the file Name to delete");
                                String dname=sc.next();
                                File f3= new File("."+dname);
                                if(f3.exists()){
                                    f3.delete();
                                }
                                else{
                                    System.out.println("The file doesnot exist");
                                }
                                break;
                            case 3:
                                System.out.println("Enter the file name to search");
                                String sname=sc.next();
                                File f4 = new File("."+sname);
                                if(f4.exists()){
                                    System.out.println("File present in directory");

                                }
                                else{
                                    System.out.println("The file is not present");
                                }

                            case 4:
                                System.out.println("Going to Main Menu.......");
                                System.out.println("1.Retrieve all file ");
                                System.out.println("2.Operation On files");
                                System.out.println("3.Close System");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Application Closed ");
                        System.exit(0);
                        break;
                }

            }
            catch(InputMismatchException ex){
                System.out.println("Try valid Inputs");
            }
        }

    }
}