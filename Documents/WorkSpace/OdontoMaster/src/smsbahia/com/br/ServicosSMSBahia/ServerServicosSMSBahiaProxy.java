package smsbahia.com.br.ServicosSMSBahia;

import java.rmi.RemoteException;

public class ServerServicosSMSBahiaProxy implements ServerServicosSMSBahiaPortType {
	private String _endpoint = null;
	private smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaPortType PortType = null;

	public ServerServicosSMSBahiaProxy() {
		_initServerServicosSMSBahiaProxy();
	}

	public ServerServicosSMSBahiaProxy(String endpoint) {
		_endpoint = endpoint;
		_initServerServicosSMSBahiaProxy();
	}

	private void _initServerServicosSMSBahiaProxy() {

		try {
			PortType = (new smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaLocator())
					.getServerServicosSMSBahiaPort();
			if (PortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) PortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");

			}
		} catch (javax.xml.rpc.ServiceException serviceException) {
		}

	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (PortType != null)
			((javax.xml.rpc.Stub) PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
	}

	public smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaPortType getPortType() {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType;
	}

	@Override
	public String enviarTorpedo(String usuario, String senha, String destinatario, String idMensagem, String mensagem,
			String dataHorarioAgendamento) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.enviarTorpedo(usuario, senha, destinatario, idMensagem, mensagem, dataHorarioAgendamento);

	}

	@Override
	public String enviarTorpedoPorLote(String usuario, String senha, Destinatarios[] destinatarios, String mensagem,
			String dataHorarioAgendamento) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.enviarTorpedoPorLote(usuario, senha, destinatarios, mensagem, dataHorarioAgendamento);
	}

	@Override
	public String enviarVariosTorpedos(String usuario, String senha, ListaMensagens[] arrayListaMensagens)
			throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.enviarVariosTorpedos(usuario, senha, arrayListaMensagens);
	}

	@Override
	public String enviarVariosTorpedosXML(String usuario, String senha, String strXML) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.enviarVariosTorpedosXML(usuario, senha, strXML);
	}

	@Override
	public String consultarSaldo(String usuario, String senha) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.consultarSaldo(usuario, senha);
	}

	@Override
	public String cancelarAgendamentoMensagemPorId(String usuario, String senha, String dataHorarioAgendamento,
			String idMensagem) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.cancelarAgendamentoMensagemPorId(usuario, senha, dataHorarioAgendamento, idMensagem);
	}

	@Override
	public RespostaStatusSMS obterSituacaoMensagemPorId(String usuario, String senha, String idMensagem)
			throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.obterSituacaoMensagemPorId(usuario, senha, idMensagem);
	}

	@Override
	public RespostaStatusSMS obterSituacaoMensagemNaoLida(String usuario, String senha) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.obterSituacaoMensagemNaoLida(usuario, senha);
	}

	@Override
	public RespostaBuscaMO mensagemRecebidaPorPeriodo(String usuario, String senha, String dataInicio, String dataFim)
			throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.mensagemRecebidaPorPeriodo(usuario, senha, dataInicio, dataFim);
	}

	@Override
	public RespostaSMSMO mensagemRecebidaNaoLida(String usuario, String senha) throws RemoteException {
		if (PortType == null)
			_initServerServicosSMSBahiaProxy();
		return PortType.mensagemRecebidaNaoLida(usuario, senha);
	}

}
