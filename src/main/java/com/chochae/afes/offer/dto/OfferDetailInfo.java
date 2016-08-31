package com.chochae.afes.offer.dto;

public class OfferDetailInfo {

	private String		offerId;
	private long		time;
	private String		orderId;
	private int			marketId;
	private String		marketName;
	private float		amount;
	private float		tradeRate;
	private float		bitcoinCnt;
	private int			tradeType; // 0 for buy, 1 for sale
	
	
	public OfferDetailInfo() {
		super();
	}
	
	public OfferDetailInfo(String offerId, long time, int marketId, float amount, float tradeRate,
			float bitcoinCnt, int tradeType) {
		super();
		this.offerId = offerId;
		this.time = time;
		this.marketId = marketId;
		this.amount = amount;
		this.tradeRate = tradeRate;
		this.bitcoinCnt = bitcoinCnt;
		this.tradeType = tradeType;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getMarketId() {
		return marketId;
	}
	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getTradeRate() {
		return tradeRate;
	}
	public void setTradeRate(float tradeRate) {
		this.tradeRate = tradeRate;
	}
	public float getBitcoinCnt() {
		return bitcoinCnt;
	}
	public void setBitcoinCnt(float bitcoinCnt) {
		this.bitcoinCnt = bitcoinCnt;
	}
	public int getTradeType() {
		return tradeType;
	}
	public void setTradeType(int tradeType) {
		this.tradeType = tradeType;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	@Override
	public String toString() {
		return "OfferDetailInfo [offerId=" + offerId + ", time=" + time + ", orderId=" + orderId + ", marketId="
				+ marketId + ", marketName=" + marketName + ", amount=" + amount + ", tradeRate=" + tradeRate
				+ ", bitcoinCnt=" + bitcoinCnt + ", tradeType=" + tradeType + "]";
	}
	
}
