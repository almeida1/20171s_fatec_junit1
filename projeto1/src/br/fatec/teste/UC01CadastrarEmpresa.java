package br.fatec.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.fatec.modelo.Empresa;

public class UC01CadastrarEmpresa {
	public static Empresa empresa;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa = new Empresa();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	/*
	 * verifica a validação dos dados com sucesso
	 */
	@Test
	public void CT01UC01FBvalida_os_dados_com_sucesso() {
		try {
			empresa.setCnpj("78666151000170");
			empresa.setNomeDaEmpresa("Open informatica Ltda");
			empresa.setNomeFantasia("Open informatica");
			empresa.setEndereco("Av. Aguia de Haia 1783");
			empresa.setTelefone("12121212");
		} catch (Exception e) {
			fail("dados invalidos");
		}
	}
	/*
	 * verifica a validação dos dados para cnpj invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT02UC01A3cnpj_invalido() {
			empresa.setCnpj("");
	}

	/*
	 * verifica a validação dos dados para nome de empresa invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT03UC01A3nome_da_empresa_invalido() {
			empresa.setNomeDaEmpresa("");
	}
	/*
	 * verifica a validação dos dados para nome fantasia invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT04UC01A3nome_fantasia_invalido() {
			empresa.setNomeFantasia("");
	}
	/*
	 * verifica a validação dos dados para endereco invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT05UC01A3endereco_invalido() {
			empresa.setEndereco("");
	}
	
	/*
	 * verifica a validação dos dados para telefone invalido
	 */
	@Test(expected=IllegalArgumentException.class)
	public void CT05UC01A3telefone_invalido() {
			empresa.setTelefone("");
	}
	/*
	 * verifica a validação dos dados para telefone invalido
	 */
	@Test
	public void CT06UC01A3telefone_invalido() {
		try{
			empresa.setTelefone("");
		}catch (IllegalArgumentException e){
			assertEquals("Telefone inválido!",e.getMessage());
		}
	}
}


