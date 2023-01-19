package hw2_7;

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212533, "Иванов Иван Иванович");
        passportsAndNames.put(158565, "Петрова  Инга Ивановна");
        passportsAndNames.put(123456, "Сидоров Андрей Сергеевич");
        passportsAndNames.put(123456, "Манохин Василий Васильевич");

        passportsAndNames.remove(212533, "Иванов Иван Иванович");
        System.out.println(passportsAndNames);

        System.out.println(passportsAndNames);
        System.out.println(passportsAndNames.containsKey(123321));
        System.out.println(passportsAndNames.containsValue("Петрова  Инга Ивановна"));
    }


}





