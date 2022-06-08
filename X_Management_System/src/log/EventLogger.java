package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler fileHandler;
	FileWriter fileWriter;
	PrintWriter fileout;
	LogManager logManager;
	Logger logger;
	
//	String filename;
	public EventLogger(String fileName) {
		try {
			logManager = LogManager.getLogManager();
			logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler = new FileHandler(fileName, true);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
//			fileout=new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(String logMessage) {
		logger.info(logMessage);
	}
}
