
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;



public class TestaConexao {
	
	public static void main(String args[]) throws SQLException {
		
		ContatoDAO contatoDao = new ContatoDAO();
		List<Contato> contatos = contatoDao.consultaTodosContatos();
		
		Contato contatoIncluir = new Contato();
		contatoIncluir.setNome("Carolin");
		contatoIncluir.setEmail("carol@carol.com");
		contatoIncluir.setEndereco("meu endereço, 1, Brasil");
		contatoIncluir.setDataNascimento(Calendar.getInstance());
		contatoDao.adiciona(contatoIncluir);
	
		for(Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de nasc: " + contato.getDataNascimento().getTime() + "\n");
		}
		
		Contato contatoAlterar = new Contato();
		contatoAlterar.setNome("Nicoli");
		contatoAlterar.setEmail("nicoli@nica.com");
		contatoAlterar.setEndereco("Rua Alumia, 56");
		contatoAlterar.setId(1L);
		contatoAlterar.setDataNascimento(Calendar.getInstance());
		contatoDao.altera(contatoAlterar);
		
	}

}
