import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;


        Scanner imp = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = imp.nextInt();
        System.out.println("Fizik notunuz : ");
        fizik = imp.nextInt();
        System.out.println("Türkçe notunuz : ");
        turkce = imp.nextInt();
        System.out.println("Kimya notunuz : ");
        kimya = imp.nextInt();
        System.out.println("Müzik notunuz : ");
        muzik = imp.nextInt();

        if(mat<0 || mat>100 || fizik<0 || fizik>100 || turkce<0 || turkce>100 || kimya<0 || kimya>100 || muzik<0 || muzik >100){
            System.out.println("Girdiğiniz not 0 ile 100 arasında olmalıdır lütfen tekrar deneyin.");
        }else {
            double ortalama = (mat + fizik + turkce + kimya + muzik) / 5.0;

            if (ortalama >= 55){
                System.out.println("Tebrikler sınıfı geçtiniz");
                System.out.println("Ortalamanız : " + ortalama);
            }else{
                System.out.println("Sınıfı geçemediniz daha çok çalışmanız lazım");
                System.out.println("Ortalamanız : " + ortalama);
            }
        }
    }
}
