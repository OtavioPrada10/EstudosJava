/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testejava;

import javax.swing.InputMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TesteJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Digite uma Palavra: ");
        Scanner Input = new Scanner(System.in);
        var teste = Input.next();
        System.out.println("A palavra que você digitou foi: "+ teste);
        
    }
}
