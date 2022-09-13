import java.util.Scanner;

public class Rectangle {
    //har fyra instansvariabler: x, y, width och height
    Scanner sc = new Scanner(System.in);
        double y;
        double x;
        double width;
        double length;

    //har tre konstruktörer
    // en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
        public Rectangle (double width, double length,double x, double y){
            this.y = y;
            this.x= x;
            this.width= width;
            this.length= length;
    }
    //en som inte tar emot ngt och som sätter alla instansvariabler till 0
    public Rectangle (){
        this.y =0;
        this.x= 0;
        this.width=0;
        this.length=0;

    }
    //en som tar emot två värden som sätts in i width och height medan x och y sätts till 0
    public Rectangle (double width, double length){
        this.width = width;
        this.length= length;
        this.y =0;
        this.x= 0;

    }

    //en instansmetod calculateArea som returnerar en double med rektangelns area
    public double calculateArea(double width, double length){
        this.width= width;
        this.length= length;
        return (length*width);
    }


    //en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
    public double calculatePerimeter(double width, double length){
        this.width= width;
        this.length= length;
        return (length*2+width*2);
    }


    //en instansmetod setXY som låter dig sätta instansvariablerna x och y

    public void setXY(double x, double y){

        this.x = x;
        this.y = y;


    }
    //två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler*/
    public void setWidth(double width){

        this.width = width;


    }
    public void setLength(double length){

        this.length= length;


    }



}
