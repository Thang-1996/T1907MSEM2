/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author thang
 */
public class DuyetQuaArray {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of throne");
        tvShows.add("Friends");
        tvShows.add("Prison Break");
        // su dung forech de duyet phan tu cua arraylist
        System.out.println("Using Forech and lambda");
        tvShows.forEach((tvshow) -> {
            System.out.println(tvShows);
        });
        System.out.println("Using irerator()");
        Iterator<String> tvshowIterator = tvShows.iterator();
        while(tvshowIterator.hasNext()){
            String tvshow = tvshowIterator.next();
            System.out.println(tvshow);
        }
        System.out.println("Using an irerator() and Java 8 for eachremaining() method");
        tvshowIterator = tvShows.iterator();
        tvshowIterator.forEachRemaining((tvshow) -> {
            System.out.println(tvshow);
        });
        System.out.println("Using listiterator() and both directions");
        ListIterator<String> tvshowlisListIterator = tvShows.listIterator(tvShows.size());
        while(tvshowlisListIterator.hasPrevious()){
            String tvshow = tvshowlisListIterator.previous();
            System.out.println(tvshow);
        }
        System.out.println("Iretate using for-tech loop");
        for(String tvshow: tvShows){
            System.out.println(tvshow);
        }
        System.out.println("Iterate using for loop with index");
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
    
}
