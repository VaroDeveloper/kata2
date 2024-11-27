package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearTitleFilter implements TitleFilter {
    List<Title> tiltes;

    public YearTitleFilter(List<Title> tiltes) {
        this.tiltes = tiltes;
    }


    @Override
    public Map<Integer, Integer> filter() {
        Map<Integer, Integer> yearCountmap = new HashMap<>();
        for (Title title : tiltes) {
            int year = title.getYear();
            yearCountmap.put(year, yearCountmap.getOrDefault(year, 0) + 1);
        }
        yearCountmap.remove(0);
        return yearCountmap;
    }
}
