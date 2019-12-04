package TP6.exo1;

import java.util.*;

public class Annuaire {
    private Map<Personne, ListeNumTel> annuaire;

    public Annuaire(){
        annuaire= new HashMap<Personne, ListeNumTel>();
    }
    boolean ajouterEntree(Personne p, ListeNumTel nums){
        ListeNumTel l=annuaire.putIfAbsent(p,nums);
        if(l==null)
            return true;
        return false;
    }
    ListeNumTel numeros(Personne p){
        return annuaire.get(p);
    }
    public Iterator<Personne> personne(){
        Set<Personne> pers=annuaire.keySet();
        return pers.iterator();
    }
    public void ajouterNumeroFin(Personne p, NumTel n){
        ListeNumTel listeN=numeros(p);
        if(listeN!=null) {
            listeN.ajouterFin(n);
        }else{
            listeN=new ListeNumTel(n);
            annuaire.put(p,listeN);
        }
    }
    public NumTel premierNumero(Personne p){
        NumTel num=null;
        ListeNumTel listeN=numeros(p);
        if(listeN!=null){
            num=listeN.premierNumero();
        }
        return num;
    }
    public void supprimer(Personne p){
        annuaire.remove(p);
    }
    public void supprimerNumero(int n, Personne p){
        ListeNumTel listeN=numeros(p);
        if(listeN!=null){
            if(listeN.nbNumeros()==1)
                supprimer(p);
            else
                listeN.retirer(n);
        }
    }
    public Set<Personne> lesEntreePour (String nom){
        Set<Personne> lesPersonnes = new HashSet<Personne>();
        Iterator<Personne> it = personne();
        while (it.hasNext()){
            Personne suivant = it.next();
            if (suivant.getNom_().equalsIgnoreCase(nom))
                lesPersonnes.add(suivant);
        }
        return lesPersonnes;
    }
    public String toString(){
        String s = "";
        Set<Map.Entry<Personne, ListeNumTel>> lesEntrees= annuaire.entrySet();
        Iterator<Map.Entry<Personne, ListeNumTel>> it = lesEntrees.iterator();
        while (it.hasNext()) {
            Map.Entry<Personne, ListeNumTel> uneEntree = it.next();
            s = s + uneEntree.toString() + "\n";
        }
        return s;
    }
}
