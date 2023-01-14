package element;

import java.util.ArrayList;
import java.util.Arrays;

public class Phrase {
    ArrayList<Expression> expressions;

    /**
     * constructeur de la classe Phrase
     * @param expressions ensemble d'expressions qui compose la phrase
     */
    public Phrase(Expression... expressions){
        this.expressions = new ArrayList<>(expressions.length);
        this.expressions.addAll(Arrays.asList(expressions));
    }

    /**
     * methide qui ajoute une expression à la phrase
     * @param expression expression que l'on ajoute
     */
    public void ajouter(Expression expression){
        expressions.add(expression);
    }

    /**
     * méthode qui donne l'élément à l'indice index
     * @param index indice de l'élément
     * @return l'expression à l'indice index
     */
    public Expression get(int index){
        return expressions.get(index);
    }

    /**
     * methode toString de la classe
     * @return l'affichage de la phrase
     */
    public String toString(){
        return String.valueOf(expressions.stream().sorted());
    }
}
