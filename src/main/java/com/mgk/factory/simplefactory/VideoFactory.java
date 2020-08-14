package com.mgk.factory.simplefactory;

import com.mgk.factory.simplefactory.entity.CVideo;
import com.mgk.factory.simplefactory.entity.JavaVideo;
import com.mgk.factory.simplefactory.entity.PythonVideo;
import com.mgk.factory.simplefactory.entity.Video;

public class VideoFactory {
    public static Video createVide(String languageType) {
        if (languageType.equals("Java")) {
            return new JavaVideo();
        } else if (languageType.equals("C")) {
            return new CVideo();
        } else if (languageType.equals("Python")) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}
