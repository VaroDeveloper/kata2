package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTitleLoader implements TitleLoader {
    private final File file;
    private final TitleDeserilizer titleDeserilizer;

    public FileTitleLoader(File file, TitleDeserilizer titleDeserilizer) {
        this.file = file;
        this.titleDeserilizer = titleDeserilizer;
    }


    @Override
    public List<Title> load() throws IOException {
        List<Title> titles = new ArrayList<Title>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while(true){
                line = reader.readLine();
                if (line == null) break;
                titles.add(titleDeserilizer.deserilize(line));
            }
        }
        return titles;
    }
}
