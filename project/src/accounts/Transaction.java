package accounts;

import java.io.Serializable;

public class Transaction implements Serializable
{
	String tTime;
	String tDate;
	PPAccount account;
	String narration;
	String reference;
	String status;
	float debit;
	float credit;
	
	public Transaction(String tTime,String tDate,PPAccount account,String narration,String reference,String status,float debit,float credit){
		this.tTime=tTime;
		this.tDate=tDate;
		this.account=account;
		this.narration=narration;
		this.reference=reference;
		this.status=status;
		this.debit=debit;
		this.credit=credit;
	}
	public String gettTime() {
		return tTime;
	}
	public void settTime(String tTime) {
		this.tTime = tTime;
	}
	public String gettDate() {
		return tDate;
	}
	public void settDate(String tDate) {
		this.tDate = tDate;
	}
	public PPAccount getAccount() {
		return account;
	}
	public void setAccount(PPAccount account) {
		this.account = account;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public float getDebit() {
		return debit;
	}
	public void setDebit(float debit) {
		this.debit = debit;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String toString()
	{
		//return the description of the transaction 
		return (tTime+" "+tDate+" "+account+" "+narration+" "+reference+" "+status+" "+debit+" "+credit);
	}
	
}
