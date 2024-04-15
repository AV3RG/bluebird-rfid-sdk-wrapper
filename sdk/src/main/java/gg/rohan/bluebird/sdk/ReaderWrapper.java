package gg.rohan.bluebird.sdk;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import gg.rohan.bluebird.sdk.constants.OpenConnectionResult;
import gg.rohan.bluebird.sdk.constants.RFIDCommandResult;
import gg.rohan.bluebird.sdk.constants.SledCommandResult;
import gg.rohan.bluebird.sdk.constants.WakeupResult;

public interface ReaderWrapper {

	void attachToContext(final @NotNull Context context);
	void closeConnection();
	SledCommandResult connect();
	SledCommandResult disconnect();
	OpenConnectionResult openConnection();
	RFIDCommandResult performInventory(final boolean turboMode, final boolean enableSelection, final boolean ignorePC);
	RFIDCommandResult performInventoryForLocation(@NotNull final String tagId);
	RFIDCommandResult stopInventory();
	WakeupResult wakeup();

}
