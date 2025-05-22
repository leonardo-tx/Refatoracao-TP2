package parrot;

import lombok.Getter;

@Getter
public final class ParrotDetails {
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public ParrotDetails(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }
}
