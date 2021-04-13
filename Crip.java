import java.util.ArrayList;

public class Crip {
	private ArrayList list=new ArrayList();
	private ArrayList deList=new ArrayList();
	private ArrayList deCryption=new ArrayList();
	private String Password="";
	
	
	
	public void enCryption(String input) {
		input=input.toLowerCase();
		for (int i=0;i<input.length();i++) {
			if(input.substring(i)!=null) {
				int uniCode=input.charAt(i)+input.length();
				list.add(uniCode);
			}
			else {
				list.add(0);
			}
		}
		for (int i=0;i<list.size();i++) {
			Password+=list.get(i);
			if(i+1!=list.size()) {
				Password+="-";
			}
			
		}
	}

	public void deCryption(String input) {
		String str = Password.split(" ")[0];
		str=str.replace("-","");
		char deCryp;
		System.out.print("deCryption  : ");
			for (int i=0;i<str.length();i=i+3) {
				deCryp=(char)(Integer.parseInt(str.substring(i, i+3))-input.length());
				System.out.print(deCryp);
			}
	}

	public void showInfos() {
		System.out.println("enCryption  : "+Password);
	}

	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
	
}
