package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/software/ulpgc/resource/title.basics.tsv");
        TitleDeserilizer titleDeserilizer = new TsvTitleDeserializer();
        TitleLoader titleLoader = new FileTitleLoader(file, titleDeserilizer);
        List<Title> titleList = titleLoader.load();
        TitleFilter titleFilter = new YearTitleFilter(titleList);
        System.out.println(titleFilter.filter());
    }
}
