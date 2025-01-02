import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener { 
  private final ArrayList<JButton> buttons;
  private JPanel panel;
  private final String player1,player2;
  private int player_turn;
  public boolean winningStatus;
  private int count = 0;

   public TicTacToe(String p1,String p2){
    this.player1 = p1;
    this.player2 = p2;
    winningStatus = false;
    panel = new JPanel(); 
    panel = new JPanel(new GridLayout(3,3));
    buttons = new ArrayList<>();
    for(int i = 0;i<9;i++){
      JButton tempButton = new JButton();
      buttons.add(tempButton);
      panel.add(buttons.get(i));
    }
    setTitle("Tic-Tac-Toe");
    add(panel);
    addActionListeners();
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
   
   public boolean checkWinnings(){
     return winningStatus;
   }

   public String getName1(){
     return player1;
   }

   public String getName2(){
     return player2;
   }

   public String getRandom(){
     int random = (int) (Math.random() * 2) + 1;
     if (random == 1){
      player_turn = 1;
      return player1;
     }
     else{
        player_turn = 2;
        return player2;
      }
    }

  private void addActionListeners(){
    for(int i = 0;i<buttons.size();i++){
      buttons.get(i).addActionListener(this);
    }
  }
  @Override
  public void actionPerformed(ActionEvent test){
    Object source = test.getSource();
    for(int i = 0;i<buttons.size();i++){
      if(source.equals(buttons.get(i))){
        if (player_turn == 1){
          if(buttons.get(i).getText().equals("")){
            buttons.get(i).setFont(new Font("Ink Free", Font.BOLD, 120));
            buttons.get(i).setForeground(new Color(255, 0, 0));
            buttons.get(i).setText("X");
            player_turn = 2;
            count = count + 1;
            checkMatch();
          }
        }
        else{
            if (buttons.get(i).getText().equals("")){
              buttons.get(i).setFont(new Font("Ink Free", Font.BOLD, 100));
              buttons.get(i).setForeground(new Color(0, 0, 255));
              buttons.get(i).setText("O");
              player_turn = 1;
              count = count + 1;
              checkMatch();
          }
        }
      }
    }
  }
  public void checkMatch() {
    // Check rows
    for (int i = 0; i < 3; i++) {
        if (buttons.get(i * 3).getText().equals(buttons.get(i * 3 + 1).getText()) &&
            buttons.get(i * 3).getText().equals(buttons.get(i * 3 + 2).getText()) &&
            !buttons.get(i * 3).getText().isEmpty()) {
            
            winningStatus = true;
            if (buttons.get(i * 3).getText().equals("X")) {
                Winner(i * 3, i * 3 + 1, i * 3 + 2, player1);
            } else {
                Winner(i * 3, i * 3 + 1, i * 3 + 2,player2);
            }
            return;
        }
    }
    
    // Check columns
    for (int i = 0; i < 3; i++) {
        if (buttons.get(i).getText().equals(buttons.get(i + 3).getText()) &&
            buttons.get(i).getText().equals(buttons.get(i + 6).getText()) &&
            !buttons.get(i).getText().isEmpty()) {
            
            winningStatus = true;
            if (buttons.get(i).getText().equals("X")) {
                Winner(i, i + 3, i + 6,player1);
            } else {
                Winner(i, i + 3, i + 6,player2);
            }
            return;
        }
    }
    
    // Check diagonals
    if (buttons.get(0).getText().equals(buttons.get(4).getText()) &&
        buttons.get(0).getText().equals(buttons.get(8).getText()) &&
        !buttons.get(0).getText().isEmpty()) {
        
        winningStatus = true;
        if (buttons.get(0).getText().equals("X")) {
            Winner(0, 4, 8,player1);
        } else {
            Winner(0, 4, 8,player2);
        }
        return;
    }
    
    if (buttons.get(2).getText().equals(buttons.get(4).getText()) &&
        buttons.get(2).getText().equals(buttons.get(6).getText()) &&
        !buttons.get(2).getText().isEmpty()) {
        
        winningStatus = true;
        if (buttons.get(2).getText().equals("X")) {
            Winner(2, 4, 6,player1);
        } else {
            Winner(2, 4, 6,player2);
        }
    }
    
    //Check for a draw
    boolean isDraw = true;
    for (int i = 0; i < 9; i++) {
        if (buttons.get(i).getText().isEmpty()) {
            isDraw = false;
            break;
        }
    }
    if (isDraw) {
        winningStatus = false;
        Winner(0,0,0,null);
    }
  }

  public void Winner(int a, int b,int c, String player){
    if(a == 0 && b == 0 && c == 0){
      for(JButton button : buttons){
        button.setBackground(Color.BLACK);
        System.out.println("The game ends in a draw");
      }
      System.out.println("The game ends in a draw");
      return;
    }
    int[][] winConditions = {
      {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, // Rows
      {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, // Columns
      {1, 5, 9}, {3, 5, 7}             // Diagonals
    };
    for(int[] x : winConditions){
      if(x[0] ==  a && x[1] == b && x[2] == c){
        buttons.get(a).setBackground(Color.GREEN);
        buttons.get(b).setBackground(Color.GREEN);
        buttons.get(c).setBackground(Color.GREEN);
        System.out.println(player + " wins");
      }
    }
  }

}