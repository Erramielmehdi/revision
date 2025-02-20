package revision;

public class principale {

	public static void main(String[] args) {
		Position p=new Position(0, 0);
		Robot r1=new Robot(1,"Romeo","Red",1,p,"est");
		System.out.println("Etat initial     : "+r1);
		r1.avanver(1);
		System.out.println("Etat apres avancer     : "+r1);
		r1.reculer(1);
		System.out.println("Etat apres reculer     : "+r1);
		System.out.println("fin");

	}

}