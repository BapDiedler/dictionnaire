package element;

public class Expression {
    private String eleFrancais;
    private String eleAnglais;

    /**
     * constructeur de la classe Expression qui fait la relation entre un mot francais et anglais
     * @param eleFrancais le mot en francais
     * @param eleAnglais le mot en anglais
     */
    public Expression(String eleFrancais, String eleAnglais){
        this.eleFrancais = eleFrancais;
        this.eleAnglais = eleAnglais;
    }

    /**
     * constructeur qui construit un mot sans sa traduction
     * @param eleFrancais mot que l'on ajoute
     */
    public Expression(String eleFrancais){
        this(eleFrancais,null);
    }

    /**
     * setter sur le mot en francais
     * @param eleFrancais le mot que l'on donne
     */
    public void setFrancais(String eleFrancais){
        this.eleFrancais = eleFrancais;
    }

    /**
     * setter sur le mot en anglais
     * @param eleAnglais le mot que l'on donne
     */
    public void setAnglais(String eleAnglais){
        this.eleAnglais = eleAnglais;
    }

    /**
     * getter sur le mot francais
     * @return le mot francais
     */
    public String getFrancais(){
        return eleFrancais;
    }

    /**
     * getter sur le mot anglais
     * @return le mot anglais
     */
    public String getAnglais(){
        return eleAnglais;
    }

    /**
     * methode toString de la classe
     * @return l'affichage de la classe
     */
    public String toString(){
        return eleFrancais + " -> " + eleAnglais;
    }
}
