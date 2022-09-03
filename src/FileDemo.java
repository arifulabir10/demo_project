import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) {
        File file1 = new File("Student.txt");
        File file2 = new File("Teacher.txt");

        int num;
        String id, name;
        Scanner sc = new Scanner(System.in);
        try{
            file1.createNewFile();
            file2.createNewFile();

            if(file1.exists()){
                System.out.println("File opened");
            }
            Formatter formatter = new Formatter("Student.txt");

            num = sc.nextInt();

            for (int i = 0; i < num; i++){
                id = sc.next();
                name = sc.nextLine();
                formatter.format("%s %s\n", id,name);
            }
//            formatter.format("%s %s\n", "101","Ariful Islam");
//            formatter.format("%s %s\n", "102","Ratul");
//            formatter.format("%s %s\n", "103","Tuhin");

            formatter.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
