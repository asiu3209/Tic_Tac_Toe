import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToe extends JFrame implements ActionListener { 
  private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
  private JPanel panel;
  private String player1,player2;
  private int player_turn;
  public boolean winningStatus;
  private int count = 0;
  private String winnings;


   public TicTacToe(String p1,String p2){
     this.player1 = p1;
     this.player2 = p2;
     winningStatus = false;
    panel = new JPanel(); 
    panel = new JPanel(new GridLayout(3,3));
    btn1 = new JButton(); btn2 = new JButton(); btn3 = new JButton();
    btn4 = new JButton(); btn5 = new JButton(); btn6 = new JButton();
    btn7 = new JButton(); btn8 = new JButton(); btn9 = new JButton();
    panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4); panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8); panel.add(btn9);
    setTitle("Tic-Tac-Toe");
    add(panel);
    addActionListeners();
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public TicTacToe(){
    player1 = "Player 1";
    player2 = "Player 2";
    winningStatus = false;
    panel = new JPanel(); 
    panel = new JPanel(new GridLayout(3,3));
    btn1 = new JButton(); btn2 = new JButton(); btn3 = new JButton();
    btn4 = new JButton(); btn5 = new JButton(); btn6 = new JButton();
    btn7 = new JButton(); btn8 = new JButton(); btn9 = new JButton();
    panel.add(btn1); panel.add(btn2); panel.add(btn3); panel.add(btn4); panel.add(btn5); panel.add(btn6); panel.add(btn7); panel.add(btn8); panel.add(btn9); 
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
       if (player1.equals("")){
        return "Player 1";
       }
       else{
         return player1;
       }
     }
     else{
       player_turn = 2;
       if (player2.equals("")){
         return "Player 2";
       }
      }
      return player2;
    }

  private void addActionListeners(){
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
  }
  public void actionPerformed( ActionEvent test){
    if (test.getSource() == btn1){
      if (player_turn == 1){
        if(btn1.getText() == ""){
          btn1.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn1.setForeground(new Color(255, 0, 0));
          btn1.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn1.getText() == ""){
            btn1.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn1.setForeground(new Color(0, 0, 255));
            btn1.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn2){
      if (player_turn == 1){
        if(btn2.getText() == ""){
          btn2.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn2.setForeground(new Color(255, 0, 0));
          btn2.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn2.getText() == ""){
            btn2.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn2.setForeground(new Color(0, 0, 255));
            btn2.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn3){
      if (player_turn == 1){
        if(btn3.getText() == ""){
          btn3.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn3.setForeground(new Color(255, 0, 0));
          btn3.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn3.getText() == ""){
            btn3.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn3.setForeground(new Color(0, 0, 255));
            btn3.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn4){
      if (player_turn == 1){
        if(btn4.getText() == ""){
          btn4.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn4.setForeground(new Color(255, 0, 0));
          btn4.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn4.getText() == ""){
            btn4.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn4.setForeground(new Color(0, 0, 255));
            btn4.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn5){
      if (player_turn == 1){
        if(btn5.getText() == ""){
          btn5.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn5.setForeground(new Color(255, 0, 0));
          btn5.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn5.getText() == ""){
            btn5.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn5.setForeground(new Color(0, 0, 255));
            btn5.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn6){
      if (player_turn == 1){
        if(btn6.getText() == ""){
          btn6.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn6.setForeground(new Color(255, 0, 0));
          btn6.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn6.getText() == ""){
            btn6.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn6.setForeground(new Color(0, 0, 255));
            btn6.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn7){
      if (player_turn == 1){
        if(btn7.getText() == ""){
          btn7.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn7.setForeground(new Color(255, 0, 0));
          btn7.setText("X");
          player_turn = 2;
          count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn7.getText() == ""){
            btn7.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn7.setForeground(new Color(0, 0, 255));
            btn7.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn8){
      if (player_turn == 1){
        if(btn8.getText() == ""){
          btn8.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn8.setForeground(new Color(255, 0, 0));
          btn8.setText("X");
          player_turn = 2;
         count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn8.getText() == ""){
            btn8.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn8.setForeground(new Color(0, 0, 255));
            btn8.setText("O");
            player_turn = 1;
           count = count + 1;
            checkMatch();
          }
        }
      }
    }
    if (test.getSource() == btn9){
      if (player_turn == 1){
        if(btn9.getText() == ""){
          btn9.setFont(new Font("Ink Free", Font.BOLD, 120));
          btn9.setForeground(new Color(255, 0, 0));
          btn9.setText("X");
          player_turn = 2;
         count = count + 1;
          checkMatch();
        }
      }
      else{
        if (player_turn == 2){
          if (btn9.getText() == ""){
            btn9.setFont(new Font("Ink Free", Font.BOLD, 100));
            btn9.setForeground(new Color(0, 0, 255));
            btn9.setText("O");
            player_turn = 1;
            count = count + 1;
            checkMatch();
          }
        }
      }
    }
  }
  
public void checkMatch(){
  if (btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X"){
    winningStatus = true;
    xWinner(1,2,3);
  }
  else if (btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X"){
    winningStatus = true;
    xWinner(4,5,6);
  }
  else if (btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X"){
    winningStatus = true;
    xWinner(7,8,9);
  }
  else if (btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X"){
    winningStatus = true;
    xWinner(1,4,7);
  }
  else if (btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X"){
    winningStatus = true;
    xWinner(2,5,8);
  }
  else if (btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X"){
    winningStatus = true;
    xWinner(3,6,9);
  }
  else if (btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X"){
    winningStatus = true;
    xWinner(1,5,9);
  }
  else if (btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X"){
    winningStatus = true;
    xWinner(3,5,7);
  }
  else if (btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O"){
    winningStatus = true;
    oWinner(1,2,3);
  }
  else if (btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O"){
    winningStatus = true;
    oWinner(4,5,6);
  }
  else if (btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O"){
    winningStatus = true;
    oWinner(7,8,9);
  }
  else if (btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O"){
    winningStatus = true;
    oWinner(1,4,7);
  }
  else if (btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O"){
    winningStatus = true;
    oWinner(2,5,8);
  }
  else if (btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O"){
    winningStatus = true;
    oWinner(3,6,9);
  }
  else if (btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O"){
    winningStatus = true;
    oWinner(1,5,9);
  }
  else if (btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O"){
    winningStatus = true;
    oWinner(3,5,7);
  }
  else if (count == 9){
    winningStatus = false;
    oWinner(0,0,0);
  }

}  

  public void xWinner(int a,int b, int c){
    if (a == 1 && b == 2 && c == 3){
     btn1.setBackground(Color.GREEN); 
     btn2.setBackground(Color.GREEN);
     btn3.setBackground(Color.GREEN);
    }
    else if (a == 4 && b == 5 && c == 6){
     btn4.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn6.setBackground(Color.GREEN);
    }
    else if (a == 7 && b == 8 && c == 9){
     btn7.setBackground(Color.GREEN); 
     btn8.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
    }
    else if (a == 1 && b == 4 && c == 7){
     btn1.setBackground(Color.GREEN); 
     btn4.setBackground(Color.GREEN);
     btn7.setBackground(Color.GREEN);
    }
    else if (a == 2 && b == 5 && c == 8){
     btn2.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn8.setBackground(Color.GREEN);
    }
    else if (a == 3 && b == 6 && c == 9){
     btn3.setBackground(Color.GREEN); 
     btn6.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
    }
    else if (a == 1 && b == 5 && c == 9){
     btn1.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
    }
    else if (a == 3 && b == 5 && c == 7){
     btn3.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn7.setBackground(Color.GREEN);
    }
    
    System.out.println(player1 + " wins");
  }

  public void oWinner(int a, int b,int c){
    if (a == 1 && b == 2 && c == 3){
     btn1.setBackground(Color.GREEN); 
     btn2.setBackground(Color.GREEN);
     btn3.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 4 && b == 5 && c == 6){
     btn4.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn6.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 7 && b == 8 && c == 9){
     btn7.setBackground(Color.GREEN); 
     btn8.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 1 && b == 4 && c == 7){
     btn1.setBackground(Color.GREEN); 
     btn4.setBackground(Color.GREEN);
     btn7.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 2 && b == 5 && c == 8){
     btn2.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn8.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 3 && b == 6 && c == 9){
     btn3.setBackground(Color.GREEN); 
     btn6.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 1 && b == 5 && c == 9){
     btn1.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn9.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a == 3 && b == 5 && c == 7){
     btn3.setBackground(Color.GREEN); 
     btn5.setBackground(Color.GREEN);
     btn7.setBackground(Color.GREEN);
     System.out.println(player2 + " wins");
    }
    else if (a== 0 && b == 0 && c == 0){
      btn1.setBackground(Color.BLACK);
      btn2.setBackground(Color.BLACK);
      btn3.setBackground(Color.BLACK);
      btn4.setBackground(Color.BLACK);
      btn5.setBackground(Color.BLACK);
      btn6.setBackground(Color.BLACK);
      btn7.setBackground(Color.BLACK);
      btn8.setBackground(Color.BLACK);
      btn9.setBackground(Color.BLACK);
      System.out.println("Both Players Tie");

    }

  }

  public void keepGoing(){
    while (winningStatus != true){
      System.out.print("\nKeep Playing");
    }
  }


}