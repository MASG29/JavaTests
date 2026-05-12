package Input.Output;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Introduction {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Add code below:
        System.out.println("What's your name?");
        String userName = input.next();
        System.out.printf("Hello %s! It's nice to meet you.", userName);

        FileWriter writer = new FileWriter("output.txt");
        String outputText = "teste";
        writer.write(outputText);
        writer.close();


        String path = "./input.txt";
        FileReader reader = new FileReader(path);
        int data = 0;
        while ((data = reader.read()) != -1) {
        System.out.print((char)data);
        }
        reader.close();



    }
}