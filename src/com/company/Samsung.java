package com.company;

public class Samsung {
    /*private ArrayList messages;

    public Samsung(ArrayList messages) {
        this.messages = messages;
    }

    public ArrayList getMessages() {
        return messages;
    }

    public void setMessages(ArrayList messages) {
        this.messages = messages;
    }*/

    public void sendText(String message, String recipient) {
        System.out.println("Text message sent to: " + recipient);
        System.out.println(message);
    }

    public void playMusic(String songName, String artist) {
        System.out.println("The song " + songName + " by " + artist + " is playing on Spotify.");
    }

    public void takePicture() {
        System.out.println("Smile for the camera!");
    }

    public void takeVideo() {
        System.out.println("Capturing video of your best moments.");
    }

    /*public void readMessage(int index) {
        System.out.println(getMessages().get(index-1));
    }*/
}
