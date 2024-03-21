package animal;

public class Main {
    public static void main(String [] args){
        Chat chat = new Chat();
        chat.setNom("Safir");
        chat.setAge(1);

        Chien chien = new Chien();
        chien.setNom("Médor");
        chien.setAge(3);

        System.out.println(chat.toString());
        chat.crier();

        System.out.println(chien.toString());
        chien.crier();


    }
}
