
public class main {
    public static void main(String[] args) {
        //nesne yönelimli (OOP) ATM programı yapcaz
        //login class kullanıcı girişini kontrol edecek
        //hesap classı hesapları kontrol edecek
        //ATM ise atm mizi kontrol edecek
        
        ATM atm1=new ATM();
        Hesap hesap1=new Hesap("mehmetygt","12345",3000);
        atm1.çalış(hesap1);
        
        System.out.println("program sonlandırılıyor......");
        
        
    }
    
}
