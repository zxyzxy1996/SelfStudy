package com.myself.code;

import java.util.*;

/**
 * @author Zheng Xinyu
 */
public class Poker {

    public static void main(String[] args) {
        String[] color = {"♥", "♣", "♦", "♠"};

        String[] point = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        String[] specialPoker = {"👑", "🏆"};

        List<String> poker = new ArrayList<>();

        for (String s1 : color) {
            for (String s2 : point) {
                poker.add(s1 + s2);
            }
        }

        poker.addAll(Arrays.asList(specialPoker));

        Collections.shuffle(poker);

        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> goldCards = new ArrayList<>();

        Iterator iterator = poker.iterator();
        int i = 0;
        while (iterator.hasNext() && i < 3) {
            i++;
            goldCards.add((String) iterator.next());
            iterator.remove();
        }

        i = 0;
        while (iterator.hasNext()) {
            switch (i%3) {
                case 0:
                    i++;
                    person1.add((String) iterator.next());
                    break;
                case 1:
                    i++;
                    person2.add((String) iterator.next());
                    break;
                default:
                    i++;
                    person3.add((String) iterator.next());
            }
        }

        System.out.println(person1.size());
        System.out.println(person2.size());
        System.out.println(person3.size());
        System.out.println(goldCards.size());

        person1.sort(Comparator.comparing(String::hashCode));
        person2.sort(Comparator.comparing(String::hashCode));
        person3.sort(Comparator.comparing(String::hashCode));
        goldCards.sort(Comparator.comparing(String::hashCode));

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(goldCards);

    }
}
