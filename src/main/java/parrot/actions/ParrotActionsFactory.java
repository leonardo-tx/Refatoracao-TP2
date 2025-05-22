package parrot.actions;

import parrot.ParrotDetails;
import parrot.ParrotTypeEnum;

public class ParrotActionsFactory {
    private final ParrotDetails parrotDetails;
    
    public ParrotActionsFactory(ParrotDetails parrotDetails) {
        this.parrotDetails = parrotDetails;
    }
    
    public ParrotActions createParrotActions(ParrotTypeEnum type) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrotActions(parrotDetails);
            case AFRICAN -> new AfricanParrotActions(parrotDetails);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrotActions(parrotDetails);
        };
    }
}
