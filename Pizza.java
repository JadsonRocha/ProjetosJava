
package trabalhojadson;


public class Pizza {

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    private float Valor;
    
    private String nomeTamanho;

    public String getNomeTamanho() {
        return nomeTamanho;
    }

    public void setNomeTamanho(String nomeTamanho) {
        this.nomeTamanho = nomeTamanho;
    }
    private int sabor;

    public String getNomeSabor() {
        return NomeSabor;
    }

    public void setNomeSabor(String NomeSabor) {
        this.NomeSabor = NomeSabor;
    }
    private String NomeSabor;
    private int tamanho;

    public boolean isMassa() {
        return massa;
    }

    public void setMassa(boolean massa) {
        this.massa = massa;
    }

    public boolean isBordaChocolate() {
        return bordaChocolate;
    }

    public void setBordaChocolate(boolean bordaChocolate) {
        this.bordaChocolate = bordaChocolate;
    }

    public boolean isBordaCheddar() {
        return bordaCheddar;
    }

    public void setBordaCheddar(boolean bordaCheddar) {
        this.bordaCheddar = bordaCheddar;
    }

    public boolean isOutro() {
        return outro;
    }

    public void setOutro(boolean outro) {
        this.outro = outro;
    }

    public boolean isObservacoes() {
        return observacoes;
    }

    public void setObservacoes(boolean observacoes) {
        this.observacoes = observacoes;
    }
    private boolean massa;
    private boolean bordaChocolate;
    private boolean bordaCheddar;
    private boolean outro;
    private boolean observacoes;

    public int getSabor() {
        return sabor;
    }

    public void setSabor(int sabor) {
        this.sabor = sabor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public float calculaValor()
    {
        float valor=0;
        
        switch(sabor){
            case 0: valor+= 20; break;
            case 1: valor+= 30; break;
            case 2: valor+= 40; break;
            case 3: valor+= 50; break;
            case 4: valor+= 60; break;
        }
        switch(tamanho){
            case 0: valor+= 35; break;
            case 1: valor+= 45; break;
            case 2: valor+= 55; break;
            
        }
        if(this.isMassa()==true){
            valor+=15;
        }
        if(this.isBordaChocolate()==true){
            valor+=25;
        }
        if(this.isBordaCheddar()==true){
            valor+=35;
        }
        if(this.isOutro()==true){
            valor+=10;
        }
        
        Valor = valor;
        return valor; 
    }

    
}
