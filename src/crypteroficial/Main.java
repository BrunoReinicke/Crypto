/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crypteroficial;

/**
 *
 * @author Bruno Reinicke
 */
public class Main {
    
    public static void main(String[] args) {
       /* String senha = "!#$%&'()*+,-./0123456789:;<=>?@abcdefghijklmnopqrstuvwxyz[]^_`ABCDEFGHIJKLMNOPQRSTUVWXYZ\\";
        String cipher = "ÏÐÑÒÓÔÕÖ×ØÙÚÛÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúÜÎ¡£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍ"; */
       System.out.println(new Caracteres().crypt("#$%&'()*+,").equals("ö÷øùúñòóôõ"));
       System.out.println(new Caracteres().decrypt("ö÷øùúñòóôõ").equals("#$%&'()*+,"));
    }
}