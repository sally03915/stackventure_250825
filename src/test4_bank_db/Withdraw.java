package bank_db_ver;

import java.util.ArrayList;
 

public class Withdraw implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		String str = com.inputAccount();
		BDAO bDAO = new BDAO();
		int num = bDAO.withdrawDAO(str);
		
		if(num > 0) {
			System.out.println("==출금완료");					
		}
	}

}
