package com.chochae.afes.offer.dto;

import java.util.List;

public class OfferInfo {

	private long	startTime;
	private String	offerId;
	private int		fromLocale;
	private int		toLocale;
	private String  fromLocaleName;
	private String  toLocaleName;
	private float	profit;
	private float	exchangeRate;
	private float	totalAmount;
	private List<OfferDetailInfo> detailList;
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public int getFromLocale() {
		return fromLocale;
	}
	public void setFromLocale(int fromLocale) {
		this.fromLocale = fromLocale;
	}
	public int getToLocale() {
		return toLocale;
	}
	public void setToLocale(int toLocale) {
		this.toLocale = toLocale;
	}
	public float getProfit() {
		return profit;
	}
	public void setProfit(float profit) {
		this.profit = profit;
	}
	public float getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<OfferDetailInfo> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<OfferDetailInfo> detailList) {
		this.detailList = detailList;
	}
	public String getFromLocaleName() {
		return fromLocaleName;
	}
	public void setFromLocaleName(String fromLocaleName) {
		this.fromLocaleName = fromLocaleName;
	}
	public String getToLocaleName() {
		return toLocaleName;
	}
	public void setToLocaleName(String toLocaleName) {
		this.toLocaleName = toLocaleName;
	}
	@Override
	public String toString() {
		return "OfferInfo [startTime=" + startTime + ", offerId=" + offerId + ", fromLocale=" + fromLocale
				+ ", toLocale=" + toLocale + ", fromLocaleName=" + fromLocaleName + ", toLocaleName=" + toLocaleName
				+ ", profit=" + profit + ", exchangeRate=" + exchangeRate + ", totalAmount=" + totalAmount
				+ ", detailList=" + detailList + "]";
	}

}
