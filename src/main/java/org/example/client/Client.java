package org.example.client;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private PrintWriter writer;
    private Socket socket;

    public void start(){
        try{
            socket = new Socket("127.0.0.1", 12345);
            System.out.println("Connected to server");
            writer = new PrintWriter(socket.getOutputStream(),true);
            Scanner scan = new Scanner(System.in);
            while(true){
                writer.println(scan.next());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
