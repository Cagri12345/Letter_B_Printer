package Arrays;

public class LetterBPrinter {
    public static void main(String[] args) {

        // 8x4 boyutunda bir dizi oluşturuluyor
        String[][] letter = new String[8][4];

        // Diziyi doldurmak için döngüler
        for(int i = 0 ; i < letter.length ; i++) {
            for(int j = 0 ; j < letter[i].length ; j++) {

                // İlk, ortadaki ve son satırda yıldızlarla dolu
                if ( i == 0 || i == 3 || i == 7){
                    letter[i][j] = " * ";

                    // İlk ve son sütunlarda yıldızlar var
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";

                    // Diğer hücreler boş
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        // Diziyi ekrana yazdırma
        for(int i = 0 ; i < letter.length ; i++){
            for(int j = 0 ; j < letter[i].length ; j++){
                System.out.print(letter[i][j]);
            }
            System.out.println(); // Her satırdan sonra yeni bir satıra geç
        }
    }
}

