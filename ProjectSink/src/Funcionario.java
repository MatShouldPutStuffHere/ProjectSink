
import java.time.LocalDate;

public class Funcionario
{

	String cpfCnpj;
	String nomeFuncionario;
	String carteiraTrabaho;
	char sexo;
	LocalDate dataNascimento;
	
	/*construtor vazio*/
	public Funcionario()
	{
		cpfCnpj = "";
		nomeFuncionario = "";
		carteiraTrabaho = "";
		sexo = ' ';
		dataNascimento = null;
		
	}
	
	/*construtor*/
	public Funcionario(String cpfCnpj, String nomeFuncionario, String carteiraTrabaho, char sexo, LocalDate dataNascimento)
	{
		this.cpfCnpj = cpfCnpj;
		this.nomeFuncionario = nomeFuncionario;
		this.carteiraTrabaho = carteiraTrabaho;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	/*sets*/
	public void setCpfCnpj(String cpfCnpj)
	{
		this.cpfCnpj = cpfCnpj;
	}
	
	public void setNomeFuncionario(String nomeFuncionario)
	{
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public void setCarteiraTrabalho(String carteiraTrabaho)
	{
		this.carteiraTrabaho = carteiraTrabaho;
	}
	
	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	
	public void setDataNascimento(LocalDate dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	
	/*gets*/
	public String getCpfCnpj()
	{
		return this.cpfCnpj;
	}
	
	public String getNomeFuncionario()
	{
		return this.nomeFuncionario;
	}
	
	public String getCarteiraTrabalho()
	{
		return this.carteiraTrabaho;
	}
	
	public char getSexo()
	{
		return this.sexo;
	}
	
	public LocalDate getDateNascimento()
	{
		return this.dataNascimento;
	}
}
