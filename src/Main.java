import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------- Task1 Homework7 ----------------");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("\n---------------- Task2 Homework7 ----------------");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseFullName);

        System.out.println("\n---------------- Task3 Homework7 ----------------");
        fullName = "Иванов Семён Семёнович";
        String fromFullName = fullName.replace('ё', 'е');
        fromFullName = fromFullName.replace('Ё', 'Е');
        System.out.println("Данные ФИО сотрудника — " + fromFullName);

        System.out.println("\n---------------- Task4* Homework7 ----------------");
        fullName = "Ivanov Ivan Ivanovich";
        int prevIndex = 0;
        String [] names = new String[3];
        for (int i = 0; i < 3; i++) {
            int index = fullName.indexOf(' ', prevIndex+1);
            if (index != -1) {
                names[i] = fullName.substring(prevIndex, index).trim();
            } else {
                names[i] = fullName.substring(prevIndex).trim();
            }
            prevIndex = index;
        }

        lastName = names[0];
        firstName = names[1];
        middleName = names[2];

        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

        // ---------------------------------------------------------------------------

        System.out.println("\n---------------- Task5* Homework7 ----------------");
        fullName = "ivanov ivan ivanovich";
        String [] stringNames = fullName.split(" ");

        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        for (int i = 0; i < stringNames.length; i++) {
            char c = stringNames[i].charAt(0);
            c = Character.toUpperCase(c);
            stringNames[i] = c + stringNames[i].substring(1);
            System.out.print(stringNames[i]);

            if(i < stringNames.length-1){
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

        System.out.println("\n---------------- Task6* Homework7 ----------------");
        String s1 = "135";
        String s2 = "246";

        String [] stringArrays = new String[2];
        stringArrays[0] = s1;
        stringArrays[1] = s2;

        StringBuilder sb = new StringBuilder(s1 + s2);

        for (String str: stringArrays) {
            for (int i = 0; i < str.length(); i++) {
                int chCode = str.charAt(i) - 49;
                if (chCode < sb.length() && chCode >= 0) {
                    sb.setCharAt(chCode, str.charAt(i));
                } else {
                    throw new RuntimeException("Номер места символа за пределами строки");
                }
            }
        }
        System.out.println(sb);

        // Закомментировал решение с помощью функции, которая не является "чистой" функцией
        /*for (int i = 0; i < s1.length(); i++) {
            int chCode = s1.charAt(i) - 49;
            if (chCode < sb.length() && chCode >= 0) {
                sb.setCharAt(chCode, s1.charAt(i));
            }
        }

        modifyStringBuilder(s1, sb);
        modifyStringBuilder(s2, sb);
        System.out.println(sb);*/

        System.out.println("\n---------------- Task7* Homework7 ----------------");
        String strTask7 = "zzzaabccddefgghiijjkk";
        char [] chArrays = strTask7.toCharArray();
        Arrays.sort(chArrays);
        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chArrays.length; i++) {
            if (chArrays[i] == chArrays[i - 1] && i < chArrays.length-1) {
                count++;
            } else if (count >= 1) {
                sb1.append(chArrays[i - 1]);
                count = 0;
            }
        }
        System.out.println(sb1);
    }

    /*public static void modifyStringBuilder(String s, StringBuilder sb){
        for (int i = 0; i < s.length(); i++) {
            int chCode = s.charAt(i) - 49;
            if (chCode < sb.length() && chCode >= 0) {
                sb.setCharAt(chCode, s.charAt(i));
            }
        }
    }*/
}