/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PratikumNo1 {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/home/shob/Documents/note/file.txt");
        if (f.isFile() && f.canRead()) {
            System.out.println("\n");
            System.out.println("File Exist...");

            try {

                String text = "Nama: Ahmad Shobirin \nNBI: 1461900011 \n";

                FileOutputStream fop = new FileOutputStream(f);

                byte[] contentInBytes = text.getBytes();

                fop.write(contentInBytes);
                fop.flush();
                fop.close();

                System.out.println("Write Text Into File Successful...");

            } catch (IOException ex) {
                System.err.println(ex);
            }

            System.out.println("Try to Read a File ...");
            System.out.println("\n---\n");

            Scanner input = new Scanner(f);

            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            System.out.println("\n---\n");
        }
    }
}
