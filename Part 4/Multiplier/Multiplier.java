/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopi
 */
public class Multiplier {
    private int inputNumber;
    public Multiplier (int number){
        this.inputNumber = number;
    }
    public int multiply (int number){
        int multiplier = number * this.inputNumber;
        return multiplier;
    }
}
