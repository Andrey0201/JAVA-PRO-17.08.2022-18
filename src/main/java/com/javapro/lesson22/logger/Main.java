package com.javapro.lesson22.logger;




import com.javapro.lesson22.logger.api.FileLoggerAvaible;
import com.javapro.lesson22.logger.model.FileLogger;
import com.javapro.lesson22.logger.model.FileLoggerConfigurationLoader;
import com.javapro.lesson22.mylibrary.MathTask;


public class Main {

    public static void main(String[] args) {
        FileLoggerAvaible fileLogger = new FileLogger();
        int i = 2;
        while (i > 0) {
            fileLogger.debug("Что-то пошло не так");
            fileLogger.info("Информация");
            i--;
        }
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        System.out.println(loader.load().toString());

        MathTask mathTask = new MathTask();
        mathTask.fibonacci(12);
    }

}
