package tpmastermind;

/**
 * Created by RENAUD on 01/09/2016.
 */
public class TPMasterMind {

    static int tSoluce[] = {4, 5, 1, 2};//solution test
    static int tProp[] = {5, 4, 1, 2};//proposition test

    public static void main(String[] args) {
        //TODO plusieurs fois la meme couleur

        System.out.println(verification());

    }

    public static String verification() {
        int cptMalPlacer = 0;
        int cptBienPlacer = 0;
        for (int i = 0; i < tProp.length; i++){
            for(int j = 0; j < tSoluce.length; j++){
                if (tProp[i] == tSoluce[j]){
                    if (tProp[i] == tSoluce[i]){
                        cptBienPlacer++;
                    } else {
                        cptMalPlacer++;
                    }
                }
            }
        }
        return "Solution bien placé " + cptBienPlacer + "\nSolution mal placé " + cptMalPlacer;
    }
}
