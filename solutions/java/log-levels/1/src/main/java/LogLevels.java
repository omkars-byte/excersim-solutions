public class LogLevels {
    public static String message(String logLine) {
        if (logLine == null || logLine.isEmpty()) {
            return "";
        }
        int index = logLine.indexOf(":");
        if (index == -1) {
            return "";
        }
        return logLine.substring(index + 1).trim();
    }

    public static String logLevel(String logLine) {
        if (logLine == null || logLine.isEmpty()) {
            return "";
        }
        int firstindex = logLine.indexOf("[");
        int endindex = logLine.indexOf("]");
        if (firstindex == -1 || endindex == -1) {
            return "";
        }
        return logLine.substring(firstindex + 1, endindex).trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        if (logLine == null || logLine.isEmpty()) {
            return "";
        }
        int index = logLine.indexOf(":");
        int firstindex = logLine.indexOf("[");
        int endindex = logLine.indexOf("]");
        if (index == -1) {
            return "";
        }
        return logLine.substring(index + 1).trim() + " " + "(" + logLine.substring(firstindex + 1, endindex).trim().toLowerCase() + ")";
    }
}
