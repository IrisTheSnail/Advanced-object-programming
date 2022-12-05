import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args)
            throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        // get the localhost IP address, if server is running on some other IP, you need
        // to use that

        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        int j = 0;
        for (int i = 0; i < 5; i++) {
            // establish socket connection to server
            socket = new Socket(host.getHostName(), 9876);
            // write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            if (i == 4)
                oos.writeObject("exit");
            else {
                // oos.writeObject(); //put string inside
                j = (int) (Math.random() * 10);
                switch (j) {
                    case 0:
                        oos.writeObject("how ot pray forever");
                        break;
                    case 1:
                        oos.writeObject("The apple doesn't fall far from the tree.");
                        break;
                    case 2:
                        oos.writeObject("All that glitters is not gold.");
                        break;
                    case 3:
                        oos.writeObject("A picture is worth a thousand words.");
                        break;
                    case 4:
                        oos.writeObject("who am I?.");
                        break;
                    case 5:
                        oos.writeObject("A bird in the hand is worth two in the bush.");
                        break;
                    case 6:
                        oos.writeObject("all heil the Crab.");
                        break;
                    case 7:
                        oos.writeObject("Better safe than sorry.");
                        break;
                    case 8:
                        oos.writeObject("Blood is thicker than water.");
                        break;
                    case 9:
                        oos.writeObject("Kazyinski was right, we should retur nto monke");
                        break;
                }
            }
            // read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            // close resources
            ois.close();
            oos.close();
            Thread.sleep(100);
        }
    }
}
