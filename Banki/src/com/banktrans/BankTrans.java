package com.banktrans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankTrans {
	public ArrayList addUser()
	{
		FileReader f2;
		ArrayList<UserDetails> ls = new ArrayList<UserDetails>();

		try {
			f2 = new FileReader("D:\\Java\\appData\\Files\\BankAccount.txt");
			BufferedReader br = new BufferedReader(f2);
			String name;
			while ((name = br.readLine()) != null) {
				String age = br.readLine();
				String gender = br.readLine();
				String bank = br.readLine();
				String cardno = br.readLine();
				String creditlimit = br.readLine();
				ls.add(new UserDetails(name, age, gender, bank, cardno, creditlimit));
			}
		} catch (Exception e) {
			System.out.println("Somthine went wrong");
			e.printStackTrace();
		}
		return ls;
		
	}
	public ArrayList addTransaction()
	{
		FileReader f;
		ArrayList<TransactionDetails> ls1 = new ArrayList<TransactionDetails>();
		try {
			f = new FileReader("D:\\Java\\appData\\Files\\BankTransaction.txt");
			BufferedReader br = new BufferedReader(f);
			String id;

			while ((id = br.readLine()) != null) {
				String cardno = br.readLine();
				String date = br.readLine();
				String amount = br.readLine();
				ls1.add(new TransactionDetails(id, cardno, date, amount));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls1;
		
	}
	
	public static void main(String[] args)
	{
		
		BankTrans bT=new BankTrans();
		ArrayList<UserDetails> ls =bT.addUser();
		ArrayList<TransactionDetails> ls1=bT.addTransaction();
		Map m=new HashMap();
		
		for (int i = 0; i < ls1.size(); i++) {
			String tCardNo = ls1.get(i).getCardno();
			for (int j = 0; j < ls.size(); j++) {
				if (ls.get(j).getCardno().equals(tCardNo)) {
					long amt=Integer.parseInt(ls.get(j).getCreditlimit())-Integer.parseInt(ls1.get(i).getAmount());
					String t=""+amt;
					ls.get(j).setCreditlimit(t);
					m.put(ls1.get(i), ls.get(j));
				}
			}
		}
		System.out.println(m);
	}

}
