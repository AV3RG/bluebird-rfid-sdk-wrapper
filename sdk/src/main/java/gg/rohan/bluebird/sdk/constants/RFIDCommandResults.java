package gg.rohan.bluebird.sdk.constants;

public class RFIDCommandResults {

    public static final RFIDCommandResult ERROR_HOTSWAP_STATE = create(-37);
    public static final RFIDCommandResult NOT_SUPPORTED_API = create(-36);
    public static final RFIDCommandResult ACCESS_TIMEOUT = create(-32);
    public static final RFIDCommandResult STOP_FAILED_TRY_AGAIN = create(-17);
    public static final RFIDCommandResult COMMUNICATION_ERROR = create(-16);
    public static final RFIDCommandResult OTHER_MODEL = create(-16);
    public static final RFIDCommandResult BLUETOOTH_NOT_ENABLED = create(-15);
    public static final RFIDCommandResult CHARGING_STATE_ERROR = create(-14);
    public static final RFIDCommandResult FILE_IS_NOT_EXIST = create(-13);
    public static final RFIDCommandResult LOW_BATTERY = create(-12);
    public static final RFIDCommandResult NOT_INVENTORY_STATE = create(-11);
    public static final RFIDCommandResult ALREADY_CONNECTED = create(-10);
    public static final RFIDCommandResult ALREADY_DISCONNECTED = create(-9);
    public static final RFIDCommandResult DUP_CMD_ERROR = create(-8);
    public static final RFIDCommandResult READER_OR_COM_INTERFACE_STATUS_ERROR = create(-7);
    public static final RFIDCommandResult MODE_ERROR = create(-6);
    public static final RFIDCommandResult SD_NOT_CONNECTED = create(-5);
    public static final RFIDCommandResult OTHER_CMD_RUNNING_ERROR = create(-4);
    public static final RFIDCommandResult ARGUMENT_ERROR = create(-3);
    public static final RFIDCommandResult ALREADY_OPENED = create(-2);
    public static final RFIDCommandResult OTHER_ERROR = create(-1);

    public static final RFIDCommandResult[] VALUES =  new RFIDCommandResult[] {
            ERROR_HOTSWAP_STATE,
            NOT_SUPPORTED_API,
            ACCESS_TIMEOUT,
            STOP_FAILED_TRY_AGAIN,
            COMMUNICATION_ERROR,
            OTHER_MODEL,
            BLUETOOTH_NOT_ENABLED,
            CHARGING_STATE_ERROR,
            FILE_IS_NOT_EXIST,
            LOW_BATTERY,
            NOT_INVENTORY_STATE,
            ALREADY_CONNECTED,
            ALREADY_DISCONNECTED,
            DUP_CMD_ERROR,
            READER_OR_COM_INTERFACE_STATUS_ERROR,
            MODE_ERROR,
            SD_NOT_CONNECTED,
            OTHER_CMD_RUNNING_ERROR,
            ARGUMENT_ERROR,
            ALREADY_OPENED,
            OTHER_ERROR
    };

    protected static RFIDCommandResult create(int value) {
        return () -> value;
    }

    public static RFIDCommandResult fromInt(int value) {
        for (RFIDCommandResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }

}
