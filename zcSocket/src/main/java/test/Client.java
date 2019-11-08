package test;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/11/8</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/11/8 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        while (true) {
            try {
                socket = new Socket("127.0.0.1", 9999);
            } catch (ConnectException e) {
                System.out.println("java.net.ConnectException: Connection refused: connect");
            } catch (UnknownHostException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (socket == null) {
                    continue;
                } else {
                    System.out.println("连接成功..........");
                    break;
                }

            }
        }
        try {
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                printWriter.println(line);
                printWriter.flush();
                System.out.println("send:" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
