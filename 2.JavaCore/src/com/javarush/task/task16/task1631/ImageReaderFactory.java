package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;
import com.sun.javafx.iio.ImageStorage;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypesFormat) {
        ImageReader reader = null;

        if (imageTypesFormat instanceof ImageTypes){
            if (imageTypesFormat == ImageTypes.JPG)
                reader = new JpgReader();
            if (imageTypesFormat == ImageTypes.BMP)
                reader = new BmpReader();
            if (imageTypesFormat == ImageTypes.PNG)
                reader = new PngReader();
            }
        else throw new IllegalArgumentException("Неизвестный тип картинки");

        return reader;
    }

    //
}
