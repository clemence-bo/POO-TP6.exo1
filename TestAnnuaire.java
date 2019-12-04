package TP6.exo1;

public class TestAnnuaire {
    public static void main (String[]args){
        Personne p=new Personne("Chocolat","David");
        Personne p1=new Personne("Gateaux","Bernard");
        Personne p2=new Personne("Flan","Vic");

        NumTel num=new NumTel(02,NumTel.FIXE_DOM);
        NumTel num1=new NumTel(07,NumTel.PORTABLE);
        NumTel num2=new NumTel(03,NumTel.INCONNU);
        NumTel num3=new NumTel(05,NumTel.FAX);
        NumTel num4=new NumTel(06,NumTel.PORTABLE);
        NumTel num5=new NumTel(02,NumTel.FIXE_PROF);

        ListeNumTel liste=new ListeNumTel(num);
        liste.ajouter(1,num1);
        liste.ajouterFin(num3);
        ListeNumTel liste1=new ListeNumTel(num4);
        liste1.ajouterDebut(num5);

        Annuaire a=new Annuaire();
        a.ajouterEntree(p,liste);
        a.ajouterEntree(p2,liste1);
        a.ajouterNumeroFin(p1,num2);
        System.out.println(a.toString());
        a.supprimerNumero(02,p);
        System.out.println(a.toString());
    }
}
