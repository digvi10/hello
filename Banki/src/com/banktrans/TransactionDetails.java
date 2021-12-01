package com.banktrans;

public class TransactionDetails
{
	String id;
	String cardno;
	String date;
	String amount;
	@Override
	public String toString() {
		return "\nTransactionDetails [id=" + id + ", cardno=" + cardno + ", date=" + date + ", amount=" + amount + "]";
	}
	public TransactionDetails(String id, String cardno, String date, String amount) {
		super();
		this.id = id;
		this.cardno = cardno;
		this.date = date;
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
