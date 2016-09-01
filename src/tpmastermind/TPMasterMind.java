package tpmastermind;

/**
 * Created by RENAUD on 01/09/2016.
 */
public class TPMasterMind {

    static int[][] tMasterMind = {{3,2,2,1},{3,2,2,1}};
    static int reponseOk = 1000;

    public static void main(String[] args) {
        //TODO plusieurs fois la meme couleur
        System.out.println(verification());
    }




    public static String verification() {
        int cptMalPlacer = 0;
        int cptBienPlacer = 0;
        for (int i = 0; i < tMasterMind[0].length; i++){
            if(tMasterMind[0][i] == tMasterMind[1][i]){
                cptBienPlacer++;
                tMasterMind[0][i] = reponseOk();
                tMasterMind[1][i] = reponseOk();
            }
        }

        return "Solution bien placé : " + cptBienPlacer + "\nSolution mal placé : " + cptMalPlacer;
    }

    public static int reponseOk() {
        reponseOk++;
        return reponseOk;
    }
}
