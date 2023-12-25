public class LogLine {
    private final String level;
    private String message;

    public LogLine(String logLine) {
        this.level = logLine.substring(1,4);
        extractMessage(logLine);
    }

    public LogLevel getLogLevel() {
        String level = getLevel();
        return switch(level){
            case "TRC" -> LogLevel.TRACE;
            case "INF" -> LogLevel.INFO;
            case "DBG" -> LogLevel.DEBUG;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" ->LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }
    public String getLevel(){
        return level;
    }

    public void extractMessage(String logLine){
        int index = logLine.indexOf(":");
        this.message = logLine.substring(index);
    }

    public String getOutputForShortLog() {
        int encodedLevel = switch(level){
            case "TRC" -> 1;
            case "INF" -> 4;
            case "DBG" -> 2;
            case "WRN" -> 5;
            case "ERR" -> 6;
            case "FTL" -> 42;
            default -> 0;
        };
        return encodedLevel + this.message;
    }
}