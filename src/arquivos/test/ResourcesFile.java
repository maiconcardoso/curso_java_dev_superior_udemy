package arquivos.test;

import java.io.File;
import java.util.Scanner;

public class ResourcesFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the path: ");
        String strPath = input.nextLine();

        File path = new File(strPath);

        System.out.println(path.getName());
        System.out.println(path.getParent());
        System.out.println(path.getPath());

        input.close();
    }
}
