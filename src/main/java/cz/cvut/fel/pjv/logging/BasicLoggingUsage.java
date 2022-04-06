package cz.cvut.fel.pjv.logging;

import java.util.logging.*;

public class BasicLoggingUsage {

    private static final Logger LOG = Logger.getLogger(BasicLoggingUsage.class.getName());

    public static void main(String[] args) {
        LOG.setLevel(Level.ALL);

        LOG.setUseParentHandlers(false);
        Handler hand = new StreamHandler(System.out,new SimpleFormatter());
        hand.setLevel(Level.ALL);
        LOG.addHandler(hand);

        LOG.severe("Severe message");
        LOG.info("Info message");
        LOG.finest("Finest message");
    }

}
