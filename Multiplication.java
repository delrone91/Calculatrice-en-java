/**
 * Classe Multiplication.
 * Cette classe permet de réaliser une opération de multiplication entre deux objets de type Nombre.
 * Elle hérite de la classe abstraite Operation.
 */
public class Multiplication extends Operation {

    /**
     * Constructeur de la classe Multiplication.
     * Initialise les opérandes pour l'opération de multiplication.
     *
     * @param operande1 Premier nombre de l'opération de multiplication
     * @param operande2 Deuxième nombre de l'opération de multiplication
     */
    public Multiplication(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }

    /**
     * Méthode qui effectue la multiplication des deux opérandes.
     * Cette méthode retourne le produit de operande1 et operande2.
     *
     * @return Le résultat de la multiplication sous forme d'entier.
     */
    public int valeur() {
        return getOperande1().getVlrNbr() * getOperande2().getVlrNbr();
    }

    /**
     * Retourne une représentation en chaîne de caractères de l'opération de multiplication.
     * La méthode renvoie une chaîne sous la forme "operande1 * operande2".
     *
     * @return La chaîne représentant l'opération de multiplication.
     */
    public String toString() {
        return getOperande1().getVlrNbr() + " * " + getOperande2().getVlrNbr();
    }
}
