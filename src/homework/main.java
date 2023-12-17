package homework;

import javax.naming.Name;

public class main {
    public static void main(String[] args) {

        Date birthDate = new Date(3, 6, 2001);
        Date cardIssuedDate = new Date(1, 6, 2023);

        Client client = new Client("Иванов Иван Иванович", birthDate, cardIssuedDate);
        System.out.println();




    }
}
