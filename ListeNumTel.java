package TP6.exo1;

import java.util.*;

public class ListeNumTel {
    private List<NumTel> liste;

    public ListeNumTel(NumTel num) {
        liste = new ArrayList<NumTel>();
        liste.add(num);
    }
    boolean ajouter(int index, NumTel num){
        boolean ajout=false;
        if(!liste.contains(num)){
            liste.add(index, num);
            ajout=true;
        }
        return ajout;
    }
    boolean ajouterFin(NumTel num){
        boolean ajout=false;
        if(!liste.contains(num)){
            liste.add(0,num);
            ajout=true;
        }
        return ajout;
    }
    boolean ajouterDebut(NumTel num){
        boolean ajout=false;
        if(!liste.contains((num))){
            ajout=liste.add(num);
        }
        return ajout;
    }
    public Iterator<NumTel> iterator(){
        return liste.iterator();
    }
    boolean contientNumero(int num){
        NumTel r=new NumTel(num);
        return liste.contains(r);
    }
    int nbNumeros() {
        return liste.size();
    }
    NumTel numero(int index){
        if(index>=0 && index<liste.size()){
            return liste.get(index);
        }
        throw new IndexOutOfBoundsException("Index doit être positif ou inférieur au nombre de numéros");
    }
    NumTel premierNumero(){
        return liste.get(0);
    }
    boolean retirer(int num){
        boolean retire=false;
        if(liste.size()>=2){
            NumTel r=new NumTel(num);
            retire=liste.remove(r);
        }
        return retire;
    }
    public String toString(){
        return liste.toString();
    }

}