public class BeregnRektangel {
    //Lav en metod, der beregner arealet af rektangel

    //Kald metoden fra din main() men værdierne
    //a = 2 b =5
    //a = 6 b= 12

    public static void main(String[] args) {
        String beregningsType = "areal";

        System.out.println("Arealer for rektangel a er 2, b er 5 : " + beregnAreal(2,5));
        System.out.println("Arealer for rektangel a er 6, b er 12 : " + beregnAreal(6,12));
    }

    public static int beregnAreal(int a, int b) {

            int areal = a * b;
            return areal;


        }

}
