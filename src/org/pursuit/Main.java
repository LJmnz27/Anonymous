package org.pursuit;

public class Main {

    public static void main(String[] args) {


        Mogwai mogwai = new Mogwai();
        mogwai.isGremlin();
        Mogwai gremlin = new Mogwai() {
            @Override
            public boolean isGremlin() {
                System.out.println("I am now a Gremlin! Someone poured water on me, and fed me after midnight! Muahahahahaha!!!!!");
                return true;

            }
        };

       Flier anon = new Flier() {
            @Override
            public void fly() {
                System.out.println("I am a Parrot, and I fly with colorful feathers on my wings! But I'm anonymous, so you probably didn't know that...." + this.getClass().toString());

            }
        };

       gremlin.isGremlin();
       anon.fly();
    }
}
