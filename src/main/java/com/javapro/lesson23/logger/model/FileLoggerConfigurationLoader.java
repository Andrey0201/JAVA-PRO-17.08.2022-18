package com.javapro.lesson23.logger.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileLoggerConfigurationLoader {

    public FileLoggerConfiguration load() {
        FileLoggerConfiguration configuration = new FileLoggerConfiguration();
        try (InputStream input = new FileInputStream("src/main/resources/my.config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            configuration.setNameFile(prop.getProperty("file"));
            configuration.setLevel(prop.getProperty("logging_level"));
            configuration.setMaxSizeByte(prop.getProperty("max_size"));
            configuration.setNameFormat(prop.getProperty("format"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return configuration;
    }
}
