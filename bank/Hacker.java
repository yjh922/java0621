//같은 패키지에 있는 클래스는 import하지 않는다.
package com.sp.project0621.bank;
class Hacker{
	public static void main(String[] args){
		Account acc=new Account();
		//acc.balance=0;
		//System.out.println(acc.name+"의 남은 잔고"+acc.balance);
		acc.setBalance(-5000);
		System.out.println(acc.getBalance());
	}
}
