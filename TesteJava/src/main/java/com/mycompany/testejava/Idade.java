/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testejava;
import java.util.Scanner;

/**
 * Atividade 1 da lista de exercicios em anexo
 * @author user
 */
public class Idade {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Digite a sua idade em numeros: ");
        int idade = Input.nextInt();
        System.out.println("Digite quantos mese : ");
        int meses = Input.nextInt();
        System.out.println("Digite quantos dias: ");
        int dias = Input.nextInt();
        
        float quantidadeDiasTotal = 0;
        quantidadeDiasTotal = quantidadeDiasTotal + (idade * 365);
        quantidadeDiasTotal = quantidadeDiasTotal + (meses * 30);
        quantidadeDiasTotal = quantidadeDiasTotal + dias;
        System.out.println("Você Possui " + quantidadeDiasTotal + " Dias");
    }
}
