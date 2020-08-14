package com.mgk.factory.simplefactory;

import com.mgk.factory.simplefactory.entity.Video;

public class SimpleFactory {
    public static void main(String[] args) {
        Video java = VideoFactory.createVide("Java");
        Video c = VideoFactory.createVide("C");
        Video python = VideoFactory.createVide("Python");
        java.play();
        c.play();
        python.play();
    }
}
