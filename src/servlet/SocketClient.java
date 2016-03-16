package servlet;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Set;

public class SocketClient {

    Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public SocketClient() {
        try {
            socket = new Socket("localhost", 1234);
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(SearchServlet.skillSet);

            ois = new ObjectInputStream(socket.getInputStream());
            SearchServlet.personSet = (Set) ois.readObject();

            ois.close(); oos.close(); socket.close();
        } catch (Exception e) {e.printStackTrace();} }
}
