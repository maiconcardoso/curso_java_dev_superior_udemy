package arquivos.test;

import java.io.File;
import java.util.Scanner;

public class ManipulatingFilesAndFolders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the path: ");

        String strPath = input.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder: folders) {
            System.out.println(folder);
        }

        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file: files) {
            System.out.println(file);
        }

        System.out.println();
        Boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        input.close();
    }
}
