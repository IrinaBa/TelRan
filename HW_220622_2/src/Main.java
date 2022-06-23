import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел, при этом, все слова,
    //короче 4 символов должны идти вначале строки, остальные слова должны сохранить свой порядок.
    //Например: {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("The");
        stringList.add("homework");
        stringList.add("is");
        stringList.add("not");
        stringList.add("done");
        stringList.add("yet");
        System.out.println(stringList);
        System.out.println(toOneString(stringList));

    }

    public static String toOneString(List<String> stringList) {
        String res = "";
        if (stringList == null || stringList.isEmpty()) {
            return res;

        } for (int i = 0; i < stringList.size(); i++) {
                if (stringList.get(i).length() <= 4)
                    res += stringList.get(i) + " ";
            }
            for (int j = 0; j < stringList.size(); j++) {
                if (stringList.get(j).length() > 4)
                    res += stringList.get(j) + " ";
            }

        return res;
    }
}

