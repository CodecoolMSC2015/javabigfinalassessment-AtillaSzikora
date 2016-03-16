package server;

import person.Person;
import person.Skill;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class PersonStoreServerSocket {

    ServerSocket serverSocket;
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    Set skillSet;
    Set<Person> personSet = new HashSet<>();

    public PersonStoreServerSocket() {
        try {
            serverSocket = new ServerSocket(1234);
            System.out.println("Server is waiting for connection...");
            socket = serverSocket.accept();
            ois = new ObjectInputStream(socket.getInputStream());
            skillSet = (Set)ois.readObject();
            System.out.println(skillSet + " skillSet arrived from client.");

            Person jozsi = new Person("Jozsef", "jo@zs.ef");
            Skill skillsOfJozsef = new Skill("DB", "SQL, XML");
            jozsi.addSkill(skillsOfJozsef);
            personSet.add(jozsi);
            
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(personSet);
            System.out.println(personSet + " is sent to the client.");

            oos.close();
            ois.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {e.printStackTrace();} }

    public static void main(String[] args) {new PersonStoreServerSocket(); }
}
