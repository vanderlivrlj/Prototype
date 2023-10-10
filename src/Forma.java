public class Forma implements Prototipo{

    private int y, x;
    private String nome, cor;
    private boolean ehOpaco;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEhOpaco() {
        return ehOpaco;
    }

    public void setEhOpaco(boolean ehOpaco) {
        this.ehOpaco = ehOpaco;
    }

    @Override
    public Prototipo getClone(){
        return null;
    }
}
