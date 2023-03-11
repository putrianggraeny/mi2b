/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class KelasInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        Person p = new Person();
        p.setNama(sc.nextLine());
        System.out.println("Nama anda adalah "+p.getNama());
    }
    
}
