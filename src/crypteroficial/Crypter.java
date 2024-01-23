/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crypteroficial;

/**
 *
 * @author Bruno Reinicke
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crypter {

    public void percorreArq() {
        FileReader fr;
        BufferedReader reader;
        try {
            fr = new FileReader("C:/Users/Bruno Reinicke/Documents/Hacking/Senhas_0.txt");
            reader = new BufferedReader(fr);
            
            String line = "";         
            while (line != null) {
                line = reader.readLine();
                
                if (line != null) {
                    String[] lstLine = line.split(" = ");
                    this.SaveToFile(lstLine[0] + " = " + lstLine[1]);
                    
                    if (!(new Caracteres().crypt(lstLine[0]).equals(lstLine[1]))) {
                        System.out.println(line);
                        System.exit(0);
                    }
                }
            }
            System.out.println("ok");
        } catch (IOException ex) {
            Logger.getLogger(Crypter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SaveToFile(String line) {
        FileWriter fw;
        BufferedWriter writer;
        try {
            fw = new FileWriter("C:/Users/Bruno Reinicke/Documents/Hacking/Cipher_0.txt", true);
            writer = new BufferedWriter(fw);
            writer.write(line);
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Crypter.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
}