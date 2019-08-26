package com.example.android.clamps.javajokes;

import java.util.Random;

public class Joke {
   private String[] jokes;
   private Random random;
   public Joke(){
       jokes=new String[4];
       jokes[0] = "Why do programmers always mix up Halloween and Christmas?\\n\" +\n" + "\"Because Oct 31 equals Dec 25.!\";";
       jokes[1] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
       jokes[2] = "Q: How many prolog programmers does it take to change a lightbulb? A: Yes.";
       jokes[3] = "Why do Java developers wear glasses? Because they can't C#";
       random = new Random();

   }
    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
