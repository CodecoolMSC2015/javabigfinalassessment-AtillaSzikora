package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Set;

public class PersonStoreServerSocket {

    ServerSocket serverSocket;
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;
    Set skillSet;
    List personList;

    public PersonStoreServerSocket() {
        try {serverSocket = new ServerSocket(1234);
            socket = serverSocket.accept();
            ois = new ObjectInputStream(socket.getInputStream());
            skillSet = (Set)ois.readObject();

            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(personList);

            oos.close(); ois.close(); socket.close(); serverSocket.close(); }
        catch (Exception e) {e.printStackTrace();} }

    public static void main(String[] args) {new PersonStoreServerSocket(); }
}
