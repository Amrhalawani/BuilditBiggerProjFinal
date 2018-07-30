package com.amrhal.jokesjlib;

import java.util.Random;

public class Jokes {

    //any Jokes
    private String[] manyjokes = {"Q. Why is an island like the letter T?\n" +
            "\n" +
            "A. They're both in the middle of water!", "How do you know if someone has an iphone?\n" +
            "They tell you.",
            "What is a programmer's favourite hangout place?\n" +
                    "Foo Bar",
            "Wife: You never listen to me!\n" +
                    "Me: Have you tried port 8080?",
            "What do the new MacBook and a black hole have in common?\n" +
                    "There's no Escape!",
            "Why don't keyboards sleep? Because they have two shifts HUEHUEHUE",
            "Shortest Programmer Joke:\n" +
                    "I'll be done soon!"};

    public String getRandomOne() {
        //https://stackoverflow.com/questions/13340516/random-element-from-string-array/13340579
        int rnd = new Random().nextInt(manyjokes.length);

        return (manyjokes[rnd]);
    }

}
