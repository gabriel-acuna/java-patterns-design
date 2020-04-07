package patrones_comportamiento.iterator;

public class IteradorGuia  implements IIterador{

    private GuiaTelefonica guia;
    private int index;

    public IteradorGuia( GuiaTelefonica guia) {
        this.guia = guia;
    }
    public String next(){
        return this.guia.getNumeros().get(index++);
    }

    public boolean hasNext(){
        return index < guia.getNumeros().size()
        && this.guia.getNumeros().get(index) != null;

    }

}