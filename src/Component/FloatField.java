package Component;

import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class FloatField extends TextField {
    public FloatField(){
        super();
        this.setText("0");
        this.setTextFormatter(new TextFormatter<String>(
                s->{
            if (s.getControlNewText().isEmpty())
            return s;
            try {
                Float.parseFloat(s.getControlNewText());
                return s;
            } catch(NumberFormatException e){
                return null;
            }
        }
) ) ;
    }
}
