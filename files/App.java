class App {
  public static String getSuperSeriesWinner(int[][] scores) {
    final int CanadaScoreIndex = 0;
    final int UssrScoreIndex = 1;

    int CanadaScore = 0;
    int UssrScore = 0;

    for (int[] score : scores) {
      if (score[CanadaScoreIndex] > score[UssrScoreIndex]) {
        CanadaScore++;
      } else if (score[CanadaScoreIndex] < score[UssrScoreIndex]) {
        UssrScore++;
      }
    }

    if (CanadaScore > UssrScore) {
      return "canada";
    } else if (CanadaScore < UssrScore) {
      return "ussr";
    } else {
      return "draw";
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}