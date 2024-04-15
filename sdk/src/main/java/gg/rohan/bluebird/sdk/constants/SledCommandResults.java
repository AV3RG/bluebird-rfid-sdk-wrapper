package gg.rohan.bluebird.sdk.constants;

public class SledCommandResults {
    
    public static SledCommandResult SMARTBATT_CRITICAL_TEMPERATURE = create(-50);
    public static SledCommandResult ERROR_HOTSWAP_STATE = create(-37);
    public static SledCommandResult NOT_SUPPORTED_API = create(-36);
    public static SledCommandResult ACCESS_TIMEOUT = create(-32);
    public static SledCommandResult BT_NAME_LENGTH_ERROR = create(-19);
    public static SledCommandResult COMMUNICATION_ERROR = create(-16);
    public static SledCommandResult BLUETOOTH_NOT_ENABLED = create(-15);
    public static SledCommandResult CHARGING_STATE_ERROR = create(-14);
    public static SledCommandResult FILE_IS_NOT_EXIST = create(-13);
    public static SledCommandResult LOW_BATTERY = create(-12);
    public static SledCommandResult ALREADY_CONNECTED = create(-10);
    public static SledCommandResult ALREADY_DISCONNECTED = create(-9);
    public static SledCommandResult DUP_CMD_ERROR = create(-8);
    public static SledCommandResult READER_OR_COM_INTERFACE_STATUS_ERROR = create(-7);
    public static SledCommandResult MODE_ERROR = create(-6);
    public static SledCommandResult SD_NOT_CONNECTED = create(-5);
    public static SledCommandResult OTHER_CMD_RUNNING_ERROR = create(-4);
    public static SledCommandResult ARGUMENT_ERROR = create(-3);
    public static SledCommandResult OTHER_ERROR = create(-1);
    
    public static SledCommandResult[] VALUES =  new SledCommandResult[] {
            SMARTBATT_CRITICAL_TEMPERATURE,
            ERROR_HOTSWAP_STATE,
            NOT_SUPPORTED_API,
            ACCESS_TIMEOUT,
            BT_NAME_LENGTH_ERROR,
            COMMUNICATION_ERROR,
            BLUETOOTH_NOT_ENABLED,
            CHARGING_STATE_ERROR,
            FILE_IS_NOT_EXIST,
            LOW_BATTERY,
            ALREADY_CONNECTED,
            ALREADY_DISCONNECTED,
            DUP_CMD_ERROR,
            READER_OR_COM_INTERFACE_STATUS_ERROR,
            MODE_ERROR,
            SD_NOT_CONNECTED,
            OTHER_CMD_RUNNING_ERROR,
            ARGUMENT_ERROR,
            OTHER_ERROR
    };

    public static SledCommandResult fromInt(int value) {
        for (SledCommandResult result : VALUES) {
            if (result.value() == value) {
                return result;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }

    protected static SledCommandResult create(int value) {
        return () -> value;
    }

}
