package main.java.demenagement;

public class Demenagement {
   public static void main(String[] args) {
     byte nbCartons = 34;
     byte capaciteCamion = 9;
     byte cartonsArrives = 0;
     byte voyage = 0;

     while (nbCartons > 0) {
        voyage ++;
        if (nbCartons >= capaciteCamion) {
           nbCartons -= capaciteCamion;
           cartonsArrives += capaciteCamion;
        } else {
           cartonsArrives += nbCartons;
           nbCartons = 0;
        }
      System.out.println("Après le voyage n°" + voyage + ", le nombre de cartons est de " + cartonsArrives + ", il reste donc " + nbCartons + " cartons.");
      }
   }
}