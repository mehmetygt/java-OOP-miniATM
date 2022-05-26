
public class Hesap {
    
    private String kullanıcı_ad;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_ad, String parola, int bakiye) {
        this.kullanıcı_ad = kullanıcı_ad;
        this.parola = parola;
        this.bakiye = bakiye;
    }

  

    public String getKullanıcı_ad() {
        return kullanıcı_ad;
    }

    public String getparola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setKullanıcı_ad(String kullanıcı_ad) {
        this.kullanıcı_ad = kullanıcı_ad;
    }

    public void setparola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void parayatır(int tutar){
    bakiye+=tutar;
        System.out.println("yeni bakiyeniz : "+bakiye);}
    
    public void paracek(int tutar){
        if (bakiye<tutar) {
            System.out.println("bakiyeniz yetersiz");
            System.out.println("bakiyeniz : "+bakiye);
            
        } else {bakiye-=tutar;
            System.out.println("yeni bakiyeniz : "+bakiye);
        }
    
    
    }
}
