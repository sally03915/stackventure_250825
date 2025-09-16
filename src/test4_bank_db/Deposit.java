package bank_db_ver;

import java.util.ArrayList;
 

public class Deposit implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
		String str = com.inputAccount();
		
		try {
			Account account = new Account();
			BDAO bDAO = new BDAO();
			account = bDAO.depositDAO(str);
			
			if(account.getNo() != 0) {
				System.out.println("=======");
				System.out.println("입금완료");
				System.out.println("잔액 : "+account.getBalance());
			//creAccount.get(idPwChk-1).setMoney(myMoney);
			}else {
				System.out.println("다시 확인해주세요.");
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
