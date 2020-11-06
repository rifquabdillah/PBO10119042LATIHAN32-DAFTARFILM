/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 */
public class Film {
    String filmName;
    String filmGenre;
    double filmRating;
    int filmDuration;
    
    void nowPlaying(){
        System.out.println();
        System.out.println("Judul Film\t: ".concat(filmName));
        System.out.println("Genre Film\t: ".concat(filmGenre));
        System.out.println("Rating Film\t : "+ Double.toString(filmRating));
        System.out.println("Duration Film\t : "+ Integer.toString(filmDuration));
    }
    
}
