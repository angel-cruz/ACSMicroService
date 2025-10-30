public class LogLevels {
    
    public static String message(String logLine) {
       return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
       String s=logLine.split(":")[0].toLowerCase();
        return s.substring(1,s.length()-1);
    }

    public static String reformat(String logLine) {
        String[]arr=logLine.split(":");
        String second=logLevel(arr[0]);
        return (arr[1].trim()+" "+"("+second+")").trim();
    }
}