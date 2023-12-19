package exercice2;
public class Point {
	private double X,Y;
	public String nom;
public Point(double X,double Y,String nom) {
	this.X=X;
	this.Y=Y;
	this.nom=nom;
}
public Point() {
	
}
public double getX(){
	return X;
	
}
public double getY(){
	return Y;
	
}
public String getnom(){
	return nom ;
}
public double setX(double X) {
	return this.X=X;
	
}
public double setY(double Y) {
	return this.Y=Y;
	
}
public String setnom(String nom) {
	return this.nom=nom;
	
}
public double Norme() {
	return  Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2));
	
}

public String toString (double X,double Y,String nom) {
	return "le point du nom"+nom+"de coordonées d'abscisse et ordonnées("+this.X+","+this.Y+") de norme"+this.Norme(); 
}
}