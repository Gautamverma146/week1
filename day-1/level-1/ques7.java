

class ques7{
public static void main(String []args){
double radius = 6378;
double pi =3.14;
double volumeofearth = 4/3 *pi * Math.pow(6378,3);
double volofearthinmiles = volumeofearth * 1.6;
System.out.println("The volume of earth in cubic kilometers is "+ volumeofearth + " and cubic miles is " + volofearthinmiles);
}
}