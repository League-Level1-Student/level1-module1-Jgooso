package _05_vault;

public class Vault {
	public static void main(String[] args) {
		vaults code = new vaults(1151);
		//code.tryCode(1);
		JamesBond bond = new JamesBond();
		bond.findCode(code);
	}
}
class vaults{
	int codes;
	vaults(int code){
		this.codes = code;
	}
	
 boolean tryCode(int number){
		if(codes == number) {
			return true;
		}else {
			return false;
		}
 }
	
	

}
class JamesBond{
	int realCode = 0;
	void findCode(vaults safe) {
		while(realCode < 1000000) {
		realCode+=1;
		if(safe.tryCode(realCode) == true) {
			System.out.println(realCode);
			break;
			
		}
		}
		if(realCode == 1000000) {
		System.out.print("-1");
		}
	}
}

