
import java.util.Scanner;


public class ATM {
    
    public void çalış(Hesap hesap){
    login login=new login();
    
        Scanner s=new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgediniz");
         System.out.println("*******************");
          System.out.println("Kullanıcı Girişi.");
          System.out.println("*******************");
          int giris_hakkı=3;
          
          while (true) {
              
              if (login.login(hesap)) {
                   System.out.println("giriş başarılı");
                   break;
                   }
              else{
                  System.out.println("Giriş başarısız ");
                  giris_hakkı-=1;
                  System.out.println("Kalan giriş hakkı : "+giris_hakkı);
              }
              if (giris_hakkı==0) {
                  System.out.println("Giriş hakkınız bitmiştir.");
                return;  
              }
            
        }
          
    
        System.out.println("*************");
        String islemler="1.Bakiye göster\n"
                +"2.Para yatırma\n"
                +"3.Para çekme\n"
                +"Çıkış için q ya basın";
       System.out.println(islemler);
       System.out.println("***************");
        while (true) {            
            System.out.println("İşlem seçiniz.");
            System.out.println("***************");
            String islem=s.nextLine();
            if (islem.equals("q")) {
                break;
                
            }else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : "+hesap.getBakiye());
                
                
            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutarı girin");
                int tutar=s.nextInt();
                s.nextLine();
                hesap.parayatır(tutar);
                
                
                
            } else if (islem.equals("3")) {
                System.out.println("Çekmek istediğiniz tutarı girin");
                int tutar=s.nextInt();
               s.nextLine();
                hesap.paracek(tutar);
                
        }
            else{System.out.println("Geçersiz İşlem");}
        
        
        
        
            }
    
    
    
}}
