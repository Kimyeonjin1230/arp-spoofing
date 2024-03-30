package org.example;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {

        InetAddress ip = null; // ip 객체 생성
        try{
            ip = InetAddress.getByName("www.google.com");
            System.out.println("host name : " + ip.getHostName()); //www.google.com
            System.out.println("host address : " + ip.getHostAddress()); // google의 ip주소
            System.out.println("my address : " + InetAddress.getLocalHost().getHostAddress()); //내 local의 ip주소
        } catch (Exception e){
            e.printStackTrace(); // 오류발생시 printStackTrace를 이용해서 어떤 오류인지 출력

        }

    }
}