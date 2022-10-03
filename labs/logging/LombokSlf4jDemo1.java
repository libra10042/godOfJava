package labs.logging;


import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Slf4j
public class LombokSlf4jDemo1 {

    //private final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new LombokSlf4jDemo1().getSurchange(0/0.0);
    }

    public Double getSurchange(Double transaction){

        log.info("Surcharge Caliculation begins");
        log.debug("Surchange amount " + transaction);

        if(transaction.isNaN(transaction)){
            log.info(transaction + " is not a valid amount");
            throw new RuntimeException("Invalid Transaction");
        }
        return Math.PI;
    }
}
