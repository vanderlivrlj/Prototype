public class Forma implements Prototipo{

    private Posicao pos;
    private String nome, cor;
    private boolean ehOpaco;

    public Forma(){
        this.pos = new Posicao();
    }

    public int getY() {
        return pos.getY();
    }

    public void setY(int y) {
        this.pos.setY(y);
    }

    public int getX() {
        return pos.getX();
    }

    public void setX(int x) {
        this.pos.setX(x);
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
        Forma clone = new Forma();

        clone.setCor(cor);
        clone.setNome(nome);

        //this.pos.setY(getY());

        Posicao posiscao = new Posicao();
        posiscao.setX(pos.getX());
        posiscao.setY(pos.getY());

        clone.pos = posiscao;

        return clone;
    }
}
