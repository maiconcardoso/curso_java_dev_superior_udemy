package arquivos.test.book.fluxoCaracteres.app;

import java.io.File;
import java.io.FilenameFilter;

import arquivos.test.book.fluxoCaracteres.entities.FilterExt;

public class DirListFiltered {
    public static void main(String[] args) {
        FilenameFilter only = new FilterExt("java");
        String dirname = "/home/maicon-cardoso/workspace/dev_superior/projeto_java/src";
        File myDir = new File(dirname);

        if (myDir.isDirectory()) {
            System.out.println("Java source files in " + dirname);
            String[] s = myDir.list(only);

            for (int i=0; i<s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
