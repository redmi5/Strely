

import java.io.IOException;

public class Main {

    private static final String ARROW1 = ">>-->";
    private static final String ARROW2 = "<--<<";
    private static final int lengthOfAnArrow = 5;

    private static int countArrows(String toFindInside) {

        int arrowsFound = 0;

        for (int i = 0; i < toFindInside.length() - lengthOfAnArrow; i++) {
            String comparewith = toFindInside.substring(i, i + lengthOfAnArrow);
            if(comparewith.equals(ARROW1) || comparewith.equals(ARROW2)){
                arrowsFound++;
            }
        }

        return arrowsFound;
    }

    public static void main(String[] args) {
        try {
            String input = FileDao.readOneLineFromFile();
            Integer arrowAmount = countArrows(input);
            FileDao.writeStringToFile(arrowAmount.toString());
        } catch (IOException | NullPointerException e) {
            System.err.println(e.toString());
        }
//    System.out.println(countSequences(ARROWS, "<<<<>>--><--<<--<<>>--><<<<<"));
    }
}
