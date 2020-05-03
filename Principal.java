package sms;

public class Principal {

	public static void main(String[] args) {
		EnvioSms sms1[] = new EnvioSms[10];
		sms1[0] = new EnvioSms("NTIC00YRHNR9M6JESU5RFIOI", 11941498889l, "Mensagem teste");
		sms1[0].envio();
	}

}
