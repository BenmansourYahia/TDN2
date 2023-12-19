package exercice3;

public class Main {
    public static void main(String[] args) {
        Livre l1 = new Livre();
        Livre l2 = new Livre("crime and punishment");
        Livre l3 = new Livre("crime and punishment","dostoevsky");
        Livre l4 = new Livre("crime and punishment", "dostoevsky", 100);
        Livre l5 = new Livre("crime and punishment", "dostoevsky", 100, 1886);
        Livre l6 = new Livre(l5);
        System.out.println(l6);


}}
