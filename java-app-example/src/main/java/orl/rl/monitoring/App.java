package orl.rl.monitoring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private static final Logger MONITORING_LOGGER = LoggerFactory.getLogger("org.rl.monitoring");

    public static void main( String[] args )
    {
        int metricInt = 0;
        String metricStr = "Hello";

        LOGGER.info("Hello World!");

        /*
            It's important to set '-int' suffix for integer metric because elasticsearch mapping
            is configure to check this suffix in order to consider metric as integer.
        */
        MONITORING_LOGGER.info("metric-int={}, metric-str={}", ++metricInt, metricStr);
    }
}
