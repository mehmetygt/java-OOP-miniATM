
import java.util.Scanner;


public class login {
    public boolean login(Hesap hesap){
    
        Scanner scan=new Scanner(System.in);
        String kullanıcıAdı;
        String parola;
        
        System.out.println("Kullanıcı adı :");
        kullanıcıAdı=scan.nextLine();
        System.out.println("parola gir :");
        parola=scan.nextLine();
        if (hesap.getKullanıcı_ad().equals(kullanıcıAdı)&&hesap.getparola().equals(parola)) {
        return true;
            
        } else {return false;
        }
    
    }
    
}
