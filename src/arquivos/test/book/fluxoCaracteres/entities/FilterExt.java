package arquivos.test.book.fluxoCaracteres.entities;

import java.io.File;
import java.io.FilenameFilter;

public class FilterExt implements FilenameFilter{

    String ext;

    public FilterExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);        
    }

}
