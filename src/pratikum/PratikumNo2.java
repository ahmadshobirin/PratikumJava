package pratikum;

/**
 *
 * @author shob
 */
       

public class PratikumNo2 {
    public static void main(String[] args){
        BangunDatar biodata = new BangunDatar();
        biodata.nama();
        biodata.nbi();
        
        ////
        
        Trapesium Luas = new Trapesium();
        Luas.luas();
    }
}


class BangunDatar{
    public void nama(){
        System.out.println("Nama: Ahmad Shobirin");
    }
    
    public void nbi(){
        System.out.println("NBI: 1461900011");
    }
    
    float luas(){
        return 0;
    }
}


class Trapesium extends BangunDatar{

    @Override
    float luas() {
       
        double set = 0.5;
        float luas;
        float a = 3, b=2, tinggi=10;
        
        luas = (float) (set * (a+b)* tinggi);
        
        System.out.println("Luas \t: "+luas);
        return luas;
    }
    
}
