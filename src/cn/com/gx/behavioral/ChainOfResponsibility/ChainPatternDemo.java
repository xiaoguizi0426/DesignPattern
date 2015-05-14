package cn.com.gx.behavioral.ChainOfResponsibility;

import cn.com.gx.behavioral.ChainOfResponsibility.Logger.AbstractLogger;
import cn.com.gx.behavioral.ChainOfResponsibility.Logger.ConsoleLogger;
import cn.com.gx.behavioral.ChainOfResponsibility.Logger.ErrorLogger;
import cn.com.gx.behavioral.ChainOfResponsibility.Logger.FileLogger;

public class ChainPatternDemo
{
	
	private static AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args)
	{
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
		
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information");
		
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information");
	}

}
