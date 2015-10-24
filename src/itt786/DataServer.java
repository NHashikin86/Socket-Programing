/*
 * To change this license header, choose License Headers in Project Properties.
* Assigment 3
 */
package itt786;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author User
 */
public class DataServer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try ( // TODO code application logic here
                ServerSocket listener = new ServerSocket(9090)) {
            while (true) {
                try (Socket socket = listener.accept()) {
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());}
                
            }
        }
    } 

    }