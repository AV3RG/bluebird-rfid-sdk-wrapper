package gg.rohan.bluebird.sdk.constants;

import gg.rohan.bluebird.sdk.util.ArrayUtil;

public class RFIDOperationResults extends RFIDCommandResults {

    public static RFIDCommandResult SUCCESS = create(0);
    public static RFIDCommandResult HANDLE_MISMATCH_ERROR = create(1);
    public static RFIDCommandResult UNDEFINED = create(2);
    public static RFIDCommandResult MEMORY_OVERRUN = create(3);
    public static RFIDCommandResult MEMORY_LOCKED = create(4);
    public static RFIDCommandResult ZERO_KILL_PASSWORD = create(5);
    public static RFIDCommandResult TAG_LOST = create(6);
    public static RFIDCommandResult COMMAND_FORMAT_ERROR = create(7);
    public static RFIDCommandResult READ_COUNT_INVALID = create(8);
    public static RFIDCommandResult OUT_OF_RETRIES = create(9);
    public static RFIDCommandResult OPERATION_FAILED = create(10);
    public static RFIDCommandResult INSUFFICIENT_POWER = create(11);
    public static RFIDCommandResult CRC_ERROR_ON_TAG_RESPONSE = create(12);
    public static RFIDCommandResult NO_TAG_REPLY = create(13);
    public static RFIDCommandResult INVALID_PASSWORD = create(14);
    public static RFIDCommandResult NONSPECIFIC_ERROR = create(15);

    public static RFIDCommandResult[] VALUES = ArrayUtil.concat(RFIDCommandResults.VALUES, new RFIDCommandResult[] {
            SUCCESS,
            HANDLE_MISMATCH_ERROR,
            UNDEFINED,
            MEMORY_OVERRUN,
            MEMORY_LOCKED,
            ZERO_KILL_PASSWORD,
            TAG_LOST,
            COMMAND_FORMAT_ERROR,
            READ_COUNT_INVALID,
            OUT_OF_RETRIES,
            OPERATION_FAILED,
            INSUFFICIENT_POWER,
            CRC_ERROR_ON_TAG_RESPONSE,
            NO_TAG_REPLY,
            INVALID_PASSWORD,
            NONSPECIFIC_ERROR
    });

    public static RFIDCommandResult fromInt(int value) {
        for (RFIDCommandResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid RFIDOperationResult value: " + value);
    }

}
