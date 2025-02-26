package revision;

import java.util.HashMap;
import java.util.Map;

public class Robot {
int id;
String nom;
String couleur;
int vitesse;
Position position;
String direction;
public Robot() {}
public Robot(int id, String nom, String couleur, int vitesse, Position position,String direction) {
	this.id = id;
	this.nom = nom;
	this.couleur = couleur;
	this.vitesse = vitesse;
	this.position = position;
	this.direction=direction;
}
@Override
public String toString() {
	return "{Nom="+nom+",Position="+position+"}";
}
public void avancer(int vitesse) {
	this.position.deplacer(direction, vitesse);
}
//reculer
public void reculer(int vitesse) {
	Map<String, String> dir=new HashMap<String, String>();
	dir.put("nord", "sud");dir.put("sud", "nord");
	dir.put("est", "ouest");dir.put("ouest", "est");
	
	this.position.deplacer(dir.get(direction), vitesse);
}
//Tourner à droite
public void tournerDroite() {
	switch(this.direction) {
	case "nord":this.direction="est";break;
	case "est":this.direction="sud";break;
	case "sud":this.direction="ouest";break;
	case "ouest":this.direction="nord";break;
	}
}
//Tourner à gauche
public void tournerGauche() {
	switch(this.direction) {
	case "nord":this.direction="ouest";break;
	case "ouest":this.direction="sud";break;
	case "sud":this.direction="est";break;
	case "est":this.direction="nord";break;
	}
}

}