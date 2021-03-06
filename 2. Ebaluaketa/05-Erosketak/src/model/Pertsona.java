/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author olivas.hodei
 */
public class Pertsona implements Bezeroa {

    private int kodea;
    private String izena;
    private String abizena;
    private String helbidea;
    private String emaila;

    public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
        this.kodea = kodea;
        this.izena = izena;
        this.abizena = abizena;
        this.helbidea = helbidea;
        this.emaila = emaila;
    }

    @Override
    public String getIzena() {
       return izena + abizena;
    }

    @Override
    public String getEmaila() {
        return emaila;
    }

    @Override
    public int getKodea() {
       return kodea;
    }

    @Override
    public String getHelbidea() {
       return helbidea;
    }

    @Override
    public String toString() {
        return "Pertosna{" + "kodea=" + kodea + ", izena=" + izena + ", abizena=" + abizena + ", helbidea=" + helbidea + ", emaila=" + emaila + '}';
    }

}
