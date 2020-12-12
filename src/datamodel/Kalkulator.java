/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import operasi.Operasi;
import operasi.OperasiScienFic;

/**
 *
 * @author SYARIF
 */
public class Kalkulator implements Operasi, OperasiScienFic{
  private Double x, y;
  
  public Kalkulator(){
      
  }
  
  public Kalkulator(Double x, Double y){
      this.x=x;
      this.y=y;
  }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public Double penjumlahan() {
        return x+y;
    }

    @Override
    public Double pengurangan() {
        return x-y;
    }

    @Override
    public Double perkalian() {
        return x*y;
    }

    @Override
    public Double pembagian() {
        return x/y;
    }

    @Override
    public Double akar() {
       //hitung akar x
         return Math.sqrt(x);
    }

    @Override
    public Double pangkat() {
        //hitung x pangkat y
        return Math.pow(x, y);
    }

    @Override
    public Double modulus() {
        return x%y;
    }
  public void tampilopDasarKonstanta(){
      
  }
}
