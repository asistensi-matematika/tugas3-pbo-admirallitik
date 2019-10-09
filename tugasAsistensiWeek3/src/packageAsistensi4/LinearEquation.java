package packageAsistensi4;

public class LinearEquation {
    private double a, b, c, d, e, f;
	    
	    public LinearEquation(){
	        this.a = 0;
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	    }
	
	    public LinearEquation(double a, double b, double c, double d, double e, double f) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.d = d;
	        this.e = e;
	        this.f = f;
	    }
	
	    public double getA() {
	        return a;
	    }
	
	    public void setA(double a) {
	        this.a = a;
	    }
	
	    public double getB() {
	        return b;
	    }
	
	    public void setB(double b) {
	        this.b = b;
	    }
	
	    public double getC() {
	        return c;
	    }
	
	    public void setC(double c) {
	        this.c = c;
	    }
	
	    public double getD() {
	        return d;
	    }
	
	    public void setD(double d) {
	        this.d = d;
	    }
	
	    public double getE() {
	        return e;
	    }
	
	    public void setE(double e) {
	        this.e = e;
	    }
	
	    public double getF() {
	        return f;
	    }
	
	    public void setF(double f) {
	        this.f = f;
	    }
	    
	    public void printInfo(){
	        System.out.println("Sistem persamaannya :");
	        System.out.println(+getA()+ "x + " +getB()+ "y = " +getE());
	        System.out.println(+getC()+ "x + " +getD()+ "y = " +getF());
	    }
	    
	    public double getEX(){
	        double ex;
	        ex = ( (getE() * getD())-(getB() * getF()) ) / ( (getA() * getD())-(getB() * getC()) );
	        return ex;
	    }
	    
	    public double getYE(){
	        double ye;
	        ye = ( (getA() * getF()) -(getE() * getC()) ) / ( (getA() * getD())-(getB() * getC()) );
	        return ye;
	    }
	    
	    public void cekSolusi(){
	        double solusi;
	        solusi = (getA()*getD())-(getB()*getC());
	        if(solusi != 0){
	            System.out.println("Hasilnya :");
	            System.out.print("x = "+getEX()+","+" y = "+getYE());
	        }else{
	            System.out.println("Sistem tidak memiliki penyelesaian.");
	        }
	    }
}


