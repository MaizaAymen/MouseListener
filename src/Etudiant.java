package swind;

public class Etudiant {
    private String nom;
    private String ville;
    private int age;

    public Etudiant(String nom, String prenom, String email) {
        this.nom = nom;
        this.ville = ville;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }
    public String getVille() {
        return ville;
    }

    public int getAge() {
        return age;
    }
}
