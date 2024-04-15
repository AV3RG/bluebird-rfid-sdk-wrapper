package gg.rohan.bluebird.sdk.constants;

public class WakeupResults {

    public static final WakeupResult SUCCESS = create(0);
    public static final WakeupResult FAIL = create(1);

    public static WakeupResult[] VALUES =  new WakeupResult[] { SUCCESS, FAIL };


    public static WakeupResult fromInt(int value) {
        for (WakeupResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }

    private static WakeupResult create(int value) {
        return () -> value;
    }

}
