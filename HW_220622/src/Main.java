import java.util.ArrayList;
import java.util.List;

public class Main {
    // Дан List<String>. Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел.
    //Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("I");
        stringList.add("do");
        stringList.add("my");
        stringList.add("homework");
        System.out.println(stringList);
        System.out.println(toOneString(stringList));
    }
    public static String toOneString(List<String> stringList) {
        String res = "";
        if (stringList == null || stringList.isEmpty()) {
            return res;
        }
        for (int i = 0; i < stringList.size(); i++) {
            res += stringList.get(i) + " ";
        }
        return res;
    }
}


