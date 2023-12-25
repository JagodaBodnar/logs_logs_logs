public class ExecutionOfLogs {
    public static void main(String[] args) {
        LogLine logLine = new LogLine("[INF]: File deleted");
        System.out.printf("LogLevel: %s%nShortLog: %s%n",logLine.getLogLevel(),logLine.getOutputForShortLog());
        logLine = new LogLine("[WRN]:I just wanna tell you how I'm feeling");
        System.out.printf("LogLevel: %s%nShortLog: %s%n",logLine.getLogLevel(),logLine.getOutputForShortLog());
        logLine = new LogLine("[DBG]: A full commitment's what I'm thinking of");
        System.out.printf("LogLevel: %s%nShortLog: %s%n",logLine.getLogLevel(),logLine.getOutputForShortLog());
        logLine = new LogLine("[ERR]: Gotta make you understand");
        System.out.printf("LogLevel: %s%nShortLog: %s%n",logLine.getLogLevel(),logLine.getOutputForShortLog());
        logLine = new LogLine("[XYZ]: XYZ123");
        System.out.printf("LogLevel: %s%nShortLog: %s%n",logLine.getLogLevel(),logLine.getOutputForShortLog());
    }
}
