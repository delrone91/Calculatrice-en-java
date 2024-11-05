/**
	* <p> <h1> Cette class sert a diviser deux nombre </h1>
	* Elle doit toujours calculer sauf par <b> zero </b> et 
    * retourner ce qu'on lui donne en paramètre
	*
    * @see La classe Operation permet de récupérer les valeurs des operandes 
	* @author CHERRY Delrone
    * @version Java SE 11
    * @since 20 / 05 / 2024
	*/

public class Division extends Operation {

    /**
        * Seule constructeur. (Pour l'invocation par sous-classe 
        * constructeurs, généralement implicite.)
    */
    public Division(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
    }

    /**
        * <p>
        * Cette méthode renvoie toujours immédiatement 
        * le résultat de la division
        * sauf si le une operande est égale a zero
        *
        * @return      Le résultat de la division
        * @exception ArithmeticException Ne divisez pas un nombre par zéro
    */

    public int valeur() {
        try {
            return getOperande1().getVlrNbr() / getOperande2().getVlrNbr();
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Ne divisez pas un nombre par zéro");
            return 0;
        }
    }

    /**
        * Affiche la forme du calcul de la division.
    */

    public String toString() {
        return getOperande1().getVlrNbr() + " / " + getOperande2().getVlrNbr();
    }
}
