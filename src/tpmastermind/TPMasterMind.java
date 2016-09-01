package tpmastermind;

/**
 * Created by RENAUD on 01/09/2016.
 */
public class TPMasterMind {

    static int[][] tMasterMind = {{2, 1, 1, 1}, {1, 1, 1, 2}};//premier dimension proposition et deuxieme solution
    static int cptReponseOk = 1000;
    static int cptBienPlacer = 0;
    static int cptMalPlacer = 0;

    public static void main(String[] args) {
        System.out.println(verification());
    }


    public static String verification() {
        String retour;
        verifBienPlacer();
        verifMalPlacer();
        retour = "Solution bien placé : " + cptBienPlacer + "\nSolution mal placé : " + cptMalPlacer;
        return retour;
    }

    public static void verifBienPlacer() {
        for (int i = 0; i < tMasterMind[0].length; i++) {
            if (tMasterMind[0][i] == tMasterMind[1][i]) {
                tMasterMind[0][i] = reponseOk();
                tMasterMind[1][i] = reponseOk();
                cptBienPlacer++;
            }
        }
    }

    public static void verifMalPlacer() {
        for (int i = 0; i < tMasterMind[0].length; i++) {
            for (int j = 0; j < tMasterMind[1].length; j++) {
                if (tMasterMind[0][i] == tMasterMind[1][j]) {
                    tMasterMind[0][i] = reponseOk();
                    tMasterMind[1][j] = reponseOk();
                    cptMalPlacer++;
                }
            }
        }
    }

    public static int reponseOk() {
        cptReponseOk++;
        return cptReponseOk;
    }
}
