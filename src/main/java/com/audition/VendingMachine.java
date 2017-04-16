package com.audition;

import java.text.DecimalFormat;

public class VendingMachine {
	private CoinHandler coinHandler = new CoinHandler();
	private String displayString = "INSERT COIN"; 

	public double insertCoin(Coin coin){
		
		getCoinHandler().insertCoin(coin);
		setStringToDisplayAfterCoinInsert();
		
		return getCoinHandler().getTotalValueOfCoinsInserted();
	}
	
	public CoinHandler getCoinHandler() {
		return coinHandler;
	}

	public void setCoinHandler(CoinHandler coinHandler) {
		this.coinHandler = coinHandler;
	}
	
	public String getDisplayString() {
		return displayString;
	}

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
	
	private void setStringToDisplayAfterCoinInsert() {
		DecimalFormat doubleToFormat = new DecimalFormat(".##");
		
		if (coinHandler.getTotalValueOfCoinsInserted() > 0){
			setDisplayString(String.valueOf(doubleToFormat.format(coinHandler.getTotalValueOfCoinsInserted())));
		} else{ 
			setDisplayString("INSERT COIN");
		}
	}
	
}
