package com.udacity.gradle.builditbigger.backend;

import com.amrhal.jokesjlib.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
   // https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/77e9910911d5412e5efede5fa681ec105a0f02ad/HelloEndpoints#2-connecting-your-android-app-to-the-backend

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayjokes")
    public MyBean sayjokes() {
        MyBean response = new MyBean();

        Jokes newJoke= new Jokes();

        response.setData(newJoke.getRandomOne());

        return response;
    }

}
