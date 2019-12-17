package poc.java.domain;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.sql.Date;
import java.sql.Timestamp;

public class Value implements Externalizable {

	private static final long serialVersionUID = -8300516997875644471L;

	public double otdFillPrice;

	public double otdFillAmnt;

	public double otdPrevTrdPrice;

	public double otdPrevTrdPriceDbOrdrMod;

	public double otdPrevTrdPriceDsOrdrMod;

	public double otdPrevTrdPriceLtp;

	public double otdDayHigh;

	public double otdDayLow;

	public double otdDayOpen;

	public double otdPrevDayClose;

	public double otdDayTrnOver;

	public double otdTrdDevPrevTrdPrice;

	public double otdOrdrDevPrevTrdPrice;

	public double otdDbLimitPrice;

	public double otdDbTriggerPrice;

	public double otdDbBraccBuyTrnOver;

	public double otdDbBraccSellTrnOver;

	public double otdDbPanIdBuyTrnOver;

	public double otdDbPanIdSellTrnOver;

	public double otdDsLimitPrice;

	public double otdDsTriggerPrice;

	public double otdDsBraccBuyTrnOver;

	public double otdDsBraccSellTrnOver;

	public double otdDsPanIdBuyTrnOver;

	public double otdDsPanIdSellTrnOver;

	public String otdDbCtclVndrCd;

	public String otdDsCtclVndrCd;

	public double otdDbPrcChange;

	public double otdDsPrcChange;

	public double otdDbLtpOrdrEntry;

	public double otdDsLtpOrdrEntry;

	public double otdBuyOrigPrice;

	public double otdSellOrigPrice;

	public double otdDbOrdrVal;

	public double otdDsOrdrVal;

	public long otdLocalSequenceNo;

	public long otdDbClientId;

	public long otdDsClientId;

	public long otdDayVol;

	public long otdDayNmbrTrd;

	public long otdDayBuyPndngVol;

	public long otdDaySellPndngVol;

	public long otdDayBuyAlgoVol;

	public long otdDaySellAlgoVol;

	public long otdDayBuyIbtVol;

	public long otdDaySellIbtVol;

	public long otdDayBuyDmaVol;

	public long otdDaySellDmaVol;

	public long otdDayBuyNeatVol;

	public long otdDaySellNeatVol;

	public long otdDayBuyCtclVol;

	public long otdDaySellCtclVol;

	public long otdTrnscTtnTime;

	public long otdDbOrdrNmbr;

	public long otdDbBraccBuyVol;

	public long otdDbBraccBuyNoOfTrds;

	public long otdDbBraccBuyPendingVol;

	public long otdDbBraccSellVol;

	public long otdDbBraccSellNoOfTrds;

	public long otdDbBraccSellPendingVol;

	public long otdDbPanIdBuyVol;

	public long otdDbPanIdBuyNoOfTrds;

	public long otdDbPanIdBuyPendingVol;

	public long otdDbPanIdSellVol;

	public long otdDbPanIdSellNoOFTrds;

	public long otdDbPanIdSellPendingVol;

	public long otdDsOrdrNmbr;

	public long otdDsBraccBuyVol;

	public long otdDsBraccBuyNOOfTrds;

	public long otdDsBraccBuyPendingVol;

	public long otdDsBraccSellVol;

	public long otdDsBraccSellNoOfTrds;

	public long otdDsBraccSellPendingVol;

	public long otdDsPanIdBuyVol;

	public long otdDsPanIdBuyNoOfTrds;

	public long otdDsPanIdBuyPendingVol;

	public long otdDsPanIdSellVol;

	public long otdDsPanIdSellNoOfTrds;

	public long otdDsPanIdSellPendingVol;

	public long otdDbExecTimeStamp;

	public long otdDsExecTimeStamp;

	public int otdMchnNmbr;

	public int otdSeqNmbr;

	public int otdgroupSeqNmbr;

	public int otdFillQty;

	public int otdDbGoodTllDate;

	public int otdDsGoodTllDate;

	public int otdDbUserNmbr;

	public int otdDbDisclosedVol;

	public int otdDbDiscRmndrVol;

	public int otdDbRemainingVol;

	public int otdDbOriginalVol;

	public int otdDbTodayFilledVol;

	public int otdDsUserNmbr;

	public int otdDsDisclosedVol;

	public int otdDsDisCRmndrVol;

	public int otdDsRemainingVol;

	public int otdDsOriginalVol;

	public int otdDsTodayFilledVol;

	public int otdDbMinFillAon;

	public int otdDbBranch;

	public int otdDbSettlement;

	public int otdDsBranch;

	public int otdDsSettlement;

	public int otdDsMinFillAon;

	public int otdDbQtyChange;

	public int otdDsQtyChange;

	public short otdActivityType;

	public short otdDbProClient;

	public short otdDsProClient;

	public short otdDbBook;

	public short otdDsBook;

	public short otdDbAuctionNmbr;

	public short otdDsAuctionNmbr;
	/*
	 * public short otdDbRecType;
	 * 
	 * public short otdDsRecType;
	 */

	public String otdRcrdIndctr;

	public String otdBuySell;

	public Timestamp otdFillDate;

	public String otdActvtySymblName;

	public String otdActvtySeries;

	public Timestamp otdRcrdTime;

	public String otdDbBrokrNmbr;

	public String otdDbAccntNmbr;

	public String otdDbName;

	public String otdDbCtgry;

	public String otdDbHouseHoldId;

	public Timestamp otdDbEntryDate;

	public Timestamp otdDbLastModifiedDate;

	public String otdDbMkt;

	public String otdDbOnStop;

	public String otdDbDay;

	public String otdDbGtc;

	public String otdDbFok;

	public String otdDbPanId;

	public String otdDbPanInfo;
	/*
	 * public String otdDbAddr;
	 */

	public String otdDbParticipantFlag;

	public String otdDsBrokrNmbr;

	public String otdDsAccntNmbr;

	public String otdDsName;

	public String otdDsCtgry;

	public String otdDsHouseHoldId;

	public Timestamp otdDsEntryDate;

	public Timestamp otdDsLastModifiedDate;

	//

	public String otdDsMkt;

	public String otdDsOnStop;

	public String otdDsDay;

	public String otdDsGtc;

	public String otdDsFok;

	public String otdDsPanId;

	public String otdDsPanInfo;

	/*
	 * public String otdDsAddr;
	 */

	public String otdDsParticipantFlag;

	public Timestamp otdPrevTrdTime;

	public String otdDbAddressInfo;

	public String otdDbBrokrName;

	public String otdDbBrokrSebiId;

	public String otdDsAddressInfo;

	public String otdDsBrokrName;

	public String otdDsBrokrSebiId;

	public String otdDbCtrlFlag;

	public String otdDsCtrlFlag;

	public String otdDbParticipant;

	public String otdDbMf;

	public String otdDbAON;

	public String otdDbATO;

	public String otdDbModified;

	public String otdDbMatchedIndctr;

	public String otdDbTraded;

	public String otdDbFrozen;

	public String otdDbOERemarks;

	public String otdDbPreOpenMatch;

	public String otdDsParticipant;

	public String otdDsMF;

	public String otdDsAON;

	public String otdDsATO;

	public String otdDsModified;

	public String otdDsMatchedIndctr;

	public String otdDsTraded;

	public String otdDsFrozen;

	public String otdDsOERemarks;

	public String otdDsPreOpenMatch;

	public String otdDbAlgoIndc;

	public String otdDbDmaIndc;

	public String otdDbIbtIndc;

	public String otdDbStwtIndc;

	public String otdDbSorIndc;

	public String otdDbColoIndc;

	public String otdDbPrcChangeIndc;

	public String otdDbQtyChangeIndc;

	public String otdDsAlgoIndc;

	public String otdDsDmaIndc;

	public String otdDsIbtIndc;

	public String otdDsStwtIndc;

	public String otdDsSorIndc;

	public String otdDsColoIndc;

	public String otdDsQtyChangeIndc;

	public String otdDsPrcChangeIndc;

	public Timestamp otdDbEntryTime;

	public Timestamp otdDsEntryTime;

	public Timestamp otdDbLttOrdrMod;

	public Timestamp otdDsLttOrdrMod;

	public Timestamp otdDbOrdrOrgnlPrevTrdTime;

	public Timestamp otdDsOrdrOrgnlPrevTrdTime;

	public String otdFillNmbr;

	public Date otdBatchDate;

	//

	public String otdMktType;

	public String otdDbTppIndc;

	public String otdDsTppIndc;

	public String ostDsActvPasvBit;

	public String ostDbActvPasvBit;

	public String otdDbStpIndc;

	public String otdDsStpIndc;

	public String otdDbStpCxl;

	public String otdDsStpCxl;

	public String otdDbCAPanNmbr;

	public String otdDsCAPanNmbr;

	public int otdDbAlgoId;

	public int otdDsAlgoId;

	public short otdDbAlgoCategory;

	public short otdDsAlgoCategory;

	public double ccdTrdPrice;

	public double ccdOrdrPrice;

	public double ccdVarLtpPrevClose;

	public double ccdVarLtpOpn;

	public double ccdVarHighLow;

	public double ccdVarOpnPrevClose;

	public double ccdVarPrevCloseDayHigh;

	public double ccdVarPrevCloseDayLow;

	public double ccdYearHigh;

	public double ccdYearLow;

	public long ccdDayUpTicks;

	public long ccdDayDnTicks;

	public short ccdDaysSnceLastTrd;

	public short groupId;

	/*
	 * public byte alertFlag; (index = false) public byte collectorFlag;
	 */

	/*
	 * public String aggressorIndicator;
	 */

	public Value() {
	}

	public double getOtdFillPrice() {
		return otdFillPrice;
	}

	public void setOtdFillPrice(double otdFillPrice) {
		this.otdFillPrice = otdFillPrice;
	}

	public double getOtdFillAmnt() {
		return otdFillAmnt;
	}

	public void setOtdFillAmnt(double otdFillAmnt) {
		this.otdFillAmnt = otdFillAmnt;
	}

	public double getOtdPrevTrdPrice() {
		return otdPrevTrdPrice;
	}

	public void setOtdPrevTrdPrice(double otdPrevTrdPrice) {
		this.otdPrevTrdPrice = otdPrevTrdPrice;
	}

	public double getOtdPrevTrdPriceDbOrdrMod() {
		return otdPrevTrdPriceDbOrdrMod;
	}

	public void setOtdPrevTrdPriceDbOrdrMod(double otdPrevTrdPriceDbOrdrMod) {
		this.otdPrevTrdPriceDbOrdrMod = otdPrevTrdPriceDbOrdrMod;
	}

	public double getOtdPrevTrdPriceDsOrdrMod() {
		return otdPrevTrdPriceDsOrdrMod;
	}

	public void setOtdPrevTrdPriceDsOrdrMod(double otdPrevTrdPriceDsOrdrMod) {
		this.otdPrevTrdPriceDsOrdrMod = otdPrevTrdPriceDsOrdrMod;
	}

	public double getOtdPrevTrdPriceLtp() {
		return otdPrevTrdPriceLtp;
	}

	public void setOtdPrevTrdPriceLtp(double otdPrevTrdPriceLtp) {
		this.otdPrevTrdPriceLtp = otdPrevTrdPriceLtp;
	}

	public double getOtdDayHigh() {
		return otdDayHigh;
	}

	public void setOtdDayHigh(double otdDayHigh) {
		this.otdDayHigh = otdDayHigh;
	}

	public double getOtdDayLow() {
		return otdDayLow;
	}

	public void setOtdDayLow(double otdDayLow) {
		this.otdDayLow = otdDayLow;
	}

	public double getOtdDayOpen() {
		return otdDayOpen;
	}

	public void setOtdDayOpen(double otdDayOpen) {
		this.otdDayOpen = otdDayOpen;
	}

	public double getOtdPrevDayClose() {
		return otdPrevDayClose;
	}

	public void setOtdPrevDayClose(double otdPrevDayClose) {
		this.otdPrevDayClose = otdPrevDayClose;
	}

	public double getOtdDayTrnOver() {
		return otdDayTrnOver;
	}

	public void setOtdDayTrnOver(double otdDayTrnOver) {
		this.otdDayTrnOver = otdDayTrnOver;
	}

	public double getOtdTrdDevPrevTrdPrice() {
		return otdTrdDevPrevTrdPrice;
	}

	public void setOtdTrdDevPrevTrdPrice(double otdTrdDevPrevTrdPrice) {
		this.otdTrdDevPrevTrdPrice = otdTrdDevPrevTrdPrice;
	}

	public double getOtdOrdrDevPrevTrdPrice() {
		return otdOrdrDevPrevTrdPrice;
	}

	public void setOtdOrdrDevPrevTrdPrice(double otdOrdrDevPrevTrdPrice) {
		this.otdOrdrDevPrevTrdPrice = otdOrdrDevPrevTrdPrice;
	}

	public double getOtdDbLimitPrice() {
		return otdDbLimitPrice;
	}

	public void setOtdDbLimitPrice(double otdDbLimitPrice) {
		this.otdDbLimitPrice = otdDbLimitPrice;
	}

	public double getOtdDbTriggerPrice() {
		return otdDbTriggerPrice;
	}

	public void setOtdDbTriggerPrice(double otdDbTriggerPrice) {
		this.otdDbTriggerPrice = otdDbTriggerPrice;
	}

	public double getOtdDbBraccBuyTrnOver() {
		return otdDbBraccBuyTrnOver;
	}

	public void setOtdDbBraccBuyTrnOver(double otdDbBraccBuyTrnOver) {
		this.otdDbBraccBuyTrnOver = otdDbBraccBuyTrnOver;
	}

	public double getOtdDbBraccSellTrnOver() {
		return otdDbBraccSellTrnOver;
	}

	public void setOtdDbBraccSellTrnOver(double otdDbBraccSellTrnOver) {
		this.otdDbBraccSellTrnOver = otdDbBraccSellTrnOver;
	}

	public double getOtdDbPanIdBuyTrnOver() {
		return otdDbPanIdBuyTrnOver;
	}

	public void setOtdDbPanIdBuyTrnOver(double otdDbPanIdBuyTrnOver) {
		this.otdDbPanIdBuyTrnOver = otdDbPanIdBuyTrnOver;
	}

	public double getOtdDbPanIdSellTrnOver() {
		return otdDbPanIdSellTrnOver;
	}

	public void setOtdDbPanIdSellTrnOver(double otdDbPanIdSellTrnOver) {
		this.otdDbPanIdSellTrnOver = otdDbPanIdSellTrnOver;
	}

	public double getOtdDsLimitPrice() {
		return otdDsLimitPrice;
	}

	public void setOtdDsLimitPrice(double otdDsLimitPrice) {
		this.otdDsLimitPrice = otdDsLimitPrice;
	}

	public double getOtdDsTriggerPrice() {
		return otdDsTriggerPrice;
	}

	public void setOtdDsTriggerPrice(double otdDsTriggerPrice) {
		this.otdDsTriggerPrice = otdDsTriggerPrice;
	}

	public double getOtdDsBraccBuyTrnOver() {
		return otdDsBraccBuyTrnOver;
	}

	public void setOtdDsBraccBuyTrnOver(double otdDsBraccBuyTrnOver) {
		this.otdDsBraccBuyTrnOver = otdDsBraccBuyTrnOver;
	}

	public double getOtdDsBraccSellTrnOver() {
		return otdDsBraccSellTrnOver;
	}

	public void setOtdDsBraccSellTrnOver(double otdDsBraccSellTrnOver) {
		this.otdDsBraccSellTrnOver = otdDsBraccSellTrnOver;
	}

	public double getOtdDsPanIdBuyTrnOver() {
		return otdDsPanIdBuyTrnOver;
	}

	public void setOtdDsPanIdBuyTrnOver(double otdDsPanIdBuyTrnOver) {
		this.otdDsPanIdBuyTrnOver = otdDsPanIdBuyTrnOver;
	}

	public double getOtdDsPanIdSellTrnOver() {
		return otdDsPanIdSellTrnOver;
	}

	public void setOtdDsPanIdSellTrnOver(double otdDsPanIdSellTrnOver) {
		this.otdDsPanIdSellTrnOver = otdDsPanIdSellTrnOver;
	}

	public String getOtdDbCtclVndrCd() {
		return otdDbCtclVndrCd;
	}

	public void setOtdDbCtclVndrCd(String otdDbCtclVndrCd) {
		this.otdDbCtclVndrCd = otdDbCtclVndrCd;
	}

	public String getOtdDsCtclVndrCd() {
		return otdDsCtclVndrCd;
	}

	public void setOtdDsCtclVndrCd(String otdDsCtclVndrCd) {
		this.otdDsCtclVndrCd = otdDsCtclVndrCd;
	}

	public double getOtdDbPrcChange() {
		return otdDbPrcChange;
	}

	public void setOtdDbPrcChange(double otdDbPrcChange) {
		this.otdDbPrcChange = otdDbPrcChange;
	}

	public double getOtdDsPrcChange() {
		return otdDsPrcChange;
	}

	public void setOtdDsPrcChange(double otdDsPrcChange) {
		this.otdDsPrcChange = otdDsPrcChange;
	}

	public double getOtdDbLtpOrdrEntry() {
		return otdDbLtpOrdrEntry;
	}

	public void setOtdDbLtpOrdrEntry(double otdDbLtpOrdrEntry) {
		this.otdDbLtpOrdrEntry = otdDbLtpOrdrEntry;
	}

	public double getOtdDsLtpOrdrEntry() {
		return otdDsLtpOrdrEntry;
	}

	public void setOtdDsLtpOrdrEntry(double otdDsLtpOrdrEntry) {
		this.otdDsLtpOrdrEntry = otdDsLtpOrdrEntry;
	}

	public double getOtdBuyOrigPrice() {
		return otdBuyOrigPrice;
	}

	public void setOtdBuyOrigPrice(double otdBuyOrigPrice) {
		this.otdBuyOrigPrice = otdBuyOrigPrice;
	}

	public double getOtdSellOrigPrice() {
		return otdSellOrigPrice;
	}

	public void setOtdSellOrigPrice(double otdSellOrigPrice) {
		this.otdSellOrigPrice = otdSellOrigPrice;
	}

	public double getOtdDbOrdrVal() {
		return otdDbOrdrVal;
	}

	public void setOtdDbOrdrVal(double otdDbOrdrVal) {
		this.otdDbOrdrVal = otdDbOrdrVal;
	}

	public double getOtdDsOrdrVal() {
		return otdDsOrdrVal;
	}

	public void setOtdDsOrdrVal(double otdDsOrdrVal) {
		this.otdDsOrdrVal = otdDsOrdrVal;
	}

	public long getOtdLocalSequenceNo() {
		return otdLocalSequenceNo;
	}

	public void setOtdLocalSequenceNo(long otdLocalSequenceNo) {
		this.otdLocalSequenceNo = otdLocalSequenceNo;
	}

	public long getOtdDbClientId() {
		return otdDbClientId;
	}

	public void setOtdDbClientId(long otdDbClientId) {
		this.otdDbClientId = otdDbClientId;
	}

	public long getOtdDsClientId() {
		return otdDsClientId;
	}

	public void setOtdDsClientId(long otdDsClientId) {
		this.otdDsClientId = otdDsClientId;
	}

	public long getOtdDayVol() {
		return otdDayVol;
	}

	public void setOtdDayVol(long otdDayVol) {
		this.otdDayVol = otdDayVol;
	}

	public long getOtdDayNmbrTrd() {
		return otdDayNmbrTrd;
	}

	public void setOtdDayNmbrTrd(long otdDayNmbrTrd) {
		this.otdDayNmbrTrd = otdDayNmbrTrd;
	}

	public long getOtdDayBuyPndngVol() {
		return otdDayBuyPndngVol;
	}

	public void setOtdDayBuyPndngVol(long otdDayBuyPndngVol) {
		this.otdDayBuyPndngVol = otdDayBuyPndngVol;
	}

	public long getOtdDaySellPndngVol() {
		return otdDaySellPndngVol;
	}

	public void setOtdDaySellPndngVol(long otdDaySellPndngVol) {
		this.otdDaySellPndngVol = otdDaySellPndngVol;
	}

	public long getOtdDayBuyAlgoVol() {
		return otdDayBuyAlgoVol;
	}

	public void setOtdDayBuyAlgoVol(long otdDayBuyAlgoVol) {
		this.otdDayBuyAlgoVol = otdDayBuyAlgoVol;
	}

	public long getOtdDaySellAlgoVol() {
		return otdDaySellAlgoVol;
	}

	public void setOtdDaySellAlgoVol(long otdDaySellAlgoVol) {
		this.otdDaySellAlgoVol = otdDaySellAlgoVol;
	}

	public long getOtdDayBuyIbtVol() {
		return otdDayBuyIbtVol;
	}

	public void setOtdDayBuyIbtVol(long otdDayBuyIbtVol) {
		this.otdDayBuyIbtVol = otdDayBuyIbtVol;
	}

	public long getOtdDaySellIbtVol() {
		return otdDaySellIbtVol;
	}

	public void setOtdDaySellIbtVol(long otdDaySellIbtVol) {
		this.otdDaySellIbtVol = otdDaySellIbtVol;
	}

	public long getOtdDayBuyDmaVol() {
		return otdDayBuyDmaVol;
	}

	public void setOtdDayBuyDmaVol(long otdDayBuyDmaVol) {
		this.otdDayBuyDmaVol = otdDayBuyDmaVol;
	}

	public long getOtdDaySellDmaVol() {
		return otdDaySellDmaVol;
	}

	public void setOtdDaySellDmaVol(long otdDaySellDmaVol) {
		this.otdDaySellDmaVol = otdDaySellDmaVol;
	}

	public long getOtdDayBuyNeatVol() {
		return otdDayBuyNeatVol;
	}

	public void setOtdDayBuyNeatVol(long otdDayBuyNeatVol) {
		this.otdDayBuyNeatVol = otdDayBuyNeatVol;
	}

	public long getOtdDaySellNeatVol() {
		return otdDaySellNeatVol;
	}

	public void setOtdDaySellNeatVol(long otdDaySellNeatVol) {
		this.otdDaySellNeatVol = otdDaySellNeatVol;
	}

	public long getOtdDayBuyCtclVol() {
		return otdDayBuyCtclVol;
	}

	public void setOtdDayBuyCtclVol(long otdDayBuyCtclVol) {
		this.otdDayBuyCtclVol = otdDayBuyCtclVol;
	}

	public long getOtdDaySellCtclVol() {
		return otdDaySellCtclVol;
	}

	public void setOtdDaySellCtclVol(long otdDaySellCtclVol) {
		this.otdDaySellCtclVol = otdDaySellCtclVol;
	}

	public long getOtdTrnscTtnTime() {
		return otdTrnscTtnTime;
	}

	public void setOtdTrnscTtnTime(long otdTrnscTtnTime) {
		this.otdTrnscTtnTime = otdTrnscTtnTime;
	}

	public long getOtdDbOrdrNmbr() {
		return otdDbOrdrNmbr;
	}

	public void setOtdDbOrdrNmbr(long otdDbOrdrNmbr) {
		this.otdDbOrdrNmbr = otdDbOrdrNmbr;
	}

	public long getOtdDbBraccBuyVol() {
		return otdDbBraccBuyVol;
	}

	public void setOtdDbBraccBuyVol(long otdDbBraccBuyVol) {
		this.otdDbBraccBuyVol = otdDbBraccBuyVol;
	}

	public long getOtdDbBraccBuyNoOfTrds() {
		return otdDbBraccBuyNoOfTrds;
	}

	public void setOtdDbBraccBuyNoOfTrds(long otdDbBraccBuyNoOfTrds) {
		this.otdDbBraccBuyNoOfTrds = otdDbBraccBuyNoOfTrds;
	}

	public long getOtdDbBraccBuyPendingVol() {
		return otdDbBraccBuyPendingVol;
	}

	public void setOtdDbBraccBuyPendingVol(long otdDbBraccBuyPendingVol) {
		this.otdDbBraccBuyPendingVol = otdDbBraccBuyPendingVol;
	}

	public long getOtdDbBraccSellVol() {
		return otdDbBraccSellVol;
	}

	public void setOtdDbBraccSellVol(long otdDbBraccSellVol) {
		this.otdDbBraccSellVol = otdDbBraccSellVol;
	}

	public long getOtdDbBraccSellNoOfTrds() {
		return otdDbBraccSellNoOfTrds;
	}

	public void setOtdDbBraccSellNoOfTrds(long otdDbBraccSellNoOfTrds) {
		this.otdDbBraccSellNoOfTrds = otdDbBraccSellNoOfTrds;
	}

	public long getOtdDbBraccSellPendingVol() {
		return otdDbBraccSellPendingVol;
	}

	public void setOtdDbBraccSellPendingVol(long otdDbBraccSellPendingVol) {
		this.otdDbBraccSellPendingVol = otdDbBraccSellPendingVol;
	}

	public long getOtdDbPanIdBuyVol() {
		return otdDbPanIdBuyVol;
	}

	public void setOtdDbPanIdBuyVol(long otdDbPanIdBuyVol) {
		this.otdDbPanIdBuyVol = otdDbPanIdBuyVol;
	}

	public long getOtdDbPanIdBuyNoOfTrds() {
		return otdDbPanIdBuyNoOfTrds;
	}

	public void setOtdDbPanIdBuyNoOfTrds(long otdDbPanIdBuyNoOfTrds) {
		this.otdDbPanIdBuyNoOfTrds = otdDbPanIdBuyNoOfTrds;
	}

	public long getOtdDbPanIdBuyPendingVol() {
		return otdDbPanIdBuyPendingVol;
	}

	public void setOtdDbPanIdBuyPendingVol(long otdDbPanIdBuyPendingVol) {
		this.otdDbPanIdBuyPendingVol = otdDbPanIdBuyPendingVol;
	}

	public long getOtdDbPanIdSellVol() {
		return otdDbPanIdSellVol;
	}

	public void setOtdDbPanIdSellVol(long otdDbPanIdSellVol) {
		this.otdDbPanIdSellVol = otdDbPanIdSellVol;
	}

	public long getOtdDbPanIdSellNoOFTrds() {
		return otdDbPanIdSellNoOFTrds;
	}

	public void setOtdDbPanIdSellNoOFTrds(long otdDbPanIdSellNoOFTrds) {
		this.otdDbPanIdSellNoOFTrds = otdDbPanIdSellNoOFTrds;
	}

	public long getOtdDbPanIdSellPendingVol() {
		return otdDbPanIdSellPendingVol;
	}

	public void setOtdDbPanIdSellPendingVol(long otdDbPanIdSellPendingVol) {
		this.otdDbPanIdSellPendingVol = otdDbPanIdSellPendingVol;
	}

	public long getOtdDsOrdrNmbr() {
		return otdDsOrdrNmbr;
	}

	public void setOtdDsOrdrNmbr(long otdDsOrdrNmbr) {
		this.otdDsOrdrNmbr = otdDsOrdrNmbr;
	}

	public long getOtdDsBraccBuyVol() {
		return otdDsBraccBuyVol;
	}

	public void setOtdDsBraccBuyVol(long otdDsBraccBuyVol) {
		this.otdDsBraccBuyVol = otdDsBraccBuyVol;
	}

	public long getOtdDsBraccBuyNOOfTrds() {
		return otdDsBraccBuyNOOfTrds;
	}

	public void setOtdDsBraccBuyNOOfTrds(long otdDsBraccBuyNOOfTrds) {
		this.otdDsBraccBuyNOOfTrds = otdDsBraccBuyNOOfTrds;
	}

	public long getOtdDsBraccBuyPendingVol() {
		return otdDsBraccBuyPendingVol;
	}

	public void setOtdDsBraccBuyPendingVol(long otdDsBraccBuyPendingVol) {
		this.otdDsBraccBuyPendingVol = otdDsBraccBuyPendingVol;
	}

	public long getOtdDsBraccSellVol() {
		return otdDsBraccSellVol;
	}

	public void setOtdDsBraccSellVol(long otdDsBraccSellVol) {
		this.otdDsBraccSellVol = otdDsBraccSellVol;
	}

	public long getOtdDsBraccSellNoOfTrds() {
		return otdDsBraccSellNoOfTrds;
	}

	public void setOtdDsBraccSellNoOfTrds(long otdDsBraccSellNoOfTrds) {
		this.otdDsBraccSellNoOfTrds = otdDsBraccSellNoOfTrds;
	}

	public long getOtdDsBraccSellPendingVol() {
		return otdDsBraccSellPendingVol;
	}

	public void setOtdDsBraccSellPendingVol(long otdDsBraccSellPendingVol) {
		this.otdDsBraccSellPendingVol = otdDsBraccSellPendingVol;
	}

	public long getOtdDsPanIdBuyVol() {
		return otdDsPanIdBuyVol;
	}

	public void setOtdDsPanIdBuyVol(long otdDsPanIdBuyVol) {
		this.otdDsPanIdBuyVol = otdDsPanIdBuyVol;
	}

	public long getOtdDsPanIdBuyNoOfTrds() {
		return otdDsPanIdBuyNoOfTrds;
	}

	public void setOtdDsPanIdBuyNoOfTrds(long otdDsPanIdBuyNoOfTrds) {
		this.otdDsPanIdBuyNoOfTrds = otdDsPanIdBuyNoOfTrds;
	}

	public long getOtdDsPanIdBuyPendingVol() {
		return otdDsPanIdBuyPendingVol;
	}

	public void setOtdDsPanIdBuyPendingVol(long otdDsPanIdBuyPendingVol) {
		this.otdDsPanIdBuyPendingVol = otdDsPanIdBuyPendingVol;
	}

	public long getOtdDsPanIdSellVol() {
		return otdDsPanIdSellVol;
	}

	public void setOtdDsPanIdSellVol(long otdDsPanIdSellVol) {
		this.otdDsPanIdSellVol = otdDsPanIdSellVol;
	}

	public long getOtdDsPanIdSellNoOfTrds() {
		return otdDsPanIdSellNoOfTrds;
	}

	public void setOtdDsPanIdSellNoOfTrds(long otdDsPanIdSellNoOfTrds) {
		this.otdDsPanIdSellNoOfTrds = otdDsPanIdSellNoOfTrds;
	}

	public long getOtdDsPanIdSellPendingVol() {
		return otdDsPanIdSellPendingVol;
	}

	public long getOtdDbExecTimeStamp() {
		return otdDbExecTimeStamp;
	}

	public void setOtdDbExecTimeStamp(long otdDbExecTimeStamp) {
		this.otdDbExecTimeStamp = otdDbExecTimeStamp;
	}

	public long getOtdDsExecTimeStamp() {
		return otdDsExecTimeStamp;
	}

	public void setOtdDsExecTimeStamp(long otdDsExecTimeStamp) {
		this.otdDsExecTimeStamp = otdDsExecTimeStamp;
	}

	public void setOtdDsPanIdSellPendingVol(long otdDsPanIdSellPendingVol) {
		this.otdDsPanIdSellPendingVol = otdDsPanIdSellPendingVol;
	}

	public int getOtdMchnNmbr() {
		return otdMchnNmbr;
	}

	public void setOtdMchnNmbr(int otdMchnNmbr) {
		this.otdMchnNmbr = otdMchnNmbr;
	}

	public int getOtdSeqNmbr() {
		return otdSeqNmbr;
	}

	public void setOtdSeqNmbr(int otdSeqNmbr) {
		this.otdSeqNmbr = otdSeqNmbr;
	}

	public int getOtdgroupSeqNmbr() {
		return otdgroupSeqNmbr;
	}

	public void setOtdgroupSeqNmbr(int otdgroupSeqNmbr) {
		this.otdgroupSeqNmbr = otdgroupSeqNmbr;
	}

	public int getOtdFillQty() {
		return otdFillQty;
	}

	public void setOtdFillQty(int otdFillQty) {
		this.otdFillQty = otdFillQty;
	}

	public int getOtdDbGoodTllDate() {
		return otdDbGoodTllDate;
	}

	public void setOtdDbGoodTllDate(int otdDbGoodTllDate) {
		this.otdDbGoodTllDate = otdDbGoodTllDate;
	}

	public int getOtdDsGoodTllDate() {
		return otdDsGoodTllDate;
	}

	public void setOtdDsGoodTllDate(int otdDsGoodTllDate) {
		this.otdDsGoodTllDate = otdDsGoodTllDate;
	}

	public int getOtdDbUserNmbr() {
		return otdDbUserNmbr;
	}

	public void setOtdDbUserNmbr(int otdDbUserNmbr) {
		this.otdDbUserNmbr = otdDbUserNmbr;
	}

	public int getOtdDbDisclosedVol() {
		return otdDbDisclosedVol;
	}

	public void setOtdDbDisclosedVol(int otdDbDisclosedVol) {
		this.otdDbDisclosedVol = otdDbDisclosedVol;
	}

	public int getOtdDbDiscRmndrVol() {
		return otdDbDiscRmndrVol;
	}

	public void setOtdDbDiscRmndrVol(int otdDbDiscRmndrVol) {
		this.otdDbDiscRmndrVol = otdDbDiscRmndrVol;
	}

	public int getOtdDbRemainingVol() {
		return otdDbRemainingVol;
	}

	public void setOtdDbRemainingVol(int otdDbRemainingVol) {
		this.otdDbRemainingVol = otdDbRemainingVol;
	}

	public int getOtdDbOriginalVol() {
		return otdDbOriginalVol;
	}

	public void setOtdDbOriginalVol(int otdDbOriginalVol) {
		this.otdDbOriginalVol = otdDbOriginalVol;
	}

	public int getOtdDbTodayFilledVol() {
		return otdDbTodayFilledVol;
	}

	public void setOtdDbTodayFilledVol(int otdDbTodayFilledVol) {
		this.otdDbTodayFilledVol = otdDbTodayFilledVol;
	}

	public int getOtdDsUserNmbr() {
		return otdDsUserNmbr;
	}

	public void setOtdDsUserNmbr(int otdDsUserNmbr) {
		this.otdDsUserNmbr = otdDsUserNmbr;
	}

	public int getOtdDsDisclosedVol() {
		return otdDsDisclosedVol;
	}

	public void setOtdDsDisclosedVol(int otdDsDisclosedVol) {
		this.otdDsDisclosedVol = otdDsDisclosedVol;
	}

	public int getOtdDsDisCRmndrVol() {
		return otdDsDisCRmndrVol;
	}

	public void setOtdDsDisCRmndrVol(int otdDsDisCRmndrVol) {
		this.otdDsDisCRmndrVol = otdDsDisCRmndrVol;
	}

	public int getOtdDsRemainingVol() {
		return otdDsRemainingVol;
	}

	public void setOtdDsRemainingVol(int otdDsRemainingVol) {
		this.otdDsRemainingVol = otdDsRemainingVol;
	}

	public int getOtdDsOriginalVol() {
		return otdDsOriginalVol;
	}

	public void setOtdDsOriginalVol(int otdDsOriginalVol) {
		this.otdDsOriginalVol = otdDsOriginalVol;
	}

	public int getOtdDsTodayFilledVol() {
		return otdDsTodayFilledVol;
	}

	public void setOtdDsTodayFilledVol(int otdDsTodayFilledVol) {
		this.otdDsTodayFilledVol = otdDsTodayFilledVol;
	}

	public int getOtdDbMinFillAon() {
		return otdDbMinFillAon;
	}

	public void setOtdDbMinFillAon(int otdDbMinFillAon) {
		this.otdDbMinFillAon = otdDbMinFillAon;
	}

	public int getOtdDbBranch() {
		return otdDbBranch;
	}

	public void setOtdDbBranch(int otdDbBranch) {
		this.otdDbBranch = otdDbBranch;
	}

	public int getOtdDbSettlement() {
		return otdDbSettlement;
	}

	public void setOtdDbSettlement(int otdDbSettlement) {
		this.otdDbSettlement = otdDbSettlement;
	}

	public int getOtdDsBranch() {
		return otdDsBranch;
	}

	public void setOtdDsBranch(int otdDsBranch) {
		this.otdDsBranch = otdDsBranch;
	}

	public int getOtdDsSettlement() {
		return otdDsSettlement;
	}

	public void setOtdDsSettlement(int otdDsSettlement) {
		this.otdDsSettlement = otdDsSettlement;
	}

	public int getOtdDsMinFillAon() {
		return otdDsMinFillAon;
	}

	public void setOtdDsMinFillAon(int otdDsMinFillAon) {
		this.otdDsMinFillAon = otdDsMinFillAon;
	}

	public int getOtdDbQtyChange() {
		return otdDbQtyChange;
	}

	public void setOtdDbQtyChange(int otdDbQtyChange) {
		this.otdDbQtyChange = otdDbQtyChange;
	}

	public int getOtdDsQtyChange() {
		return otdDsQtyChange;
	}

	public void setOtdDsQtyChange(int otdDsQtyChange) {
		this.otdDsQtyChange = otdDsQtyChange;
	}

	public short getOtdActivityType() {
		return otdActivityType;
	}

	public void setOtdActivityType(short otdActivityType) {
		this.otdActivityType = otdActivityType;
	}

	public short getOtdDbProClient() {
		return otdDbProClient;
	}

	public void setOtdDbProClient(short otdDbProClient) {
		this.otdDbProClient = otdDbProClient;
	}

	public short getOtdDsProClient() {
		return otdDsProClient;
	}

	public void setOtdDsProClient(short otdDsProClient) {
		this.otdDsProClient = otdDsProClient;
	}

	public short getOtdDbBook() {
		return otdDbBook;
	}

	public void setOtdDbBook(short otdDbBook) {
		this.otdDbBook = otdDbBook;
	}

	public short getOtdDsBook() {
		return otdDsBook;
	}

	public void setOtdDsBook(short otdDsBook) {
		this.otdDsBook = otdDsBook;
	}

	public short getOtdDbAuctionNmbr() {
		return otdDbAuctionNmbr;
	}

	public void setOtdDbAuctionNmbr(short otdDbAuctionNmbr) {
		this.otdDbAuctionNmbr = otdDbAuctionNmbr;
	}

	public short getOtdDsAuctionNmbr() {
		return otdDsAuctionNmbr;
	}

	public void setOtdDsAuctionNmbr(short otdDsAuctionNmbr) {
		this.otdDsAuctionNmbr = otdDsAuctionNmbr;
	}

	public String getOtdRcrdIndctr() {
		return otdRcrdIndctr;
	}

	public void setOtdRcrdIndctr(String otdRcrdIndctr) {
		this.otdRcrdIndctr = otdRcrdIndctr;
	}

	public String getOtdBuySell() {
		return otdBuySell;
	}

	public void setOtdBuySell(String otdBuySell) {
		this.otdBuySell = otdBuySell;
	}

	public Timestamp getOtdFillDate() {
		return otdFillDate;
	}

	public void setOtdFillDate(Timestamp otdFillDate) {
		this.otdFillDate = otdFillDate;
	}

	public String getOtdActvtySymblName() {
		return otdActvtySymblName;
	}

	public void setOtdActvtySymblName(String otdActvtySymblName) {
		this.otdActvtySymblName = otdActvtySymblName;
	}

	public String getOtdActvtySeries() {
		return otdActvtySeries;
	}

	public void setOtdActvtySeries(String otdActvtySeries) {
		this.otdActvtySeries = otdActvtySeries;
	}

	public Timestamp getOtdRcrdTime() {
		return otdRcrdTime;
	}

	public void setOtdRcrdTime(Timestamp otdRcrdTime) {
		this.otdRcrdTime = otdRcrdTime;
	}

	public String getOtdDbBrokrNmbr() {
		return otdDbBrokrNmbr;
	}

	public void setOtdDbBrokrNmbr(String otdDbBrokrNmbr) {
		this.otdDbBrokrNmbr = otdDbBrokrNmbr;
	}

	public String getOtdDbAccntNmbr() {
		return otdDbAccntNmbr;
	}

	public void setOtdDbAccntNmbr(String otdDbAccntNmbr) {
		this.otdDbAccntNmbr = otdDbAccntNmbr;
	}

	public String getOtdDbName() {
		return otdDbName;
	}

	public void setOtdDbName(String otdDbName) {
		this.otdDbName = otdDbName;
	}

	public String getOtdDbCtgry() {
		return otdDbCtgry;
	}

	public void setOtdDbCtgry(String otdDbCtgry) {
		this.otdDbCtgry = otdDbCtgry;
	}

	public String getOtdDbHouseHoldId() {
		return otdDbHouseHoldId;
	}

	public void setOtdDbHouseHoldId(String otdDbHouseHoldId) {
		this.otdDbHouseHoldId = otdDbHouseHoldId;
	}

	public Timestamp getOtdDbEntryDate() {
		return otdDbEntryDate;
	}

	public void setOtdDbEntryDate(Timestamp otdDbEntryDate) {
		this.otdDbEntryDate = otdDbEntryDate;
	}

	public Timestamp getOtdDbLastModifiedDate() {
		return otdDbLastModifiedDate;
	}

	public void setOtdDbLastModifiedDate(Timestamp otdDbLastModifiedDate) {
		this.otdDbLastModifiedDate = otdDbLastModifiedDate;
	}

	public String getOtdDbMkt() {
		return otdDbMkt;
	}

	public void setOtdDbMkt(String otdDbMkt) {
		this.otdDbMkt = otdDbMkt;
	}

	public String getOtdDbOnStop() {
		return otdDbOnStop;
	}

	public void setOtdDbOnStop(String otdDbOnStop) {
		this.otdDbOnStop = otdDbOnStop;
	}

	public String getOtdDbDay() {
		return otdDbDay;
	}

	public void setOtdDbDay(String otdDbDay) {
		this.otdDbDay = otdDbDay;
	}

	public String getOtdDbGtc() {
		return otdDbGtc;
	}

	public void setOtdDbGtc(String otdDbGtc) {
		this.otdDbGtc = otdDbGtc;
	}

	public String getOtdDbFok() {
		return otdDbFok;
	}

	public void setOtdDbFok(String otdDbFok) {
		this.otdDbFok = otdDbFok;
	}

	public String getOtdDbPanId() {
		return otdDbPanId;
	}

	public void setOtdDbPanId(String otdDbPanId) {
		this.otdDbPanId = otdDbPanId;
	}

	public String getOtdDbPanInfo() {
		return otdDbPanInfo;
	}

	public void setOtdDbPanInfo(String otdDbPanInfo) {
		this.otdDbPanInfo = otdDbPanInfo;
	}

	public String getOtdDbParticipantFlag() {
		return otdDbParticipantFlag;
	}

	public void setOtdDbParticipantFlag(String otdDbParticipantFlag) {
		this.otdDbParticipantFlag = otdDbParticipantFlag;
	}

	public String getOtdDsBrokrNmbr() {
		return otdDsBrokrNmbr;
	}

	public void setOtdDsBrokrNmbr(String otdDsBrokrNmbr) {
		this.otdDsBrokrNmbr = otdDsBrokrNmbr;
	}

	public String getOtdDsAccntNmbr() {
		return otdDsAccntNmbr;
	}

	public void setOtdDsAccntNmbr(String otdDsAccntNmbr) {
		this.otdDsAccntNmbr = otdDsAccntNmbr;
	}

	public String getOtdDsName() {
		return otdDsName;
	}

	public void setOtdDsName(String otdDsName) {
		this.otdDsName = otdDsName;
	}

	public String getOtdDsCtgry() {
		return otdDsCtgry;
	}

	public void setOtdDsCtgry(String otdDsCtgry) {
		this.otdDsCtgry = otdDsCtgry;
	}

	public String getOtdDsHouseHoldId() {
		return otdDsHouseHoldId;
	}

	public void setOtdDsHouseHoldId(String otdDsHouseHoldId) {
		this.otdDsHouseHoldId = otdDsHouseHoldId;
	}

	public Timestamp getOtdDsEntryDate() {
		return otdDsEntryDate;
	}

	public void setOtdDsEntryDate(Timestamp otdDsEntryDate) {
		this.otdDsEntryDate = otdDsEntryDate;
	}

	public Timestamp getOtdDsLastModifiedDate() {
		return otdDsLastModifiedDate;
	}

	public void setOtdDsLastModifiedDate(Timestamp otdDsLastModifiedDate) {
		this.otdDsLastModifiedDate = otdDsLastModifiedDate;
	}

	public String getOtdDsMkt() {
		return otdDsMkt;
	}

	public void setOtdDsMkt(String otdDsMkt) {
		this.otdDsMkt = otdDsMkt;
	}

	public String getOtdDsOnStop() {
		return otdDsOnStop;
	}

	public void setOtdDsOnStop(String otdDsOnStop) {
		this.otdDsOnStop = otdDsOnStop;
	}

	public String getOtdDsDay() {
		return otdDsDay;
	}

	public void setOtdDsDay(String otdDsDay) {
		this.otdDsDay = otdDsDay;
	}

	public String getOtdDsGtc() {
		return otdDsGtc;
	}

	public void setOtdDsGtc(String otdDsGtc) {
		this.otdDsGtc = otdDsGtc;
	}

	public String getOtdDsFok() {
		return otdDsFok;
	}

	public void setOtdDsFok(String otdDsFok) {
		this.otdDsFok = otdDsFok;
	}

	public String getOtdDsPanId() {
		return otdDsPanId;
	}

	public void setOtdDsPanId(String otdDsPanId) {
		this.otdDsPanId = otdDsPanId;
	}

	public String getOtdDsPanInfo() {
		return otdDsPanInfo;
	}

	public void setOtdDsPanInfo(String otdDsPanInfo) {
		this.otdDsPanInfo = otdDsPanInfo;
	}

	public String getOtdDsParticipantFlag() {
		return otdDsParticipantFlag;
	}

	public void setOtdDsParticipantFlag(String otdDsParticipantFlag) {
		this.otdDsParticipantFlag = otdDsParticipantFlag;
	}

	public Timestamp getOtdPrevTrdTime() {
		return otdPrevTrdTime;
	}

	public void setOtdPrevTrdTime(Timestamp otdPrevTrdTime) {
		this.otdPrevTrdTime = otdPrevTrdTime;
	}

	public String getOtdDbAddressInfo() {
		return otdDbAddressInfo;
	}

	public void setOtdDbAddressInfo(String otdDbAddressInfo) {
		this.otdDbAddressInfo = otdDbAddressInfo;
	}

	public String getOtdDbBrokrName() {
		return otdDbBrokrName;
	}

	public void setOtdDbBrokrName(String otdDbBrokrName) {
		this.otdDbBrokrName = otdDbBrokrName;
	}

	public String getOtdDbBrokrSebiId() {
		return otdDbBrokrSebiId;
	}

	public void setOtdDbBrokrSebiId(String otdDbBrokrSebiId) {
		this.otdDbBrokrSebiId = otdDbBrokrSebiId;
	}

	public String getOtdDsAddressInfo() {
		return otdDsAddressInfo;
	}

	public void setOtdDsAddressInfo(String otdDsAddressInfo) {
		this.otdDsAddressInfo = otdDsAddressInfo;
	}

	public String getOtdDsBrokrName() {
		return otdDsBrokrName;
	}

	public void setOtdDsBrokrName(String otdDsBrokrName) {
		this.otdDsBrokrName = otdDsBrokrName;
	}

	public String getOtdDsBrokrSebiId() {
		return otdDsBrokrSebiId;
	}

	public void setOtdDsBrokrSebiId(String otdDsBrokrSebiId) {
		this.otdDsBrokrSebiId = otdDsBrokrSebiId;
	}

	public String getOtdDbCtrlFlag() {
		return otdDbCtrlFlag;
	}

	public void setOtdDbCtrlFlag(String otdDbCtrlFlag) {
		this.otdDbCtrlFlag = otdDbCtrlFlag;
	}

	public String getOtdDsCtrlFlag() {
		return otdDsCtrlFlag;
	}

	public void setOtdDsCtrlFlag(String otdDsCtrlFlag) {
		this.otdDsCtrlFlag = otdDsCtrlFlag;
	}

	public String getOtdDbParticipant() {
		return otdDbParticipant;
	}

	public void setOtdDbParticipant(String otdDbParticipant) {
		this.otdDbParticipant = otdDbParticipant;
	}

	public String getOtdDbMf() {
		return otdDbMf;
	}

	public void setOtdDbMf(String otdDbMf) {
		this.otdDbMf = otdDbMf;
	}

	public String getOtdDbAON() {
		return otdDbAON;
	}

	public void setOtdDbAON(String otdDbAON) {
		this.otdDbAON = otdDbAON;
	}

	public String getOtdDbATO() {
		return otdDbATO;
	}

	public void setOtdDbATO(String otdDbATO) {
		this.otdDbATO = otdDbATO;
	}

	public String getOtdDbModified() {
		return otdDbModified;
	}

	public void setOtdDbModified(String otdDbModified) {
		this.otdDbModified = otdDbModified;
	}

	public String getOtdDbMatchedIndctr() {
		return otdDbMatchedIndctr;
	}

	public void setOtdDbMatchedIndctr(String otdDbMatchedIndctr) {
		this.otdDbMatchedIndctr = otdDbMatchedIndctr;
	}

	public String getOtdDbTraded() {
		return otdDbTraded;
	}

	public void setOtdDbTraded(String otdDbTraded) {
		this.otdDbTraded = otdDbTraded;
	}

	public String getOtdDbFrozen() {
		return otdDbFrozen;
	}

	public void setOtdDbFrozen(String otdDbFrozen) {
		this.otdDbFrozen = otdDbFrozen;
	}

	public String getOtdDbOERemarks() {
		return otdDbOERemarks;
	}

	public void setOtdDbOERemarks(String otdDbOERemarks) {
		this.otdDbOERemarks = otdDbOERemarks;
	}

	public String getOtdDbPreOpenMatch() {
		return otdDbPreOpenMatch;
	}

	public void setOtdDbPreOpenMatch(String otdDbPreOpenMatch) {
		this.otdDbPreOpenMatch = otdDbPreOpenMatch;
	}

	public String getOtdDsParticipant() {
		return otdDsParticipant;
	}

	public void setOtdDsParticipant(String otdDsParticipant) {
		this.otdDsParticipant = otdDsParticipant;
	}

	public String getOtdDsMF() {
		return otdDsMF;
	}

	public void setOtdDsMF(String otdDsMF) {
		this.otdDsMF = otdDsMF;
	}

	public String getOtdDsAON() {
		return otdDsAON;
	}

	public void setOtdDsAON(String otdDsAON) {
		this.otdDsAON = otdDsAON;
	}

	public String getOtdDsATO() {
		return otdDsATO;
	}

	public void setOtdDsATO(String otdDsATO) {
		this.otdDsATO = otdDsATO;
	}

	public String getOtdDsModified() {
		return otdDsModified;
	}

	public void setOtdDsModified(String otdDsModified) {
		this.otdDsModified = otdDsModified;
	}

	public String getOtdDsMatchedIndctr() {
		return otdDsMatchedIndctr;
	}

	public void setOtdDsMatchedIndctr(String otdDsMatchedIndctr) {
		this.otdDsMatchedIndctr = otdDsMatchedIndctr;
	}

	public String getOtdDsTraded() {
		return otdDsTraded;
	}

	public void setOtdDsTraded(String otdDsTraded) {
		this.otdDsTraded = otdDsTraded;
	}

	public String getOtdDsFrozen() {
		return otdDsFrozen;
	}

	public void setOtdDsFrozen(String otdDsFrozen) {
		this.otdDsFrozen = otdDsFrozen;
	}

	public String getOtdDsOERemarks() {
		return otdDsOERemarks;
	}

	public void setOtdDsOERemarks(String otdDsOERemarks) {
		this.otdDsOERemarks = otdDsOERemarks;
	}

	public String getOtdDsPreOpenMatch() {
		return otdDsPreOpenMatch;
	}

	public void setOtdDsPreOpenMatch(String otdDsPreOpenMatch) {
		this.otdDsPreOpenMatch = otdDsPreOpenMatch;
	}

	public String getOtdDbAlgoIndc() {
		return otdDbAlgoIndc;
	}

	public void setOtdDbAlgoIndc(String otdDbAlgoIndc) {
		this.otdDbAlgoIndc = otdDbAlgoIndc;
	}

	public String getOtdDbDmaIndc() {
		return otdDbDmaIndc;
	}

	public void setOtdDbDmaIndc(String otdDbDmaIndc) {
		this.otdDbDmaIndc = otdDbDmaIndc;
	}

	public String getOtdDbIbtIndc() {
		return otdDbIbtIndc;
	}

	public void setOtdDbIbtIndc(String otdDbIbtIndc) {
		this.otdDbIbtIndc = otdDbIbtIndc;
	}

	public String getOtdDbStwtIndc() {
		return otdDbStwtIndc;
	}

	public void setOtdDbStwtIndc(String otdDbStwtIndc) {
		this.otdDbStwtIndc = otdDbStwtIndc;
	}

	public String getOtdDbSorIndc() {
		return otdDbSorIndc;
	}

	public void setOtdDbSorIndc(String otdDbSorIndc) {
		this.otdDbSorIndc = otdDbSorIndc;
	}

	public String getOtdDbColoIndc() {
		return otdDbColoIndc;
	}

	public void setOtdDbColoIndc(String otdDbColoIndc) {
		this.otdDbColoIndc = otdDbColoIndc;
	}

	public String getOtdDbPrcChangeIndc() {
		return otdDbPrcChangeIndc;
	}

	public void setOtdDbPrcChangeIndc(String otdDbPrcChangeIndc) {
		this.otdDbPrcChangeIndc = otdDbPrcChangeIndc;
	}

	public String getOtdDbQtyChangeIndc() {
		return otdDbQtyChangeIndc;
	}

	public void setOtdDbQtyChangeIndc(String otdDbQtyChangeIndc) {
		this.otdDbQtyChangeIndc = otdDbQtyChangeIndc;
	}

	public String getOtdDsAlgoIndc() {
		return otdDsAlgoIndc;
	}

	public void setOtdDsAlgoIndc(String otdDsAlgoIndc) {
		this.otdDsAlgoIndc = otdDsAlgoIndc;
	}

	public String getOtdDsDmaIndc() {
		return otdDsDmaIndc;
	}

	public void setOtdDsDmaIndc(String otdDsDmaIndc) {
		this.otdDsDmaIndc = otdDsDmaIndc;
	}

	public String getOtdDsIbtIndc() {
		return otdDsIbtIndc;
	}

	public void setOtdDsIbtIndc(String otdDsIbtIndc) {
		this.otdDsIbtIndc = otdDsIbtIndc;
	}

	public String getOtdDsStwtIndc() {
		return otdDsStwtIndc;
	}

	public void setOtdDsStwtIndc(String otdDsStwtIndc) {
		this.otdDsStwtIndc = otdDsStwtIndc;
	}

	public String getOtdDsSorIndc() {
		return otdDsSorIndc;
	}

	public void setOtdDsSorIndc(String otdDsSorIndc) {
		this.otdDsSorIndc = otdDsSorIndc;
	}

	public String getOtdDsColoIndc() {
		return otdDsColoIndc;
	}

	public void setOtdDsColoIndc(String otdDsColoIndc) {
		this.otdDsColoIndc = otdDsColoIndc;
	}

	public String getOtdDsQtyChangeIndc() {
		return otdDsQtyChangeIndc;
	}

	public void setOtdDsQtyChangeIndc(String otdDsQtyChangeIndc) {
		this.otdDsQtyChangeIndc = otdDsQtyChangeIndc;
	}

	public String getOtdDsPrcChangeIndc() {
		return otdDsPrcChangeIndc;
	}

	public void setOtdDsPrcChangeIndc(String otdDsPrcChangeIndc) {
		this.otdDsPrcChangeIndc = otdDsPrcChangeIndc;
	}

	public Timestamp getOtdDbEntryTime() {
		return otdDbEntryTime;
	}

	public void setOtdDbEntryTime(Timestamp otdDbEntryTime) {
		this.otdDbEntryTime = otdDbEntryTime;
	}

	public Timestamp getOtdDsEntryTime() {
		return otdDsEntryTime;
	}

	public void setOtdDsEntryTime(Timestamp otdDsEntryTime) {
		this.otdDsEntryTime = otdDsEntryTime;
	}

	public Timestamp getOtdDbLttOrdrMod() {
		return otdDbLttOrdrMod;
	}

	public void setOtdDbLttOrdrMod(Timestamp otdDbLttOrdrMod) {
		this.otdDbLttOrdrMod = otdDbLttOrdrMod;
	}

	public Timestamp getOtdDsLttOrdrMod() {
		return otdDsLttOrdrMod;
	}

	public void setOtdDsLttOrdrMod(Timestamp otdDsLttOrdrMod) {
		this.otdDsLttOrdrMod = otdDsLttOrdrMod;
	}

	public Timestamp getOtdDbOrdrOrgnlPrevTrdTime() {
		return otdDbOrdrOrgnlPrevTrdTime;
	}

	public void setOtdDbOrdrOrgnlPrevTrdTime(Timestamp otdDbOrdrOrgnlPrevTrdTime) {
		this.otdDbOrdrOrgnlPrevTrdTime = otdDbOrdrOrgnlPrevTrdTime;
	}

	public Timestamp getOtdDsOrdrOrgnlPrevTrdTime() {
		return otdDsOrdrOrgnlPrevTrdTime;
	}

	public void setOtdDsOrdrOrgnlPrevTrdTime(Timestamp otdDsOrdrOrgnlPrevTrdTime) {
		this.otdDsOrdrOrgnlPrevTrdTime = otdDsOrdrOrgnlPrevTrdTime;
	}

	public String getOtdFillNmbr() {
		return otdFillNmbr;
	}

	public void setOtdFillNmbr(String otdFillNmbr) {
		this.otdFillNmbr = otdFillNmbr;
	}

	public Date getOtdBatchDate() {
		return otdBatchDate;
	}

	public void setOtdBatchDate(Date otdBatchDate) {
		this.otdBatchDate = otdBatchDate;
	}

	public String getOtdMktType() {
		return otdMktType;
	}

	public void setOtdMktType(String otdMktType) {
		this.otdMktType = otdMktType;
	}

	public String getOtdDbTppIndc() {
		return otdDbTppIndc;
	}

	public void setOtdDbTppIndc(String otdDbTppIndc) {
		this.otdDbTppIndc = otdDbTppIndc;
	}

	public String getOtdDsTppIndc() {
		return otdDsTppIndc;
	}

	public void setOtdDsTppIndc(String otdDsTppIndc) {
		this.otdDsTppIndc = otdDsTppIndc;
	}

	public String getOstDsActvPasvBit() {
		return ostDsActvPasvBit;
	}

	public void setOstDsActvPasvBit(String ostDsActvPasvBit) {
		this.ostDsActvPasvBit = ostDsActvPasvBit;
	}

	public String getOstDbActvPasvBit() {
		return ostDbActvPasvBit;
	}

	public void setOstDbActvPasvBit(String ostDbActvPasvBit) {
		this.ostDbActvPasvBit = ostDbActvPasvBit;
	}

	public String getOtdDbStpIndc() {
		return otdDbStpIndc;
	}

	public void setOtdDbStpIndc(String otdDbStpIndc) {
		this.otdDbStpIndc = otdDbStpIndc;
	}

	public String getOtdDsStpIndc() {
		return otdDsStpIndc;
	}

	public void setOtdDsStpIndc(String otdDsStpIndc) {
		this.otdDsStpIndc = otdDsStpIndc;
	}

	public String getOtdDbStpCxl() {
		return otdDbStpCxl;
	}

	public void setOtdDbStpCxl(String otdDbStpCxl) {
		this.otdDbStpCxl = otdDbStpCxl;
	}

	public String getOtdDsStpCxl() {
		return otdDsStpCxl;
	}

	public void setOtdDsStpCxl(String otdDsStpCxl) {
		this.otdDsStpCxl = otdDsStpCxl;
	}

	public String getOtdDbCAPanNmbr() {
		return otdDbCAPanNmbr;
	}

	public void setOtdDbCAPanNmbr(String otdDbCAPanNmbr) {
		this.otdDbCAPanNmbr = otdDbCAPanNmbr;
	}

	public String getOtdDsCAPanNmbr() {
		return otdDsCAPanNmbr;
	}

	public void setOtdDsCAPanNmbr(String otdDsCAPanNmbr) {
		this.otdDsCAPanNmbr = otdDsCAPanNmbr;
	}

	public int getOtdDbAlgoId() {
		return otdDbAlgoId;
	}

	public void setOtdDbAlgoId(int otdDbAlgoId) {
		this.otdDbAlgoId = otdDbAlgoId;
	}

	public int getOtdDsAlgoId() {
		return otdDsAlgoId;
	}

	public void setOtdDsAlgoId(int otdDsAlgoId) {
		this.otdDsAlgoId = otdDsAlgoId;
	}

	public short getOtdDbAlgoCategory() {
		return otdDbAlgoCategory;
	}

	public void setOtdDbAlgoCategory(short otdDbAlgoCategory) {
		this.otdDbAlgoCategory = otdDbAlgoCategory;
	}

	public short getOtdDsAlgoCategory() {
		return otdDsAlgoCategory;
	}

	public void setOtdDsAlgoCategory(short otdDsAlgoCategory) {
		this.otdDsAlgoCategory = otdDsAlgoCategory;
	}

	public double getCcdTrdPrice() {
		return ccdTrdPrice;
	}

	public void setCcdTrdPrice(double ccdTrdPrice) {
		this.ccdTrdPrice = ccdTrdPrice;
	}

	public double getCcdOrdrPrice() {
		return ccdOrdrPrice;
	}

	public void setCcdOrdrPrice(double ccdOrdrPrice) {
		this.ccdOrdrPrice = ccdOrdrPrice;
	}

	public double getCcdVarLtpPrevClose() {
		return ccdVarLtpPrevClose;
	}

	public void setCcdVarLtpPrevClose(double ccdVarLtpPrevClose) {
		this.ccdVarLtpPrevClose = ccdVarLtpPrevClose;
	}

	public double getCcdVarLtpOpn() {
		return ccdVarLtpOpn;
	}

	public void setCcdVarLtpOpn(double ccdVarLtpOpn) {
		this.ccdVarLtpOpn = ccdVarLtpOpn;
	}

	public double getCcdVarHighLow() {
		return ccdVarHighLow;
	}

	public void setCcdVarHighLow(double ccdVarHighLow) {
		this.ccdVarHighLow = ccdVarHighLow;
	}

	public double getCcdVarOpnPrevClose() {
		return ccdVarOpnPrevClose;
	}

	public void setCcdVarOpnPrevClose(double ccdVarOpnPrevClose) {
		this.ccdVarOpnPrevClose = ccdVarOpnPrevClose;
	}

	public double getCcdVarPrevCloseDayHigh() {
		return ccdVarPrevCloseDayHigh;
	}

	public void setCcdVarPrevCloseDayHigh(double ccdVarPrevCloseDayHigh) {
		this.ccdVarPrevCloseDayHigh = ccdVarPrevCloseDayHigh;
	}

	public double getCcdVarPrevCloseDayLow() {
		return ccdVarPrevCloseDayLow;
	}

	public void setCcdVarPrevCloseDayLow(double ccdVarPrevCloseDayLow) {
		this.ccdVarPrevCloseDayLow = ccdVarPrevCloseDayLow;
	}

	public double getCcdYearHigh() {
		return ccdYearHigh;
	}

	public void setCcdYearHigh(double ccdYearHigh) {
		this.ccdYearHigh = ccdYearHigh;
	}

	public double getCcdYearLow() {
		return ccdYearLow;
	}

	public void setCcdYearLow(double ccdYearLow) {
		this.ccdYearLow = ccdYearLow;
	}

	public long getCcdDayUpTicks() {
		return ccdDayUpTicks;
	}

	public void setCcdDayUpTicks(long ccdDayUpTicks) {
		this.ccdDayUpTicks = ccdDayUpTicks;
	}

	public long getCcdDayDnTicks() {
		return ccdDayDnTicks;
	}

	public void setCcdDayDnTicks(long ccdDayDnTicks) {
		this.ccdDayDnTicks = ccdDayDnTicks;
	}

	public short getCcdDaysSnceLastTrd() {
		return ccdDaysSnceLastTrd;
	}

	public void setCcdDaysSnceLastTrd(short ccdDaysSnceLastTrd) {
		this.ccdDaysSnceLastTrd = ccdDaysSnceLastTrd;
	}

	public short getGroupId() {
		return groupId;
	}

	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}

	/*
	 * public byte getAlertFlag() { return alertFlag; }
	 * 
	 * public void setAlertFlag(byte alertFlag) { this.alertFlag = alertFlag; }
	 * 
	 * public byte getCollectorFlag() { return collectorFlag; }
	 * 
	 * public void setCollectorFlag(byte collectorFlag) { this.collectorFlag =
	 * collectorFlag; }
	 */

//	public String getAggressorIndicator() {
//		return aggressorIndicator;
//	}
//
//	public void setAggressorIndicator(String aggressorIndicator) {
//		this.aggressorIndicator = aggressorIndicator;
//	}

	@Override
	public String toString() {
		return "CmCombined [otdFillPrice=" + otdFillPrice + ", otdFillAmnt=" + otdFillAmnt + ", otdPrevTrdPrice="
				+ otdPrevTrdPrice + ", otdPrevTrdPriceDbOrdrMod=" + otdPrevTrdPriceDbOrdrMod
				+ ", otdPrevTrdPriceDsOrdrMod=" + otdPrevTrdPriceDsOrdrMod + ", otdPrevTrdPriceLtp="
				+ otdPrevTrdPriceLtp + ", otdDayHigh=" + otdDayHigh + ", otdDayLow=" + otdDayLow + ", otdDayOpen="
				+ otdDayOpen + ", otdPrevDayClose=" + otdPrevDayClose + ", otdDayTrnOver=" + otdDayTrnOver
				+ ", otdTrdDevPrevTrdPrice=" + otdTrdDevPrevTrdPrice + ", otdOrdrDevPrevTrdPrice="
				+ otdOrdrDevPrevTrdPrice + ", otdDbLimitPrice=" + otdDbLimitPrice + ", otdDbTriggerPrice="
				+ otdDbTriggerPrice + ", otdDbBraccBuyTrnOver=" + otdDbBraccBuyTrnOver + ", otdDbBraccSellTrnOver="
				+ otdDbBraccSellTrnOver + ", otdDbPanIdBuyTrnOver=" + otdDbPanIdBuyTrnOver + ", otdDbPanIdSellTrnOver="
				+ otdDbPanIdSellTrnOver + ", otdDsLimitPrice=" + otdDsLimitPrice + ", otdDsTriggerPrice="
				+ otdDsTriggerPrice + ", otdDsBraccBuyTrnOver=" + otdDsBraccBuyTrnOver + ", otdDsBraccSellTrnOver="
				+ otdDsBraccSellTrnOver + ", otdDsPanIdBuyTrnOver=" + otdDsPanIdBuyTrnOver + ", otdDsPanIdSellTrnOver="
				+ otdDsPanIdSellTrnOver + ", otdDbCtclVndrCd=" + otdDbCtclVndrCd + ", otdDsCtclVndrCd="
				+ otdDsCtclVndrCd + ", otdDbPrcChange=" + otdDbPrcChange + ", otdDsPrcChange=" + otdDsPrcChange
				+ ", otdDbLtpOrdrEntry=" + otdDbLtpOrdrEntry + ", otdDsLtpOrdrEntry=" + otdDsLtpOrdrEntry
				+ ", otdBuyOrigPrice=" + otdBuyOrigPrice + ", otdSellOrigPrice=" + otdSellOrigPrice + ", otdDbOrdrVal="
				+ otdDbOrdrVal + ", otdDsOrdrVal=" + otdDsOrdrVal + ", otdLocalSequenceNo=" + otdLocalSequenceNo
				+ ", otdDbClientId=" + otdDbClientId + ", otdDsClientId=" + otdDsClientId + ", otdDayVol=" + otdDayVol
				+ ", otdDayNmbrTrd=" + otdDayNmbrTrd + ", otdDayBuyPndngVol=" + otdDayBuyPndngVol
				+ ", otdDaySellPndngVol=" + otdDaySellPndngVol + ", otdDayBuyAlgoVol=" + otdDayBuyAlgoVol
				+ ", otdDaySellAlgoVol=" + otdDaySellAlgoVol + ", otdDayBuyIbtVol=" + otdDayBuyIbtVol
				+ ", otdDaySellIbtVol=" + otdDaySellIbtVol + ", otdDayBuyDmaVol=" + otdDayBuyDmaVol
				+ ", otdDaySellDmaVol=" + otdDaySellDmaVol + ", otdDayBuyNeatVol=" + otdDayBuyNeatVol
				+ ", otdDaySellNeatVol=" + otdDaySellNeatVol + ", otdDayBuyCtclVol=" + otdDayBuyCtclVol
				+ ", otdDaySellCtclVol=" + otdDaySellCtclVol + ", otdTrnscTtnTime=" + otdTrnscTtnTime
				+ ", otdDbOrdrNmbr=" + otdDbOrdrNmbr + ", otdDbBraccBuyVol=" + otdDbBraccBuyVol
				+ ", otdDbBraccBuyNoOfTrds=" + otdDbBraccBuyNoOfTrds + ", otdDbBraccBuyPendingVol="
				+ otdDbBraccBuyPendingVol + ", otdDbBraccSellVol=" + otdDbBraccSellVol + ", otdDbBraccSellNoOfTrds="
				+ otdDbBraccSellNoOfTrds + ", otdDbBraccSellPendingVol=" + otdDbBraccSellPendingVol
				+ ", otdDbPanIdBuyVol=" + otdDbPanIdBuyVol + ", otdDbPanIdBuyNoOfTrds=" + otdDbPanIdBuyNoOfTrds
				+ ", otdDbPanIdBuyPendingVol=" + otdDbPanIdBuyPendingVol + ", otdDbPanIdSellVol=" + otdDbPanIdSellVol
				+ ", otdDbPanIdSellNoOFTrds=" + otdDbPanIdSellNoOFTrds + ", otdDbPanIdSellPendingVol="
				+ otdDbPanIdSellPendingVol + ", otdDsOrdrNmbr=" + otdDsOrdrNmbr + ", otdDsBraccBuyVol="
				+ otdDsBraccBuyVol + ", otdDsBraccBuyNOOfTrds=" + otdDsBraccBuyNOOfTrds + ", otdDsBraccBuyPendingVol="
				+ otdDsBraccBuyPendingVol + ", otdDsBraccSellVol=" + otdDsBraccSellVol + ", otdDsBraccSellNoOfTrds="
				+ otdDsBraccSellNoOfTrds + ", otdDsBraccSellPendingVol=" + otdDsBraccSellPendingVol
				+ ", otdDsPanIdBuyVol=" + otdDsPanIdBuyVol + ", otdDsPanIdBuyNoOfTrds=" + otdDsPanIdBuyNoOfTrds
				+ ", otdDsPanIdBuyPendingVol=" + otdDsPanIdBuyPendingVol + ", otdDsPanIdSellVol=" + otdDsPanIdSellVol
				+ ", otdDsPanIdSellNoOfTrds=" + otdDsPanIdSellNoOfTrds + ", otdDsPanIdSellPendingVol="
				+ otdDsPanIdSellPendingVol + ", otdDbExecTimeStamp=" + otdDbExecTimeStamp + ", otdDsExecTimeStamp="
				+ otdDsExecTimeStamp + ", otdMchnNmbr=" + otdMchnNmbr + ", otdSeqNmbr=" + otdSeqNmbr
				+ ", otdgroupSeqNmbr=" + otdgroupSeqNmbr + ", otdFillQty=" + otdFillQty + ", otdDbGoodTllDate="
				+ otdDbGoodTllDate + ", otdDsGoodTllDate=" + otdDsGoodTllDate + ", otdDbUserNmbr=" + otdDbUserNmbr
				+ ", otdDbDisclosedVol=" + otdDbDisclosedVol + ", otdDbDiscRmndrVol=" + otdDbDiscRmndrVol
				+ ", otdDbRemainingVol=" + otdDbRemainingVol + ", otdDbOriginalVol=" + otdDbOriginalVol
				+ ", otdDbTodayFilledVol=" + otdDbTodayFilledVol + ", otdDsUserNmbr=" + otdDsUserNmbr
				+ ", otdDsDisclosedVol=" + otdDsDisclosedVol + ", otdDsDisCRmndrVol=" + otdDsDisCRmndrVol
				+ ", otdDsRemainingVol=" + otdDsRemainingVol + ", otdDsOriginalVol=" + otdDsOriginalVol
				+ ", otdDsTodayFilledVol=" + otdDsTodayFilledVol + ", otdDbMinFillAon=" + otdDbMinFillAon
				+ ", otdDbBranch=" + otdDbBranch + ", otdDbSettlement=" + otdDbSettlement + ", otdDsBranch="
				+ otdDsBranch + ", otdDsSettlement=" + otdDsSettlement + ", otdDsMinFillAon=" + otdDsMinFillAon
				+ ", otdDbQtyChange=" + otdDbQtyChange + ", otdDsQtyChange=" + otdDsQtyChange + ", otdActivityType="
				+ otdActivityType + ", otdDbProClient=" + otdDbProClient + ", otdDsProClient=" + otdDsProClient
				+ ", otdDbBook=" + otdDbBook + ", otdDsBook=" + otdDsBook + ", otdDbAuctionNmbr=" + otdDbAuctionNmbr
				+ ", otdDsAuctionNmbr=" + otdDsAuctionNmbr + ", otdRcrdIndctr=" + otdRcrdIndctr + ", otdBuySell="
				+ otdBuySell + ", otdFillDate=" + otdFillDate + ", otdActvtySymblName=" + otdActvtySymblName
				+ ", otdActvtySeries=" + otdActvtySeries + ", otdRcrdTime=" + otdRcrdTime + ", otdDbBrokrNmbr="
				+ otdDbBrokrNmbr + ", otdDbAccntNmbr=" + otdDbAccntNmbr + ", otdDbName=" + otdDbName + ", otdDbCtgry="
				+ otdDbCtgry + ", otdDbHouseHoldId=" + otdDbHouseHoldId + ", otdDbEntryDate=" + otdDbEntryDate
				+ ", otdDbLastModifiedDate=" + otdDbLastModifiedDate + ", otdDbMkt=" + otdDbMkt + ", otdDbOnStop="
				+ otdDbOnStop + ", otdDbDay=" + otdDbDay + ", otdDbGtc=" + otdDbGtc + ", otdDbFok=" + otdDbFok
				+ ", otdDbPanId=" + otdDbPanId + ", otdDbPanInfo=" + otdDbPanInfo + ", otdDbParticipantFlag="
				+ otdDbParticipantFlag + ", otdDsBrokrNmbr=" + otdDsBrokrNmbr + ", otdDsAccntNmbr=" + otdDsAccntNmbr
				+ ", otdDsName=" + otdDsName + ", otdDsCtgry=" + otdDsCtgry + ", otdDsHouseHoldId=" + otdDsHouseHoldId
				+ ", otdDsEntryDate=" + otdDsEntryDate + ", otdDsLastModifiedDate=" + otdDsLastModifiedDate
				+ ", otdDsMkt=" + otdDsMkt + ", otdDsOnStop=" + otdDsOnStop + ", otdDsDay=" + otdDsDay + ", otdDsGtc="
				+ otdDsGtc + ", otdDsFok=" + otdDsFok + ", otdDsPanId=" + otdDsPanId + ", otdDsPanInfo=" + otdDsPanInfo
				+ ", otdDsParticipantFlag=" + otdDsParticipantFlag + ", otdPrevTrdTime=" + otdPrevTrdTime
				+ ", otdDbAddressInfo=" + otdDbAddressInfo + ", otdDbBrokrName=" + otdDbBrokrName
				+ ", otdDbBrokrSebiId=" + otdDbBrokrSebiId + ", otdDsAddressInfo=" + otdDsAddressInfo
				+ ", otdDsBrokrName=" + otdDsBrokrName + ", otdDsBrokrSebiId=" + otdDsBrokrSebiId + ", otdDbCtrlFlag="
				+ otdDbCtrlFlag + ", otdDsCtrlFlag=" + otdDsCtrlFlag + ", otdDbParticipant=" + otdDbParticipant
				+ ", otdDbMf=" + otdDbMf + ", otdDbAON=" + otdDbAON + ", otdDbATO=" + otdDbATO + ", otdDbModified="
				+ otdDbModified + ", otdDbMatchedIndctr=" + otdDbMatchedIndctr + ", otdDbTraded=" + otdDbTraded
				+ ", otdDbFrozen=" + otdDbFrozen + ", otdDbOERemarks=" + otdDbOERemarks + ", otdDbPreOpenMatch="
				+ otdDbPreOpenMatch + ", otdDsParticipant=" + otdDsParticipant + ", otdDsMF=" + otdDsMF + ", otdDsAON="
				+ otdDsAON + ", otdDsATO=" + otdDsATO + ", otdDsModified=" + otdDsModified + ", otdDsMatchedIndctr="
				+ otdDsMatchedIndctr + ", otdDsTraded=" + otdDsTraded + ", otdDsFrozen=" + otdDsFrozen
				+ ", otdDsOERemarks=" + otdDsOERemarks + ", otdDsPreOpenMatch=" + otdDsPreOpenMatch + ", otdDbAlgoIndc="
				+ otdDbAlgoIndc + ", otdDbDmaIndc=" + otdDbDmaIndc + ", otdDbIbtIndc=" + otdDbIbtIndc
				+ ", otdDbStwtIndc=" + otdDbStwtIndc + ", otdDbSorIndc=" + otdDbSorIndc + ", otdDbColoIndc="
				+ otdDbColoIndc + ", otdDbPrcChangeIndc=" + otdDbPrcChangeIndc + ", otdDbQtyChangeIndc="
				+ otdDbQtyChangeIndc + ", otdDsAlgoIndc=" + otdDsAlgoIndc + ", otdDsDmaIndc=" + otdDsDmaIndc
				+ ", otdDsIbtIndc=" + otdDsIbtIndc + ", otdDsStwtIndc=" + otdDsStwtIndc + ", otdDsSorIndc="
				+ otdDsSorIndc + ", otdDsColoIndc=" + otdDsColoIndc + ", otdDsQtyChangeIndc=" + otdDsQtyChangeIndc
				+ ", otdDsPrcChangeIndc=" + otdDsPrcChangeIndc + ", otdDbEntryTime=" + otdDbEntryTime
				+ ", otdDsEntryTime=" + otdDsEntryTime + ", otdDbLttOrdrMod=" + otdDbLttOrdrMod + ", otdDsLttOrdrMod="
				+ otdDsLttOrdrMod + ", otdDbOrdrOrgnlPrevTrdTime=" + otdDbOrdrOrgnlPrevTrdTime
				+ ", otdDsOrdrOrgnlPrevTrdTime=" + otdDsOrdrOrgnlPrevTrdTime + ", otdFillNmbr=" + otdFillNmbr
				+ ", otdBatchDate=" + otdBatchDate + ", otdMktType=" + otdMktType + ", otdDbTppIndc=" + otdDbTppIndc
				+ ", otdDsTppIndc=" + otdDsTppIndc + ", ostDsActvPasvBit=" + ostDsActvPasvBit + ", ostDbActvPasvBit="
				+ ostDbActvPasvBit + ", otdDbStpIndc=" + otdDbStpIndc + ", otdDsStpIndc=" + otdDsStpIndc
				+ ", otdDbStpCxl=" + otdDbStpCxl + ", otdDsStpCxl=" + otdDsStpCxl + ", otdDbCAPanNmbr=" + otdDbCAPanNmbr
				+ ", otdDsCAPanNmbr=" + otdDsCAPanNmbr + ", otdDbAlgoId=" + otdDbAlgoId + ", otdDsAlgoId=" + otdDsAlgoId
				+ ", otdDbAlgoCategory=" + otdDbAlgoCategory + ", otdDsAlgoCategory=" + otdDsAlgoCategory
				+ ", ccdTrdPrice=" + ccdTrdPrice + ", ccdOrdrPrice=" + ccdOrdrPrice + ", ccdVarLtpPrevClose="
				+ ccdVarLtpPrevClose + ", ccdVarLtpOpn=" + ccdVarLtpOpn + ", ccdVarHighLow=" + ccdVarHighLow
				+ ", ccdVarOpnPrevClose=" + ccdVarOpnPrevClose + ", ccdVarPrevCloseDayHigh=" + ccdVarPrevCloseDayHigh
				+ ", ccdVarPrevCloseDayLow=" + ccdVarPrevCloseDayLow + ", ccdYearHigh=" + ccdYearHigh + ", ccdYearLow="
				+ ccdYearLow + ", ccdDayUpTicks=" + ccdDayUpTicks + ", ccdDayDnTicks=" + ccdDayDnTicks
				+ ", ccdDaysSnceLastTrd=" + ccdDaysSnceLastTrd + ", groupId=" + groupId + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		// System.out.println("available start: " + in.available());

		this.otdFillPrice = in.readDouble();
		this.otdFillAmnt = in.readDouble();
		this.otdPrevTrdPrice = in.readDouble();
		this.otdPrevTrdPriceDbOrdrMod = in.readDouble();
		this.otdPrevTrdPriceDsOrdrMod = in.readDouble();
		this.otdPrevTrdPriceLtp = in.readDouble();
		this.otdDayHigh = in.readDouble();
		this.otdDayLow = in.readDouble();
		this.otdDayOpen = in.readDouble();
		this.otdPrevDayClose = in.readDouble();
		this.otdDayTrnOver = in.readDouble();
		this.otdTrdDevPrevTrdPrice = in.readDouble();
		this.otdOrdrDevPrevTrdPrice = in.readDouble();
		this.otdDbLimitPrice = in.readDouble();
		this.otdDbTriggerPrice = in.readDouble();
		this.otdDbBraccBuyTrnOver = in.readDouble();
		this.otdDbBraccSellTrnOver = in.readDouble();
		this.otdDbPanIdBuyTrnOver = in.readDouble();
		this.otdDbPanIdSellTrnOver = in.readDouble();
		this.otdDsLimitPrice = in.readDouble();
		this.otdDsTriggerPrice = in.readDouble();
		this.otdDsBraccBuyTrnOver = in.readDouble();
		this.otdDsBraccSellTrnOver = in.readDouble();
		this.otdDsPanIdBuyTrnOver = in.readDouble();
		this.otdDsPanIdSellTrnOver = in.readDouble();
		this.otdDbCtclVndrCd = (String) in.readObject();
		this.otdDsCtclVndrCd = (String) in.readObject();
		this.otdDbPrcChange = in.readDouble();
		this.otdDsPrcChange = in.readDouble();
		this.otdDbLtpOrdrEntry = in.readDouble();
		this.otdDsLtpOrdrEntry = in.readDouble();
		this.otdBuyOrigPrice = in.readDouble();
		this.otdSellOrigPrice = in.readDouble();
		this.otdDbOrdrVal = in.readDouble();
		this.otdDsOrdrVal = in.readDouble();
		this.otdLocalSequenceNo = in.readLong();
		this.otdDbClientId = in.readLong();
		this.otdDsClientId = in.readLong();
		this.otdDayVol = in.readLong();
		this.otdDayNmbrTrd = in.readLong();
		this.otdDayBuyPndngVol = in.readLong();
		this.otdDaySellPndngVol = in.readLong();
		this.otdDayBuyAlgoVol = in.readLong();
		this.otdDaySellAlgoVol = in.readLong();
		this.otdDayBuyIbtVol = in.readLong();
		this.otdDaySellIbtVol = in.readLong();
		this.otdDayBuyDmaVol = in.readLong();
		this.otdDaySellDmaVol = in.readLong();
		this.otdDayBuyNeatVol = in.readLong();
		this.otdDaySellNeatVol = in.readLong();
		this.otdDayBuyCtclVol = in.readLong();
		this.otdDaySellCtclVol = in.readLong();
		this.otdTrnscTtnTime = in.readLong();
		this.otdDbOrdrNmbr = in.readLong();
		this.otdDbBraccBuyVol = in.readLong();
		this.otdDbBraccBuyNoOfTrds = in.readLong();
		this.otdDbBraccBuyPendingVol = in.readLong();
		this.otdDbBraccSellVol = in.readLong();
		this.otdDbBraccSellNoOfTrds = in.readLong();
		this.otdDbBraccSellPendingVol = in.readLong();
		this.otdDbPanIdBuyVol = in.readLong();
		this.otdDbPanIdBuyNoOfTrds = in.readLong();
		this.otdDbPanIdBuyPendingVol = in.readLong();
		this.otdDbPanIdSellVol = in.readLong();
		this.otdDbPanIdSellNoOFTrds = in.readLong();
		this.otdDbPanIdSellPendingVol = in.readLong();
		this.otdDsOrdrNmbr = in.readLong();
		this.otdDsBraccBuyVol = in.readLong();
		this.otdDsBraccBuyNOOfTrds = in.readLong();
		this.otdDsBraccBuyPendingVol = in.readLong();
		this.otdDsBraccSellVol = in.readLong();
		this.otdDsBraccSellNoOfTrds = in.readLong();
		this.otdDsBraccSellPendingVol = in.readLong();
		this.otdDsPanIdBuyVol = in.readLong();
		this.otdDsPanIdBuyNoOfTrds = in.readLong();
		this.otdDsPanIdBuyPendingVol = in.readLong();
		this.otdDsPanIdSellVol = in.readLong();
		this.otdDsPanIdSellNoOfTrds = in.readLong();
		this.otdDsPanIdSellPendingVol = in.readLong();
		this.otdDbExecTimeStamp = in.readLong();
		this.otdDsExecTimeStamp = in.readLong();
		this.otdMchnNmbr = in.readInt();
		this.otdSeqNmbr = in.readInt();
		this.otdgroupSeqNmbr = in.readInt();
		this.otdFillQty = in.readInt();
		this.otdDbGoodTllDate = in.readInt();
		this.otdDsGoodTllDate = in.readInt();
		this.otdDbUserNmbr = in.readInt();
		this.otdDbDisclosedVol = in.readInt();
		this.otdDbDiscRmndrVol = in.readInt();
		this.otdDbRemainingVol = in.readInt();
		this.otdDbOriginalVol = in.readInt();
		this.otdDbTodayFilledVol = in.readInt();
		this.otdDsUserNmbr = in.readInt();
		this.otdDsDisclosedVol = in.readInt();
		this.otdDsDisCRmndrVol = in.readInt();
		this.otdDsRemainingVol = in.readInt();
		this.otdDsOriginalVol = in.readInt();
		this.otdDsTodayFilledVol = in.readInt();
		this.otdDbMinFillAon = in.readInt();
		this.otdDbBranch = in.readInt();
		this.otdDbSettlement = in.readInt();
		this.otdDsBranch = in.readInt();
		this.otdDsSettlement = in.readInt();
		this.otdDsMinFillAon = in.readInt();
		this.otdDbQtyChange = in.readInt();
		this.otdDsQtyChange = in.readInt();
		this.otdActivityType = in.readShort();
		this.otdDbProClient = in.readShort();
		this.otdDsProClient = in.readShort();
		this.otdDbBook = in.readShort();
		this.otdDsBook = in.readShort();
		this.otdDbAuctionNmbr = in.readShort();
		this.otdDsAuctionNmbr = in.readShort();
		this.otdRcrdIndctr = (String) in.readObject();
		this.otdBuySell = (String) in.readObject();

		// public Timestamp otdFillDate= in.read
		this.otdFillDate = (Timestamp) in.readObject();

		this.otdActvtySymblName = (String) in.readObject();
		this.otdActvtySeries = (String) in.readObject();

		// public Timestamp otdRcrdTime= in.read
		this.otdRcrdTime = (Timestamp) in.readObject();

		this.otdDbBrokrNmbr = (String) in.readObject();
		this.otdDbAccntNmbr = (String) in.readObject();
		this.otdDbName = (String) in.readObject();
		this.otdDbCtgry = (String) in.readObject();
		this.otdDbHouseHoldId = (String) in.readObject();
		// public Timestamp otdDbEntryDate= in.read
		this.otdDbEntryDate = (Timestamp) in.readObject();

		// public Timestamp otdDbLastModifiedDate= in.read
		this.otdDbLastModifiedDate = (Timestamp) in.readObject();

		this.otdDbMkt = (String) in.readObject();
		this.otdDbOnStop = (String) in.readObject();
		this.otdDbDay = (String) in.readObject();
		this.otdDbGtc = (String) in.readObject();
		this.otdDbFok = (String) in.readObject();
		this.otdDbPanId = (String) in.readObject();
		this.otdDbPanInfo = (String) in.readObject();
		this.otdDbParticipantFlag = (String) in.readObject();
		this.otdDsBrokrNmbr = (String) in.readObject();
		this.otdDsAccntNmbr = (String) in.readObject();
		this.otdDsName = (String) in.readObject();
		this.otdDsCtgry = (String) in.readObject();
		this.otdDsHouseHoldId = (String) in.readObject();
		// public Timestamp otdDsEntryDate= in.read
		this.otdDsEntryDate = (Timestamp) in.readObject();

		// public Timestamp otdDsLastModifiedDate= in.read
		this.otdDsLastModifiedDate = (Timestamp) in.readObject();

		this.otdDsMkt = (String) in.readObject();
		this.otdDsOnStop = (String) in.readObject();
		this.otdDsDay = (String) in.readObject();
		this.otdDsGtc = (String) in.readObject();
		this.otdDsFok = (String) in.readObject();
		this.otdDsPanId = (String) in.readObject();
		this.otdDsPanInfo = (String) in.readObject();
		this.otdDsParticipantFlag = (String) in.readObject();

		// public Timestamp otdPrevTrdTime= in.read
		this.otdPrevTrdTime = (Timestamp) in.readObject();

		this.otdDbAddressInfo = (String) in.readObject();
		this.otdDbBrokrName = (String) in.readObject();
		this.otdDbBrokrSebiId = (String) in.readObject();
		this.otdDsAddressInfo = (String) in.readObject();
		this.otdDsBrokrName = (String) in.readObject();
		this.otdDsBrokrSebiId = (String) in.readObject();
		this.otdDbCtrlFlag = (String) in.readObject();
		this.otdDsCtrlFlag = (String) in.readObject();
		this.otdDbParticipant = (String) in.readObject();
		this.otdDbMf = (String) in.readObject();
		this.otdDbAON = (String) in.readObject();
		this.otdDbATO = (String) in.readObject();
		this.otdDbModified = (String) in.readObject();
		this.otdDbMatchedIndctr = (String) in.readObject();
		this.otdDbTraded = (String) in.readObject();
		this.otdDbFrozen = (String) in.readObject();
		this.otdDbOERemarks = (String) in.readObject();
		this.otdDbPreOpenMatch = (String) in.readObject();
		this.otdDsParticipant = (String) in.readObject();
		this.otdDsMF = (String) in.readObject();
		this.otdDsAON = (String) in.readObject();
		this.otdDsATO = (String) in.readObject();
		this.otdDsModified = (String) in.readObject();
		this.otdDsMatchedIndctr = (String) in.readObject();
		this.otdDsTraded = (String) in.readObject();
		this.otdDsFrozen = (String) in.readObject();
		this.otdDsOERemarks = (String) in.readObject();
		this.otdDsPreOpenMatch = (String) in.readObject();
		this.otdDbAlgoIndc = (String) in.readObject();
		this.otdDbDmaIndc = (String) in.readObject();
		this.otdDbIbtIndc = (String) in.readObject();
		this.otdDbStwtIndc = (String) in.readObject();
		this.otdDbSorIndc = (String) in.readObject();
		this.otdDbColoIndc = (String) in.readObject();
		this.otdDbPrcChangeIndc = (String) in.readObject();
		this.otdDbQtyChangeIndc = (String) in.readObject();
		this.otdDsAlgoIndc = (String) in.readObject();
		this.otdDsDmaIndc = (String) in.readObject();
		this.otdDsIbtIndc = (String) in.readObject();
		this.otdDsStwtIndc = (String) in.readObject();
		this.otdDsSorIndc = (String) in.readObject();
		this.otdDsColoIndc = (String) in.readObject();
		this.otdDsQtyChangeIndc = (String) in.readObject();
		this.otdDsPrcChangeIndc = (String) in.readObject();

		// public Timestamp otdDbEntryTime= in.read
		this.otdDbEntryTime = (Timestamp) in.readObject();

		// public Timestamp otdDsEntryTime= in.read
		this.otdDsEntryTime = (Timestamp) in.readObject();

		// public Timestamp otdDbLttOrdrMod= in.read
		this.otdDbLttOrdrMod = (Timestamp) in.readObject();

		// public Timestamp otdDsLttOrdrMod= in.read
		this.otdDsLttOrdrMod = (Timestamp) in.readObject();

		// public Timestamp otdDbOrdrOrgnlPrevTrdTime= in.read
		this.otdDbOrdrOrgnlPrevTrdTime = (Timestamp) in.readObject();

		// public Timestamp otdDsOrdrOrgnlPrevTrdTime= in.read
		this.otdDsOrdrOrgnlPrevTrdTime = (Timestamp) in.readObject();

		this.otdFillNmbr = (String) in.readObject();

		// public Date otdBatchDate= in.read
		this.otdBatchDate = (Date) in.readObject();

		this.otdMktType = (String) in.readObject();
		this.otdDbTppIndc = (String) in.readObject();
		this.otdDsTppIndc = (String) in.readObject();
		this.ostDsActvPasvBit = (String) in.readObject();
		this.ostDbActvPasvBit = (String) in.readObject();

		// System.out.println("available mid: " + in.available());

		// System.out.println("available end: " + in.available());

		this.otdDbAlgoId = in.readInt();
		this.otdDsAlgoId = in.readInt();
		this.otdDbAlgoCategory = in.readShort();
		this.otdDsAlgoCategory = in.readShort();
		this.ccdTrdPrice = in.readDouble();
		this.ccdOrdrPrice = in.readDouble();
		this.ccdVarLtpPrevClose = in.readDouble();
		this.ccdVarLtpOpn = in.readDouble();
		this.ccdVarHighLow = in.readDouble();
		this.ccdVarOpnPrevClose = in.readDouble();
		this.ccdVarPrevCloseDayHigh = in.readDouble();
		this.ccdVarPrevCloseDayLow = in.readDouble();
		this.ccdYearHigh = in.readDouble();
		this.ccdYearLow = in.readDouble();
		this.ccdDayUpTicks = in.readLong();
		this.ccdDayDnTicks = in.readLong();
		this.ccdDaysSnceLastTrd = in.readShort();
		this.groupId = in.readShort();
		/*
		 * this.alertFlag= in.readByte(); this.collectorFlag= in.readByte();
		 */
		// this.aggressorIndicator= (String) in.readObject();

		this.otdDbStpIndc = (String) in.readObject();
		this.otdDsStpIndc = (String) in.readObject();
		this.otdDbStpCxl = (String) in.readObject();
		this.otdDsStpCxl = (String) in.readObject();
		this.otdDbCAPanNmbr = (String) in.readObject();
		this.otdDsCAPanNmbr = (String) in.readObject();

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeDouble(otdFillPrice);
		out.writeDouble(otdFillAmnt);
		out.writeDouble(otdPrevTrdPrice);
		out.writeDouble(otdPrevTrdPriceDbOrdrMod);
		out.writeDouble(otdPrevTrdPriceDsOrdrMod);
		out.writeDouble(otdPrevTrdPriceLtp);
		out.writeDouble(otdDayHigh);
		out.writeDouble(otdDayLow);
		out.writeDouble(otdDayOpen);
		out.writeDouble(otdPrevDayClose);
		out.writeDouble(otdDayTrnOver);
		out.writeDouble(otdTrdDevPrevTrdPrice);
		out.writeDouble(otdOrdrDevPrevTrdPrice);
		out.writeDouble(otdDbLimitPrice);
		out.writeDouble(otdDbTriggerPrice);
		out.writeDouble(otdDbBraccBuyTrnOver);
		out.writeDouble(otdDbBraccSellTrnOver);
		out.writeDouble(otdDbPanIdBuyTrnOver);
		out.writeDouble(otdDbPanIdSellTrnOver);
		out.writeDouble(otdDsLimitPrice);
		out.writeDouble(otdDsTriggerPrice);
		out.writeDouble(otdDsBraccBuyTrnOver);
		out.writeDouble(otdDsBraccSellTrnOver);
		out.writeDouble(otdDsPanIdBuyTrnOver);
		out.writeDouble(otdDsPanIdSellTrnOver);
		out.writeObject(otdDbCtclVndrCd);
		out.writeObject(otdDsCtclVndrCd);
		out.writeDouble(otdDbPrcChange);
		out.writeDouble(otdDsPrcChange);
		out.writeDouble(otdDbLtpOrdrEntry);
		out.writeDouble(otdDsLtpOrdrEntry);
		out.writeDouble(otdBuyOrigPrice);
		out.writeDouble(otdSellOrigPrice);
		out.writeDouble(otdDbOrdrVal);
		out.writeDouble(otdDsOrdrVal);
		out.writeLong(otdLocalSequenceNo);
		out.writeLong(otdDbClientId);
		out.writeLong(otdDsClientId);
		out.writeLong(otdDayVol);
		out.writeLong(otdDayNmbrTrd);
		out.writeLong(otdDayBuyPndngVol);
		out.writeLong(otdDaySellPndngVol);
		out.writeLong(otdDayBuyAlgoVol);
		out.writeLong(otdDaySellAlgoVol);
		out.writeLong(otdDayBuyIbtVol);
		out.writeLong(otdDaySellIbtVol);
		out.writeLong(otdDayBuyDmaVol);
		out.writeLong(otdDaySellDmaVol);
		out.writeLong(otdDayBuyNeatVol);
		out.writeLong(otdDaySellNeatVol);
		out.writeLong(otdDayBuyCtclVol);
		out.writeLong(otdDaySellCtclVol);
		out.writeLong(otdTrnscTtnTime);
		out.writeLong(otdDbOrdrNmbr);
		out.writeLong(otdDbBraccBuyVol);
		out.writeLong(otdDbBraccBuyNoOfTrds);
		out.writeLong(otdDbBraccBuyPendingVol);
		out.writeLong(otdDbBraccSellVol);
		out.writeLong(otdDbBraccSellNoOfTrds);
		out.writeLong(otdDbBraccSellPendingVol);
		out.writeLong(otdDbPanIdBuyVol);
		out.writeLong(otdDbPanIdBuyNoOfTrds);
		out.writeLong(otdDbPanIdBuyPendingVol);
		out.writeLong(otdDbPanIdSellVol);
		out.writeLong(otdDbPanIdSellNoOFTrds);
		out.writeLong(otdDbPanIdSellPendingVol);
		out.writeLong(otdDsOrdrNmbr);
		out.writeLong(otdDsBraccBuyVol);
		out.writeLong(otdDsBraccBuyNOOfTrds);
		out.writeLong(otdDsBraccBuyPendingVol);
		out.writeLong(otdDsBraccSellVol);
		out.writeLong(otdDsBraccSellNoOfTrds);
		out.writeLong(otdDsBraccSellPendingVol);
		out.writeLong(otdDsPanIdBuyVol);
		out.writeLong(otdDsPanIdBuyNoOfTrds);
		out.writeLong(otdDsPanIdBuyPendingVol);
		out.writeLong(otdDsPanIdSellVol);
		out.writeLong(otdDsPanIdSellNoOfTrds);
		out.writeLong(otdDsPanIdSellPendingVol);
		out.writeLong(otdDbExecTimeStamp);
		out.writeLong(otdDsExecTimeStamp);
		out.writeInt(otdMchnNmbr);
		out.writeInt(otdSeqNmbr);
		out.writeInt(otdgroupSeqNmbr);
		out.writeInt(otdFillQty);
		out.writeInt(otdDbGoodTllDate);
		out.writeInt(otdDsGoodTllDate);
		out.writeInt(otdDbUserNmbr);
		out.writeInt(otdDbDisclosedVol);
		out.writeInt(otdDbDiscRmndrVol);
		out.writeInt(otdDbRemainingVol);
		out.writeInt(otdDbOriginalVol);
		out.writeInt(otdDbTodayFilledVol);
		out.writeInt(otdDsUserNmbr);
		out.writeInt(otdDsDisclosedVol);
		out.writeInt(otdDsDisCRmndrVol);
		out.writeInt(otdDsRemainingVol);
		out.writeInt(otdDsOriginalVol);
		out.writeInt(otdDsTodayFilledVol);
		out.writeInt(otdDbMinFillAon);
		out.writeInt(otdDbBranch);
		out.writeInt(otdDbSettlement);
		out.writeInt(otdDsBranch);
		out.writeInt(otdDsSettlement);
		out.writeInt(otdDsMinFillAon);
		out.writeInt(otdDbQtyChange);
		out.writeInt(otdDsQtyChange);
		out.writeShort(otdActivityType);
		out.writeShort(otdDbProClient);
		out.writeShort(otdDsProClient);
		out.writeShort(otdDbBook);
		out.writeShort(otdDsBook);
		out.writeShort(otdDbAuctionNmbr);
		out.writeShort(otdDsAuctionNmbr);
		out.writeObject(otdRcrdIndctr);
		out.writeObject(otdBuySell);

		// public Timestamp otdFillDate);
		out.writeObject(otdFillDate);

		out.writeObject(otdActvtySymblName);
		out.writeObject(otdActvtySeries);

		// public Timestamp otdRcrdTime);
		out.writeObject(otdRcrdTime);

		out.writeObject(otdDbBrokrNmbr);
		out.writeObject(otdDbAccntNmbr);
		out.writeObject(otdDbName);
		out.writeObject(otdDbCtgry);
		out.writeObject(otdDbHouseHoldId);

		// public Timestamp otdDbEntryDate);
		out.writeObject(otdDbEntryDate);

		// public Timestamp otdDbLastModifiedDate);
		out.writeObject(otdDbLastModifiedDate);

		out.writeObject(otdDbMkt);
		out.writeObject(otdDbOnStop);
		out.writeObject(otdDbDay);
		out.writeObject(otdDbGtc);
		out.writeObject(otdDbFok);
		out.writeObject(otdDbPanId);
		out.writeObject(otdDbPanInfo);
		out.writeObject(otdDbParticipantFlag);
		out.writeObject(otdDsBrokrNmbr);
		out.writeObject(otdDsAccntNmbr);
		out.writeObject(otdDsName);
		out.writeObject(otdDsCtgry);
		out.writeObject(otdDsHouseHoldId);

		// public Timestamp otdDsEntryDate);
		out.writeObject(otdDsEntryDate);

		// public Timestamp otdDsLastModifiedDate);
		out.writeObject(otdDsLastModifiedDate);

		out.writeObject(otdDsMkt);
		out.writeObject(otdDsOnStop);
		out.writeObject(otdDsDay);
		out.writeObject(otdDsGtc);
		out.writeObject(otdDsFok);
		out.writeObject(otdDsPanId);
		out.writeObject(otdDsPanInfo);
		out.writeObject(otdDsParticipantFlag);

		// public Timestamp otdPrevTrdTime);
		out.writeObject(otdPrevTrdTime);

		out.writeObject(otdDbAddressInfo);
		out.writeObject(otdDbBrokrName);
		out.writeObject(otdDbBrokrSebiId);
		out.writeObject(otdDsAddressInfo);
		out.writeObject(otdDsBrokrName);
		out.writeObject(otdDsBrokrSebiId);
		out.writeObject(otdDbCtrlFlag);
		out.writeObject(otdDsCtrlFlag);
		out.writeObject(otdDbParticipant);
		out.writeObject(otdDbMf);
		out.writeObject(otdDbAON);
		out.writeObject(otdDbATO);
		out.writeObject(otdDbModified);
		out.writeObject(otdDbMatchedIndctr);
		out.writeObject(otdDbTraded);
		out.writeObject(otdDbFrozen);
		out.writeObject(otdDbOERemarks);
		out.writeObject(otdDbPreOpenMatch);
		out.writeObject(otdDsParticipant);
		out.writeObject(otdDsMF);
		out.writeObject(otdDsAON);
		out.writeObject(otdDsATO);
		out.writeObject(otdDsModified);
		out.writeObject(otdDsMatchedIndctr);
		out.writeObject(otdDsTraded);
		out.writeObject(otdDsFrozen);
		out.writeObject(otdDsOERemarks);
		out.writeObject(otdDsPreOpenMatch);
		out.writeObject(otdDbAlgoIndc);
		out.writeObject(otdDbDmaIndc);
		out.writeObject(otdDbIbtIndc);
		out.writeObject(otdDbStwtIndc);
		out.writeObject(otdDbSorIndc);
		out.writeObject(otdDbColoIndc);
		out.writeObject(otdDbPrcChangeIndc);
		out.writeObject(otdDbQtyChangeIndc);
		out.writeObject(otdDsAlgoIndc);
		out.writeObject(otdDsDmaIndc);
		out.writeObject(otdDsIbtIndc);
		out.writeObject(otdDsStwtIndc);
		out.writeObject(otdDsSorIndc);
		out.writeObject(otdDsColoIndc);
		out.writeObject(otdDsQtyChangeIndc);
		out.writeObject(otdDsPrcChangeIndc);
		// public Timestamp otdDbEntryTime);
		out.writeObject(otdDbEntryTime);

		// public Timestamp otdDsEntryTime);
		out.writeObject(otdDsEntryTime);

		// public Timestamp otdDbLttOrdrMod);
		out.writeObject(otdDbLttOrdrMod);

		// public Timestamp otdDsLttOrdrMod);
		out.writeObject(otdDsLttOrdrMod);

		// public Timestamp otdDbOrdrOrgnlPrevTrdTime);

		out.writeObject(otdDbOrdrOrgnlPrevTrdTime);

		// public Timestamp otdDsOrdrOrgnlPrevTrdTime);
		out.writeObject(otdDsOrdrOrgnlPrevTrdTime);

		out.writeObject(otdFillNmbr);
		// public Date otdBatchDate)
		out.writeObject(otdBatchDate);

		out.writeObject(otdMktType);
		out.writeObject(otdDbTppIndc);
		out.writeObject(otdDsTppIndc);
		out.writeObject(ostDsActvPasvBit);
		out.writeObject(ostDbActvPasvBit);

		out.writeInt(otdDbAlgoId);
		out.writeInt(otdDsAlgoId);
		out.writeShort(otdDbAlgoCategory);
		out.writeShort(otdDsAlgoCategory);
		out.writeDouble(ccdTrdPrice);
		out.writeDouble(ccdOrdrPrice);
		out.writeDouble(ccdVarLtpPrevClose);
		out.writeDouble(ccdVarLtpOpn);
		out.writeDouble(ccdVarHighLow);
		out.writeDouble(ccdVarOpnPrevClose);
		out.writeDouble(ccdVarPrevCloseDayHigh);
		out.writeDouble(ccdVarPrevCloseDayLow);
		out.writeDouble(ccdYearHigh);
		out.writeDouble(ccdYearLow);
		out.writeLong(ccdDayUpTicks);
		out.writeLong(ccdDayDnTicks);
		out.writeShort(ccdDaysSnceLastTrd);
		out.writeShort(groupId);
		/*
		 * out.writeByte(alertFlag); out.writeByte(collectorFlag);
		 */
		// out.writeObject(aggressorIndicator);

		out.writeObject(otdDbStpIndc);
		out.writeObject(otdDsStpIndc);
		out.writeObject(otdDbStpCxl);
		out.writeObject(otdDsStpCxl);
		out.writeObject(otdDbCAPanNmbr);
		out.writeObject(otdDsCAPanNmbr);

	}

}
