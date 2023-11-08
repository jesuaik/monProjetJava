/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.apprentissage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author christ ikondo
 */
public class PharmacieTest {

    public static void main(String[] args) {

        int compteur = 0;
        boucle:
        while (compteur < 100) {

            for (int compte = 0; compte < 10; compte++) {
                compteur += compte;
                System.out.println("compteur = " + compteur);
                if (compteur > 40) {
                    break boucle;
                }
            }
        }
//        Pharmacie p = new Pharmacie();
        // p.afficherInfoPharmacie("gbossimé", "gbossimé", "tel:224566");
//        String[] tabPharma = {"p.afficherInfoPharmacie(\"gbossimé\", \"gbossimé\", \"tel:2265566\")",
//            "p.afficherInfoPharmacie(\"terminus\", \"vagbassito\", \"tel:223466\")",
//            "p.afficherInfoPharmacie(\"kisito\", \"3/4\", \"tel:226366\")",
//            "p.afficherInfoPharmacie(\"campus\", \"adewi\", \"tel:22566\")",
//            "p.afficherInfoPharmacie(\"vision\", \"tokoin\", \"tel:223466\")",
//            "p.afficherInfoPharmacie(\"orchidée\", \"leo2000\", \"tel:226466\")",
//            "p.afficherInfoPharmacie(\"nkouikou\", \"iai\", \"tel:225666\")"};
////la premiere facon d'ecrire une boucle for
////        for (int i = 0; i < 6; i++) {
////            //System.out.println(i);
////            // p.afficherInfoPharmacie("gbossimé", "gbossimé", "tel:224566");
////            System.out.println(tabPharma[i]);
////        }
////une autre facon d'ecrire une boucle for
////        for (String tab : tabPharma) {
////            System.out.println(tab);
////        }
        LinkedList<Pharmacie> pharmacieList = new LinkedList<>();
        Pharmacie p1 = new Pharmacie("gbossimé");
        Pharmacie p2 = new Pharmacie("kisito");
        Pharmacie p3 = new Pharmacie("campus");
        pharmacieList.add(p1);
        pharmacieList.add(p2);
        pharmacieList.add(p3);
        System.out.println(pharmacieList);

        List<String> entrepriseList = new ArrayList<>();
        entrepriseList.add("cagecfi");
        entrepriseList.add("anpe");
        entrepriseList.add("anadeb");
        System.out.println(entrepriseList);

        ArrayList<String> familleList = new ArrayList<>();
        familleList.add("ikondo");
        familleList.add("tagba");
        familleList.add("elenga");
        Collections.sort(familleList);
        System.out.println(familleList);
        //on aimerai savaoir si tagba existe dans cette liste
//       if(familleList.contains("tagba")){
//           System.out.println("oui, elle existe");
//       }
//       else{System.out.println("non, elle existe");}

        // parcourir une liste avec des conditions
//        for (String fam : familleList) {
//            if (familleList.contains("tagb1a")) {
// supprime si tu trouves dans la liste familleList   
//                familleList.remove(familleList.indexOf(fam));
//            } else {
//                System.out.println("non, elle existe");
//            }
//
//        }
//        
//        //la boucle tant que
//        List<String> listeFille = new ArrayList<>();
//        listeFille.add("valerie");
//        listeFille.add("christ");
//        listeFille.add("amina");
//        listeFille.add("cecile");
//        System.out.println(listeFille);
//
//        // les hashMap /et leur utilisation dans la stat
//        List<String> listeGarcon = new ArrayList<>();
//        listeGarcon.add("eli");
//        listeGarcon.add("elisee");
//        listeGarcon.add("wilfrie");
//        //listeGarcon.add("fabrice");
//        System.out.println(listeGarcon);
//
//        HashMap<String, Integer> hm = new HashMap<>();
//        hm.put("garcon", listeGarcon.size());
//        hm.put("liste", listeFille.size());
//        
//        System.out.println(hm.get("garcon"));
//        System.out.println(hm.get("liste"));
//        //afficher toutes les clés
//        System.out.println(hm.keySet());
//         //afficher toutes les valeurs
//        System.out.println(hm.values());
//         //afficher toutes les clés /valeur
//         System.out.println("Entrées: " + hm.entrySet());
        //System.out.println("oui, elle existe");
        //  System.out.println(familleList);
//         Collections.sort(familleList);
//        entrepriseList.addAll(familleList);
//        System.out.println(entrepriseList);
//        Collections.sort(familleList);
//        for (Pharmacie pharm: pharmacieList){
//            System.out.println(pharm);
//        };
//            System.out.println("nom de la premiere pharmacie:"+ p1.nom);
//            System.out.println("nom de la 2eme pharmacie:"+ p2.nom);
//            System.out.println("nom de la 3me pharmacie:"+ p3.nom);
//            System.out.println("nom de la 1ere pharmacie:"+ p1.nom+"nom de la 2eme pharmacie:"+p2.nom+"nom de la 3eme pharmacie:"+p3.nom);
//  
// table de multiplication avec tant que  et for
//int add= 0;
// for(int i = 1;i<=12;i++){
//     add=add + i;
//     System.out.println(add);
// }
// table de multiplication
//int mtp= 2;
// for(int i = 0;i<=12;i++){,,,,
//     int res = mtp * i;
//     System.out.println("2*"+i+"="+res);
// }
//System.out.println(+mtp);
        int choix = 1;
        switch (choix) {

            case 1:
                System.out.println("Bonjour");
                break;
            case 2:
                System.out.println("Hello");
                break;
        }
    }

}
