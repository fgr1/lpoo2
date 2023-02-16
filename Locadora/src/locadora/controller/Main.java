/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locadora.controller;

import locadora.view.JanelaIndex;

public class Main {

    public static void main(String[] args) {
        JanelaIndex view = new JanelaIndex();
        IndexController controller = new IndexController(view);
    }
    
}
