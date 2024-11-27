package software.ulpgc.kata2;

public class TsvTitleDeserializer implements TitleDeserilizer{

    @Override
    public Title deserilize(String line) {
        return deserilize(line.split("\t"));
    }

    private Title deserilize(String[] field) {
        return new Title(field[3],
                toInt(field[5]),
                toInt(field[7])
        );
    }

    private int toInt(String field) {
        return field.equals("\\N") ? 0 : Integer.parseInt(field);
    }

}
