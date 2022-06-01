package grafica;

import javax.swing.JToggleButton;

public class BtnPeca extends JToggleButton{
    private int numero;
    public BtnPeca(int numero) {
        this.numero = numero;
        setSize(15, 15);
    }    

    public void mostrar() {
        setSelected(true);
        setText(Integer.toString(numero));
    }

    public void ocultar(){
        setSelected(false);
        setText("");
    }

    public int getNumero() {
        return numero;
    }
}
