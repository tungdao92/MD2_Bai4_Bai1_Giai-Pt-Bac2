public class PtBac2 {
    double a, b, c;
    public PtBac2 (){

    }
    public PtBac2 ( double a, double b, double c){
        this.a = a;
        this.b  = b;
        this.c =  c;
    }
    public double getDelta(){
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    public double getRoot1(){
        return (this.b*(-1) + Math.pow((Math.pow(this.b, 2) - 4*this.a*this.c),0.5))/2*this.a;
    }
    public double getRoot2(){
        return (this.b*(-1) - Math.pow((Math.pow(this.b, 2) - 4*this.a*this.c),0.5))/2*this.a;
    }

}
