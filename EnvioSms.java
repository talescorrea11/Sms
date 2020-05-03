package sms;

import java.io.IOException;
import java.net.http.HttpResponse;

public class EnvioSms {
	private String chave;
	private String endereco = "https://api.smsdev.com.br/send?";
	private long celular;
	private String mensagem;
	private int type = 9;
	
	public EnvioSms(String chave, long celular, String mensagem) {
		this.setChave(chave);
		this.setCelular(celular);
		this.setMensagem(mensagem);
	}
	
	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String envio() {
		try {
			HttpResponse<String> response = Unirest.get(endereco+
				"key="+this.getChave()+
				"&type="+this.getType()+
				"&number="+this.getCelular()+
				"&msg="+this.getMensagem()).asString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
}
