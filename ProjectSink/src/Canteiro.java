
import java.util.ArrayList;

/**
 *
 * @author 720333
 */
public class Canteiro
{
    Obra obra;
    String endereco;
    int codigoCanteiro;
    
    public Canteiro()
    {
        obra = null;
        endereco = "";
        codigoCanteiro = 0;
    }
    
    public Canteiro(int codigoObra, Planta planta, ArrayList<Funcionario> listaFuncionario, String endereco, int codigoCanteiro)
    {
        this.obra = new Obra(codigoObra, planta, listaFuncionario);
        this.endereco = endereco;
        this.codigoCanteiro = codigoCanteiro;
    }
    
    
    public void setObra(Obra obra)
    {
        this.obra = obra;
    }
    
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    
    public void setCodigoCanteiro(int codigoCanteiro)
    {
        this.codigoCanteiro = codigoCanteiro;
    }
    
    /*---------------------------------------------------*/
    
    public Obra getObra( )
    {
        return obra;
    }
    
    public String getEndereco( )
    {
        return endereco;
    }
    
    public int getCodigoCanteiro( )
    {
        return codigoCanteiro;
    }
}
