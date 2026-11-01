import java.util.Scanner;
public class SimulTamagotchi {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 // Demander le nombre de Tamagotchis
System.out.print("Combien de Tamagotchis voulez-vous ? ");
int n = sc.nextInt();
 Tamagotchi[] animaux = new Tamagotchi[n];
// Créer les Tamagotchis
for (int i = 0; i < n; i++) {
System.out.print("Quel nom pour le nouveau tamagotchi : ");
 String nom = sc.next();
 animaux[i] = new Tamagotchi(nom);
 }
 int cycle = 1;
 boolean perdu = false;
 boolean gagne = false;
 // Boucle principale
 while (!perdu && !gagne) {
 System.out.println("\n------- Cycle no " + cycle + " -------");
 // Faire vivre tous les Tamagotchis
 for (int i = 0; i < n; i++) {
     if (!animaux[i].vivre()) {
         perdu = true;
          break;
         }
         }
     if (perdu) {
     System.out.println("\nPERDU !!");
      break;
     }
 // Vérifier si tous ont atteint leur âge limite
  gagne = true;
 for (int i = 0; i < n; i++) {
     if (animaux[i].estActif()) {
         gagne = false;
          break;
         }
         }
 if (gagne) {
     System.out.println("\nGAGNE !!");
      break;
     }
// Afficher les Tamagotchis encore actifs
 for (int i = 0; i < n; i++) {
     if (animaux[i].estActif()) {
         System.out.print("(" + i + ") "+ animaux[i].getNom() + " ");
         }
         }
 System.out.println();
 // Demander quel Tamagotchi nourrir
 int choix;
 do {
     System.out.print("Nourrir quel tamagotchi ? ");
      choix = sc.nextInt();
     } while (choix < 0 || choix >= n || !animaux[choix].estActif());
animaux[choix].manger();
 cycle++;
 }
 sc.close(); 
}
}