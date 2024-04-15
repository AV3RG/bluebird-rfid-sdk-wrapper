package gg.rohan.bluebird.sdk.constants;

import gg.rohan.bluebird.sdk.util.ArrayUtil;

public class SledConnectResults extends SledCommandResults {

    public static SledCommandResult SUCCESS = create(0);

    public static SledCommandResult[] VALUES = ArrayUtil.concat(SledCommandResults.VALUES, new SledCommandResult[] { SUCCESS });

    public static SledCommandResult fromInt(int value) {
        for (SledCommandResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid SledConnectResult value: " + value);
    }

}
