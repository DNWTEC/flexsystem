package com.chochae.afes.operator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chochae.afes.HomeController;
import com.chochae.afes.offer.dto.OfferDetailInfo;
import com.chochae.afes.offer.dto.OfferInfo;

@Controller
public class OfferController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/offerList", method = RequestMethod.GET)
	public String sayHello(Locale locale, Model model) {
		logger.info(".", locale);
		
		
		return "/operator/offerlist";
	}	
	
	@RequestMapping(value = "/offerDatas", method = RequestMethod.GET)
	public @ResponseBody List<OfferInfo> checkUser(HttpServletRequest request, ModelMap model) {
		
		return testDatas();
	}
	
	private List<OfferInfo> testDatas() {
	
		String[] marketNames = {"huobi", "bitThumb", "btcc", "korbit", "okcoin"};
		long curTime = System.currentTimeMillis();
		List<OfferInfo> offerList = new ArrayList<OfferInfo>();
		OfferInfo offer = new OfferInfo();
		
		offer.setStartTime(curTime);
		offer.setOfferId("banba" + curTime);
		offer.setFromLocale(10);
		offer.setToLocale(20);
		offer.setProfit((float)Math.random() * 5);
		
		List<OfferDetailInfo> detailList = new ArrayList<OfferDetailInfo>();
		int cnt = (int) (2 + Math.random() * 3);
		for (int i = 0; i < cnt; i ++) {
			OfferDetailInfo detail = OfferDetailInfo(curTime, i, marketNames[i], (i % 2 == 0? 0:1));
			detailList.add(detail);
		}
		
		offerList.add(offer);
		return offerList;
	}
	
	
	private OfferDetailInfo OfferDetailInfo(long curTime, int marketId, String marketName, int tradeType) {
		String offerId = "banba" + curTime;
		
		OfferDetailInfo trade = new OfferDetailInfo();
		trade.setOfferId(offerId);
		trade.setTime(curTime);
		trade.setMarketId(10);
		trade.setMarketName(marketName);
		trade.setAmount((float)Math.random() * 10000 );
		trade.setTradeRate((float)Math.random() * 4000);
		trade.setBitcoinCnt(10);
		trade.setTradeType(tradeType);
		
		return trade;
	}
}
