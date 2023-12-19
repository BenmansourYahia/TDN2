package exercice5;
public class Rectangle {
	private int L,l;
	
	
	public Rectangle() {
	}
	public Rectangle(int L,int l) {
		this.L=L;
		this.l=l;
		
		
	}
	public Rectangle(Rectangle rectangle) {
		this.l=rectangle.getL();
		this.l=rectangle.getl();
		
	}
	public int getl() {
		return l;
	}
	public void setl(int l) {
		if(l>=0)
			this.l=l;
		else
			this.l=0;
	}
	
	public int getL() {
		return L;
	}
	public void setL(int L) {
		if(L>=0)
			this.L=L;
		else
			this.L=0;
	}
	public double perimetre() {
		return 2*(L+l);
	}
	public double aire (){
		return L*l;
	}
	public boolean isCarree() {
		return L==l;
	}
	@Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + L +
                ", largeur=" + l +
                ", perimetre=" + perimetre() +
                ", aire=" + aire() +
                ", isCarre=" + (isCarree() ? "Oui" : "Non") +
                '}';
	}
}

