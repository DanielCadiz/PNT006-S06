package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Nokia myNokia = new Nokia();
        myNokia.sendText("Hello from 2022!", "Michael Jackson");
        myNokia.playMusic("Haru-haru", "Bigbang");
        myNokia.takePicture();
        myNokia.takeVideo();

        Samsung mySamsung = new Samsung();
        mySamsung.sendText("Hello from 1800!", "Alien");
        mySamsung.playMusic("Emperor's New Clothes", "Panic! At The Disco");
        mySamsung.takePicture();
        mySamsung.takeVideo();
    }
}
