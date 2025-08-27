package bank_db_ver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
 

public class Delete implements Bank_Controller{
	@Override
	public void exec(ArrayList<Account> creAccount) {
		Common com = new Common();
	
		String str = com.inputAccount();
		
		BDAO bDAO = new BDAO();
		int num =  bDAO.deleteDAO(str);
		
		if(num > 0) {
			System.out.println("삭제가 완료되었습니다.");
		}
	}

}
