package parrot;

import lombok.Getter;

@Getter
public final class ParrotDetails {
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public ParrotDetails(int numberOfCoconuts, double voltage, boolean isNailed) {
        if (numberOfCoconuts < 0) {
            throw new IllegalArgumentException("The number of coconuts cannot be negative.");
        }
        if (voltage < 0) {
            throw new IllegalArgumentException("The voltage cannot be negative.");
        }

        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }
}
