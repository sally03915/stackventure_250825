package bank_db_ver;

import java.util.ArrayList;
import java.util.Scanner;
 

public class Menu {
	public void exec() {
		ArrayList<Account> creAccount = new ArrayList<Account>();
		Scanner sc = new Scanner(System.in);
		Bank_Controller bCtrl = null;
		while(true){
			bankMenu();
			int select = sc.nextInt();
		 	if(select == 1) {
				//bank.createAccount(creAccount);
		 		bCtrl = new Input();
			}else if(select == 2) {
				//bank.selectAccount(creAccount);
				bCtrl = new Show();
			}else if(select == 3) {
//				bank.deposit(creAccount);
				bCtrl = new Deposit();
			}else if(select == 4) {
//				bank.withdraw(creAccount);
				bCtrl = new Withdraw();
			}else if(select == 5) {
//				bank.delete(creAccount);
				bCtrl = new Delete();
			}else{
				System.out.println("종료기능입니다.");
				System.exit(0);
			}
		 	bCtrl.exec(creAccount);
		}
		
	}
	void bankMenu() {
		System.out.println("======="+Account.Company+"=========");
		System.out.println("* 1.추가");
		System.out.println("* 2.조회");
		System.out.println("* 3.입금");
		System.out.println("* 4.출금");
		System.out.println("* 5.삭제");
		System.out.println("* 9.종료");
		System.out.print("입력>>> ");
	}
}
