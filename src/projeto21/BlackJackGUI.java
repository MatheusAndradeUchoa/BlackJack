package projeto21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackJackGUI extends JFrame {

  private Container contentPane;
  private JPanel buttonPanel = new JPanel();
  private JButton playButton = new JButton(" Jogar ");
  private JButton hitButton = new JButton(" Pedir carta ");
  private JButton standButton = new JButton("Parar");
  private JPanel outputPanel = new JPanel();
  private JTextArea playerArea = new JTextArea();
  private JTextArea dealerArea = new JTextArea();

  //Construct the frame

  public BlackJackGUI()
  {
    contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    outputPanel.setLayout(new BorderLayout());
    setSize(new Dimension(600, 400));
    setTitle("BlackJack");

    contentPane.add(buttonPanel,  BorderLayout.SOUTH);
    buttonPanel.add(playButton, null);
    buttonPanel.add(hitButton, null);
    buttonPanel.add(standButton, null);
    contentPane.add(outputPanel, BorderLayout.CENTER);
    outputPanel.setLayout(new FlowLayout());
    outputPanel.add(playerArea, null);
    outputPanel.add(dealerArea, null);
    hitButton.setEnabled(false);
    standButton.setEnabled(false);
    playerArea.setText("  ");
    dealerArea.setText("  ");
    int width = getWidth();
    int height = getHeight();
    playerArea.setPreferredSize(new Dimension(width/2-20,height));
    dealerArea.setPreferredSize(new Dimension(width/2-20,height));
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void setPlayAction(ActionListener listener){
    playButton.addActionListener(listener);
  }

  public void setHitAction(ActionListener listener){
    hitButton.addActionListener(listener);
  }

  public void setStandAction(ActionListener listener){
    standButton.addActionListener(listener);
  }

  public void displayPlayer(Hand hand){
    playerArea.setText("Player:\n"+hand.valueOf()+"\n"+hand);
  }

  public void displayDealer(Hand hand){
    dealerArea.setText("Dealer:\n"+hand.valueOf()+"\n"+hand);
  }

  public void displayDealerCard(Card card){
    dealerArea.setText("Player 2:\n"+card);
  }

  public void displayOutcome(String outcome){
    playerArea.setText(playerArea.getText()+"\n\n"+outcome);
  }

  public void enableHitAndStandButtons(){
    playButton.setEnabled(false);
    hitButton.setEnabled(true);
    standButton.setEnabled(true);
  }

  public void enablePlayButton(){
    playButton.setEnabled(true);
    hitButton.setEnabled(false);
    standButton.setEnabled(false);
  }

  static void main(String[] args) {
	  new BlackJackGUI();
     }
		

}