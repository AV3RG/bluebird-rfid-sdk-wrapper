package gg.rohan.bluebird.sdk.constants;

public class OpenConnectionResults {

    public static final OpenConnectionResult SUCCESS = create(true);
    public static final OpenConnectionResult FAIL = create(false);

    public static OpenConnectionResult[] VALUES =  new OpenConnectionResult[] { SUCCESS, FAIL };

    public static OpenConnectionResult fromBoolean(boolean value) {
        for (OpenConnectionResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }

    private static OpenConnectionResult create(boolean value) {
        return () -> value;
    }

}
