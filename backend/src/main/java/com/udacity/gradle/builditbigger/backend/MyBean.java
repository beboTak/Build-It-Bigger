package com.udacity.gradle.builditbigger.backend;

import com.example.android.clamps.javajokes.Joke;

/** The object model for the data we are sending through endpoints */
public class MyBean {
    private Joke joke;

    public MyBean()
    {
        joke=new Joke();
    }
    public String getJoke()
    {
        return joke.getRandomJoke();
    }

}