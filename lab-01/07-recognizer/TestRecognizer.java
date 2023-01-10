class TestRecognizer {
     public static void main(String args[]) {
          Recognizer recognizer = new Recognizer();
          int[][] sequences = { { 1, 2, 3, 4, 1, 2 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5, 2, 3 } };
          for (int i = 0; i < sequences.length; i++) {
               System.out.println("Sequence " + (i + 1) + ":");
               for (int j = 0; j < sequences[i].length; j++) {
                    System.out.println("Next expected int is: " + recognizer.nextExpectedInt());
                    switch (sequences[i][j]) {
                         case 1:
                              System.out.println("Now the result of the check is: " + recognizer.check1(1));
                              break;
                         case 2:
                              System.out.println("Now the result of the check is: " + recognizer.check2(2));
                              break;
                         case 3:
                              System.out.println("Now the result of the check is: " + recognizer.check3(3));
                              break;
                         case 4:
                              System.out.println("Now the result of the check is: " + recognizer.check4(4));
                              break;
                         default:
                              System.out.println("Now the result of the check is: " + recognizer.check1(5));
                              break;
                    }
               }
          }

     }
}
