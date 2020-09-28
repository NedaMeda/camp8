public class LunaPark {
    public static void main(String[]args){

        int zeleniZeton=0;  //moze na svaku voznju
        int plaviZeton=0; //moze na svaku drugu voznju
        int crveniZeton=0; // moze na svaku cetvrtu voznju
        int brojVoznje=1;

        while(crveniZeton<3) {

            if (brojVoznje % 4 == 0) {
                crveniZeton++;
            } else if (brojVoznje % 2 == 0) {
                plaviZeton++;
            } else {
                zeleniZeton++;
            }
            brojVoznje++;
        }
        System.out.println("Crveni zeton:"+ crveniZeton);
        System.out.println("Plavi zeton:"+ plaviZeton);
        System.out.println("Zeleni zeton:"+ zeleniZeton);
    }
}
