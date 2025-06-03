import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Game {
    public static int questionType = -1;

    public Game() {
        Questions question = new Questions();

        // Create frame + attributes
        JFrame frame = new JFrame("Quiz Window");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // add question
        JLabel questions = new JLabel(question.getNewRandomQuestion());
        frame.add(questions);

        // add buttons
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        frame.add(buttonPanel);

        // Set Visible
        frame.setVisible(true);
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to run when Yes is clicked
                if (Count.count == 25) {
                    buttonPanel.remove(yesButton);
                    buttonPanel.remove(noButton);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                    // frame.remove(noButton);
                    questions.setText(Count.endPhrase());
                } else if (questionType == 0) {
                    Count.updateScore(1);
                    questions.setText(question.getNewRandomQuestion());
                }

                else if (questionType == 1) {
                    Count.updateScore(-1);
                    questions.setText(question.getNewRandomQuestion());
                }

            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to run when Yes is clicked
                if (Count.count == 25) {
                    buttonPanel.remove(yesButton);
                    buttonPanel.remove(noButton);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                    questions.setText(Count.endPhrase());
                }

                else if (questionType == 0) {
                    Count.updateScore(-1);
                    questions.setText(question.getNewRandomQuestion());
                }

                else if (questionType == 1) {
                    Count.updateScore(1);
                    questions.setText(question.getNewRandomQuestion());
                }

            }
        });

        // Old terminal system
        /*
         * System.out.println("'y' for yes, 'n' for no"); // Instructions
         * for (int i = 0; i < 25; i++) { // Ask questions
         * System.out.println(question.getNewRandomQuestion());
         * Scanner sc = new Scanner(System.in);
         * String answer = sc.nextLine();
         * 
         * if (questionType == 0) {
         * if (answer.equals("y")) // SWITCH TO BUTTON
         * {
         * Count.updateScore(1);
         * } else {
         * Count.updateScore(-1);
         * }
         * } else {
         * if (answer.equals("n")) { // SWITCH TO BUTTON
         * Count.updateScore(1);
         * } else {
         * Count.updateScore(-1);
         * }
         * }
         * 
         * System.out.println(Count.endPhrase());
         */

        /*
         * for (int i = 0; i < 25; i++) {
         * System.out.println(question.getNewRandomQuestion());
         * if (questionType == 0) {
         * 
         * }
         * 
         * }
         */
    }
}
