package lab05.AimsProject.screen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import lab05.AimsProject.Cart;
import lab05.AimsProject.exception.PlayerException;
import lab05.AimsProject.media.*;

public class MediaStore extends JPanel {
    // Attribute
    private Media media;
    private static Cart cart;

    // Constructor
    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        ButtonListener buttonListener = new ButtonListener(media);
        JButton addButton = new JButton("Add to cart");
        container.add(addButton);
        addButton.addActionListener(buttonListener);

        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            container.add(playButton);
            playButton.addActionListener(buttonListener);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    // Getter and Setter


    public static Cart getCart() {
        return cart;
    }

    public static void setCart(Cart cart) {
        MediaStore.cart = cart;
    }

    // Button Listener for Add to Cart and Play
    private class ButtonListener implements ActionListener {
        // Attribute
        private Media media;

        // Constructor
        public ButtonListener(Media media) {
            super();
            this.media = media;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add to cart")) {
                try {
                    cart.addMedia(media);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            } else if (media instanceof Disc disc) {
                try {
                    disc.play();
                } catch (PlayerException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
