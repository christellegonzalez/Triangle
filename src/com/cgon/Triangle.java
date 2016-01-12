package com.cgon;

public class Triangle {
	private double coteA;
    private double coteB;
    private double coteC;
    
    public Triangle(){
          this(0.0,0.0,0.0);
    
    }
    
    public Triangle(double coteA, double coteB, double coteC){
          this.coteA = coteA;
          this.coteB = coteB;
          this.coteC = coteC;
    }
    
    double getCoteA() {
          return coteA;
    }

    void setCoteA(double coteA) {
          this.setCoteA(coteA);
    }

    double getCoteB() {
          return coteB;
    }

    void setCoteB(double coteB) {
          this.coteB = coteB;
    }

    double getCoteC() {
          return coteC;
    }

    void setCoteC(double coteC) {
          this.coteC = coteC;
    }

    public void isEquilateral(Triangle triangle){
        if(coteA == coteB && coteA == coteC & coteB==coteC){
               System.out.println(" khalil vous dit que ce triangle est équilatéral");
        }else{
               System.out.println(" khalil vous dit que ce triangle n'est pas equilatéral");
        }
  }


}
