public class Tamagotchi {
private int age;
private int dureeDeVie;
private int maxEnergie;
private int energie;
private String nom;
// 2. Le constructeur
public Tamagotchi(String nom) {
 this.nom = nom;
 this.age = 0;
 this.dureeDeVie = 9 + (int)(Math.random() * 6);
 this.maxEnergie = 5 + (int)(Math.random() * 5);
 this.energie = 3 + (int)(Math.random() * (maxEnergie - 2));}
// 3. Faire parler le Tamagotchi
public void parler() {
 if (energie > 5) {
 System.out.println(nom + " : tout va bien !");
 } else {
 System.out.println(nom + " : je suis affame !");
 }
 }
// 4. Nourrir le Tamagotchi
public void manger() {
    if (energie == maxEnergie) {
         System.out.println(nom + " : je n'ai pas faim !!");
         } else{ 
             int nourriture = 1 + (int)(Math.random() * 3);
 energie = energie + nourriture;
 if (energie > maxEnergie) {
     energie = maxEnergie;
     }
 System.out.println(nom + " : Merci !");
         }
         }
// 5. Vérifier si le Tamagotchi a atteint son âge limite
public boolean ageLimite() {
return age >= dureeDeVie;}
// 6. Faire vivre le Tamagotchi
public boolean vivre() {
 if (ageLimite()) {
     return true; }
 if (energie <= 0) {
     System.out.println(nom + " : je meurs... Arrrggh !");
      return false;
     }
 age++;
 energie--;
if (ageLimite()) {
    System.out.println(nom + " : c'est gagne pour moi !");
 } else {
     parler();
     }
 return true; }
// Méthode pour afficher le nom
public String getNom() {
return nom;
}
 // Méthode pour vérifier si le Tamagotchi est encore actif
public boolean estActif() {
     return !ageLimite();
    }}