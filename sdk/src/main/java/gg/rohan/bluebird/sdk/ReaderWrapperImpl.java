package gg.rohan.bluebird.sdk;

import android.content.Context;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import co.kr.bluebird.sled.Reader;
import gg.rohan.bluebird.sdk.constants.OpenConnectionResult;
import gg.rohan.bluebird.sdk.constants.OpenConnectionResults;
import gg.rohan.bluebird.sdk.constants.RFIDCommandResult;
import gg.rohan.bluebird.sdk.constants.RFIDOperationResults;
import gg.rohan.bluebird.sdk.constants.SledCommandResult;
import gg.rohan.bluebird.sdk.constants.SledConnectResults;
import gg.rohan.bluebird.sdk.constants.WakeupResult;
import gg.rohan.bluebird.sdk.constants.WakeupResults;

public class ReaderWrapperImpl implements ReaderWrapper {

	private Reader rfidReader;
	private final ReaderHandler readerHandler;

	private ReaderWrapperImpl() {
		this.readerHandler = new ReaderHandler();

	}

	@Override
	public void attachToContext(final @NotNull Context context) {
		this.rfidReader = Reader.getReader(context, this.readerHandler);
	}

	@Override
	public void closeConnection() {
		this.rfidReader.SD_Close();
	}

	@Override
	public SledCommandResult connect() {
		return SledConnectResults.fromInt(this.rfidReader.SD_Connect());
	}

	@Override
	public SledCommandResult disconnect() {
		return SledConnectResults.fromInt(this.rfidReader.SD_Disconnect());
	}

	@Override
	public OpenConnectionResult openConnection() {
		return OpenConnectionResults.fromBoolean(this.rfidReader.SD_Open());
	}

	@Override
	public RFIDCommandResult performInventory(final boolean turboMode, final boolean enableSelection, final boolean ignorePC) {
		return RFIDOperationResults.fromInt(this.rfidReader.RF_PerformInventory(turboMode, enableSelection, ignorePC));
	}

	@Override
	public RFIDCommandResult stopInventory() {
		return RFIDOperationResults.fromInt(this.rfidReader.RF_StopInventory());
	}

	@Override
	public RFIDCommandResult performInventoryForLocation(@NonNull String tagId) {
		return RFIDOperationResults.fromInt(this.rfidReader.RF_PerformInventoryForLocating(tagId));
	}

	@Override
	public WakeupResult wakeup() {
		return WakeupResults.fromInt(this.rfidReader.SD_Wakeup());
	}


	public static ReaderWrapperImpl createReader() {
		return new ReaderWrapperImpl();
	}

}
