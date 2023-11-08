/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.apprentissage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] Args) {

//        List<Integer> entiers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
//        Iterator<Integer> it = entiers.iterator();
//        long somme = 0;
//        long multiplication = 0;
//        while (it.hasNext()) {
//            int valeur = it.next();
//            int a = 2;
//             multiplication = valeur*2;
//             
//            System.out.println(multiplication);
            //  System.out.println(valeur);
//            if (valeur < 10) {
//                somme += valeur;
//                System.out.println(valeur);
//            }
 //       }
//        System.out.println(somme);
//        Personne pers = new Personne();
//        pers.nom = "nom";
//        pers.prenom = "prenom";
//        pers.taille = 175;
//        pers.adulte = true;
//
//        pers.dateNaissance = LocalDate.of(1985, Month.AUGUST, 11);
        // afficher le resultat en horizontal
        // Jsonb jsonb = JsonbBuilder.create();
//        String result = jsonb.toJson(pers);
//        System.out.println(result);
// afficher le resultat en verticale
//        JsonbConfig config = new JsonbConfig().withFormatting(true);
//        Jsonb jsonb = JsonbBuilder.create(config);
//        String result = jsonb.toJson(pers);
//        System.out.println(result);
        List<String> list = new LinkedList<>();
        list.add("christ");
        list.add("valerie");
        list.add("eli");
        list.add("ada");
         System.out.println(list);
//         Stream<String> stream = list.stream().collect(Collectors.toList());;
//        System.out.println(stream);
        List<String> listeTelephone = new LinkedList<>();
        listeTelephone.add("99999952");
        listeTelephone.add("44526312");
        listeTelephone.add("78593564");
        listeTelephone.add("20252634");

        List<Object> list3 = new LinkedList<>();
        list3.add(list);
        list3.add(listeTelephone);
        System.out.println(list3);
        System.out.println(list3.contains(list));
        //final Gson gson = builder.create();
        // System.out.println("entiers -> " + gson.toJson(list));

        String[][] tab = {{"christ", "valerie", "eli", "ada"}, {"92416643", "2222222241", "22784251"}};
        JsonbConfig configure = new JsonbConfig().withFormatting(true);
        Jsonb jsonbu = JsonbBuilder.create(configure);
        String resultat = jsonbu.toJson(tab);
        System.out.println(resultat);
        Jsonb jsonb = JsonbBuilder.create();
//        pers = jsonb.fromJson("{\"nom\":\"nom1\",\"prenom\":\"prenom1\",\"taille\":183}",
//                Personne.class);
//        System.out.println("nom=" + pers.nom);
//        System.out.println("prenom=" + pers.prenom);
//        System.out.println("taille=" + pers.taille);
        LinkedList listeChainee = new LinkedList();
        listeChainee.add("element 1");
        listeChainee.add("element 2");
        listeChainee.add("element 3");
        Iterator iterator = listeChainee.iterator();
        while (iterator.hasNext()) {
            System.out.println("objet = " + iterator.next());
        }

//        // Iterator<String> iterator = set.iterator();
//        Set set = new HashSet();
//        set.add("CCCCC");
//        set.add("BBBBB");
//        set.add("DDDDD");
//        set.add("BBBBB");
//        set.add("AAAAA");
//        Iterator iteratorSet = set.iterator();
//        while (iteratorSet.hasNext()) {
//            System.out.println(iteratorSet.next());
//        }
//        TreeSet<String> setId = new TreeSet<String>();
//        setId.add("CCCCC");
//        setId.add("BBBBB");
//        setId.add("DDDDD");
//        setId.add("BBBBB");
//        setId.add("AAAAA");
//parcourir une liste 
//        Iterator<String> iteratorTree = setId.iterator();
//        while (iteratorTree.hasNext()) {
//            System.out.print(iteratorTree.next() + " ");
//        }
//        
//        
//        Hashtable<Integer, String> numbers = new Hashtable<Integer, String>();
//        numbers.put(1, "Element1");
//        numbers.put(2, "Element2");
//        numbers.put(3, "Element3");
//        for (Map.Entry<Integer, String> element : numbers.entrySet()) {
//System.out.println(element.getKey() + " : " + element.getValue());
//}
//        String n = numbers.get(2);
//        if (n != null) {
//            System.out.println("2 = " + n);
//            System.out.println(n);
//        }
    }
}

//        FigureGeometrique fg = new FigureGeometrique(1, 1);
//        fg.moveTo(1, 1);
//        System.err.println(fg);
//        Carre carre = new Carre(4, 0, 0);
//        carre.moveTo(1, 1);
//        carre.getPerimetre();
//          System.out.println( carre.getPerimetre());
//      System.out.println(carre.getPerimetreCarre(4));  
//        carre.getPerimetreCar(4);
//        
//        
//      
//String[] tableau = { "A", "B", "C", "D" };
////System.out.println("Contenu du tableau"+ tableau);
//List<String> liste = new ArrayList<String>();
////System.out.println("Contenu du tableau"+liste);
//// System.out.println("Contenu du tableau est :"+ Arrays.toString(tableau));
//
//Collections.addAll(liste, tableau);
//System.out.println("Contenu du tableau");
//for (String str : tableau) {
//System.out.print(" " + str);
//}
//System.out.println("\nContenu de la liste");
//for (String str : liste) {
//System.out.print(" " + str);
//}
//tableau[0] = "AA";
//liste.add("E");
//System.out.println("\nContenu du tableau");
//for (String str : tableau) {
//System.out.print(" " + str);
//}
//System.out.println("\nContenu de la liste");
//for (String str : liste) {
//System.out.print(" " + str);}
////liste.add("E");
////System.out.println("\nContenu du tableau");
////for (String str : tableau) {
////System.out.print(" " + str);}
//
////    Animal a1 = new Animal();
////
////    Animal a2 = new Chien();
////
////    Animal a3 = new Pigeon();
////
////
////    a1.deplacer();
////    a2.deplacer();
////
////    a3.deplacer();
//            }
//
//        }
//    }
