import javax.swing.*;

public class Window extends JFrame {

    Window(){
        this.add( new Game() );
        this.setTitle( "Snake" );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        this.setResizable( false );
        this.pack();
        this.setVisible( true );
        this.setLocationRelativeTo( null );


    }
}
