
public class Llapis {
    private int color;
    private float gruix;

    public int getColor() {
        return color;
    }

    public float getGruix() {
        return gruix;
    }
    public Llapis(int a) {
        this.color = (int) (Math.random() * 7 + 1);
    }
    public Llapis() {
        this.color = (int) (Math.random() * 7 + 1);
        this.gruix = (float) (0.0f + Math.random() * 0.2f + 0.1f);
    }
}