import java.io.*;
import java.net.*;

class ClientServer{
	public static void main(String args[]){

		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;

		try{
			socket = new Socket("Localhost",1234);
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

			String messageFromServer;
			do {
                		messageFromServer = dis.readUTF();
                		System.out.println("Server Says: " + messageFromServer);
                		if (!messageFromServer.equalsIgnoreCase("Bye")) {
                    		System.out.print("Client: ");
                    		String response = userInput.readLine();
                    		dos.writeUTF(response);
                		}
            		} while (!messageFromServer.equalsIgnoreCase("Bye"));

		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}
