package revision ;
public class principale {

	public static void main(String[] args) {
		Position p=new Position(0, 0);
		Robot r1=new Robot(1,"Romeo","Red",1,p,"est");
		System.out.println("Etat initial      : "+r1);
		r1.avancer(1);
		System.out.println("Etat après avancer: "+r1);
		r1.reculer(1);
		System.out.println("Etat après reculer: "+r1);
		

	}

}