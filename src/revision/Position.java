package revision ;
public class Position {
int x;
int y;
public Position(int x,int y) {
	this.x=x;
	this.y=y;
}
public Position() {}
public void deplacer(String direction, int vitesse) {
	switch (direction) {
	case "nord":this.y=this.y+vitesse;break;
	case "sud":this.y=this.y-vitesse;break;
	case "est":this.x=this.x+vitesse;break;
	case "ouest":this.x=this.x-vitesse;break;
	default: System.out.println("Direction inconnue");
	}
}
@Override
public String toString() {
	return "{x="+x+",y="+y+"}";
}
}