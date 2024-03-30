package org.example.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private  ServerSocket server = null;
    private Socket socket;
    private BufferedReader reader;

    public void start(){
        try{
            server = new ServerSocket(12345);
            System.out.println("The server has been activated.");
            while (true){
                getMessage();
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if (reader != null) reader.close();
                if (socket != null) socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private void getMessage() {
        try{
            while(true){
                socket = server.accept(); //socket변수에는 client의 접속을 기다리는 메서드가 있음
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//해당 사용자가 보내는 메시지를 읽을 수 있도로 만들어줌
                System.out.println("client :" + reader.readLine()); //inputstream -> inputstreamreader -> bufferedreader -> readline
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


