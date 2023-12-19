/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainpatterndemo;

/**
 *
 * @author User
 */
public class ChainPatternDemo {
 private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger databaseLogger = new DatabaseLogger(AbstractLogger.WARNING);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(databaseLogger);

        return errorLogger;  
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, 
            "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, 
            "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.WARNING, 
            "This is a warning information.");

        loggerChain.logMessage(AbstractLogger.ERROR, 
            "This is an error information.");
    }
    
}
