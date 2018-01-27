package org.tensorflow.demo;

/**
 * Created by AJAY KUMAR on 1/26/2018.
 */

public interface TTSListener{
    public void speak(String text);
    public void pause(long duration);
}