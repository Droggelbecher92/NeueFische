public class ForSchleife {

    public static int facultryMath(int whichFacultry) {
        int solution = 1;
        for (int i = 2; i <= whichFacultry ; i++){
            solution = solution*i;
        }
        return solution;
    }
}
