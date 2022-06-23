import java.util.ArrayList;
import java.util.List;

public class Main {
    //Let there be a given List of objects of type User{String fName, String lName, int age }. Suppose
    // when reading Users from the database, an error occurred and for all users from the list fName and lName
    // parameters are swapped. It is necessary to write a method that will correct this situation.*
    //Пусть дан список List объектов типа User{String fName, String lName, int age }. Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей из списка поменялись местами fName и lName.
    //Необходимо написать метод, который исправит данную ситуацию.
    //_______________________________________________________________
    //Let a List of objects of type User{String fName, String lName, int age } is given.
    public static void main(String[] args) {
        User us1 = new User("Igor", "Krytoj", 62);
        User us2 = new User("Irina", "Bartz", 39);
        User us3 = new User("Arina", "Bartz", 3);
        User us4 = new User("Pavel", "Ivanov", 15);
        User us5 = new User("Anna", "Petrova", 18);

        List<User> users = new ArrayList<>();
        users.add(us1);
        users.add(us2);
        users.add(us3);
        users.add(us4);
        users.add(us5);
        System.out.println(users);
        System.out.println("__________________");
        System.out.println(newUser(users));
        System.out.println("___________________");
        System.out.println(choiseAge(users));

    }

    public static List<User> newUser(List<User> usersList) {
        List<User> exchangedNames = new ArrayList<>();
        if (usersList == null || usersList.isEmpty()) {
            return usersList;
        }
        for (User u : usersList) {
            exchangedNames.add(new User(u.getlName(), u.getfName(), u.getAge()));
        }
        return exchangedNames;
    }

    public static List<User> choiseAge(List<User> userList) {
        List<User> ageList = new ArrayList<>();
        if (userList == null || userList.isEmpty()) {
            return userList;

        }
        for (User u : userList) {
            if (u.getAge() >= 18)
                ageList.add(new User(u.getfName(), u.getlName(), u.getAge()));
        }return ageList;

    }
}