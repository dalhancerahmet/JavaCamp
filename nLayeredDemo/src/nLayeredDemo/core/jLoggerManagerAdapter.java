package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		jLoggerManager jLoggerManager= new jLoggerManager();
		jLoggerManager.log(message);
		
	}

}
