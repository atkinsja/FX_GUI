/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_javaFX;

import java.text.*;

public class Taxpayer {

    protected String name;
    protected int ssNumber;
    protected double grossPay;
    protected String type;
    protected String occupationName;

    public Taxpayer() {
        name = "";
        ssNumber = 0;
        grossPay = 0;
    }

    public Taxpayer(String newName, int newSSNum, double newGrossPay) {
        this.name = newName;
        this.ssNumber = newSSNum;
        this.grossPay = newGrossPay;
    }
    
    public Taxpayer(String newName, int newSSNum, String newType){
        this.name = newName;
        this.ssNumber = newSSNum;
        this.type = newType;
    }
    
    public Taxpayer(String newName, int newSSNum, double newGrossPay, String newType, String newOccupation)
    {
        this.name = newName;
        this.ssNumber = newSSNum;
        this.grossPay = newGrossPay;
        this.type = newType;
        this.occupationName = newOccupation;
    }

    public String getName() {
        return this.name;
    }
    
    public String getOccupation(){
        return this.occupationName;
    }
    
    public String getType(){
        return this.type;
    }
    public String getSSNumber() {

        String ssString = "";
        int ss1 = this.ssNumber / 1000000;
        int ss2 = this.ssNumber % 1000000 / 10000;
        int ss3 = this.ssNumber % 10000;
        ssString = ss1 + "-" + ss2 + "-" + ss3;
        if (this.ssNumber < 1) {
            ssString = "000-00-0000";
        } else if (this.ssNumber < 10) {
            ssString = "00" + ss1 + "-0" + ss2 + "-000" + ss3;
        } else if (this.ssNumber < 100) {
            ssString = "00" + ss1 + "-0" + ss2 + "-00" + ss3;
        } else if (this.ssNumber < 1000) {
            ssString = "00" + ss1 + "-0" + ss2 + "-0" + ss3;
        } else if (this.ssNumber < 100000) {
            ssString = "00" + ss1 + "-0" + ss2 + "-" + ss3;
        } else if (this.ssNumber < 10000000) {
            ssString = "00" + ssString;
        } else if (this.ssNumber < 100000000) {
            ssString = "0" + ssString;
        }
        return ssString;
    }

    public double getGrossPay() {
        return this.grossPay;
    }

    public double computeStateTax(double pay) {
        return 0.0;
    }

    public double computeFederalTax(double pay) {
        return 0;
    }

    @Override
    public String toString() {
        DecimalFormat prec1 = new DecimalFormat("$#.00");

        String outputStr = " Name: " + getName()
                + ", SSN: " + getSSNumber()
                + "\nTaxpayer Type: " + getType()
                + ", Occupation: " + getOccupation()
                + "\nGross Pay: " + prec1.format(getGrossPay());

        return outputStr;
    }

}
