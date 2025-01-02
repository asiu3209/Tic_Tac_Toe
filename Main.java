import java.util.Scanner;
class Main {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    String p2 = "";
    String p1 = "";
    Scanner inp = new Scanner(System.in);
    System.out.println("Welcome To TicTacToe!");
    while(p1.equals("")){
      System.out.print("Please enter name for Player 1: ");
      p1 = inp.nextLine();
    }
    while(p2.equals("")){
      System.out.print("Please enter name for Player 2: ");
      p2 = inp.nextLine();
    }
    TicTacToe test = new TicTacToe(p1,p2);
    test.setSize(400,400);
    test.setVisible(true);
    System.out.println(test.getRandom() + " goes first");
    inp.close();
  }
}
