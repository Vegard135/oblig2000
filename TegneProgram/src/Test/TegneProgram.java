package Test;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import java.util.*;
import staticjava.lang.Integer.*;

public class TegneProgram extends Application {
    public void start (Stage vindu) throws Exception {

        FlowPane panel = new FlowPane();
        panel.setHgap(2);
        panel.setVgap(5);
        panel.setAlignment(Pos.CENTER);

        Scene scene = new Scene(panel, 300, 200);
        vindu.setTitle("Tegneprogram");
        vindu.setScene(scene);
        vindu.show();
    }

        public static void main(String[] args) {
            launch(args);
        }

    }

