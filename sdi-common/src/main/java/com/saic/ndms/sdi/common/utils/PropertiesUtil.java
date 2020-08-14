package com.saic.ndms.sdi.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties loadPropertiesFromFile(String filePath) throws IOException {
        InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(filePath);
        return loadPropertiesFromInputStream(inputStream);
    }
    /**
     * load from stream
     * @param inputStream  inputStream
     */
    private static Properties loadPropertiesFromInputStream(InputStream inputStream) throws IOException {
        Properties pros = new Properties();
        pros.load(inputStream);
        return pros;
    }

}
