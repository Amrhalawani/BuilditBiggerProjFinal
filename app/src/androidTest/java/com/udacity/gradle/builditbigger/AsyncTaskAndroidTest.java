package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskAndroidTest {

    @Rule
    public ActivityTestRule<MainActivity> mainrule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws ExecutionException, InterruptedException {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainrule.getActivity());

        String response = endpointsAsyncTask.execute().get();
        assertNotNull(response);

        assertFalse(response.isEmpty());
    }

}