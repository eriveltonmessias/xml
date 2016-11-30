/**
 * ServerServicosSMSBahiaPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package smsbahia.com.br.ServicosSMSBahia;

public interface ServerServicosSMSBahiaPortType extends java.rmi.Remote {

    /**
     * Metodo para envio de mensagem sms para um telefone <br><br>
     * 	<strong> Parametros de entrada: </strong><br><br>
     *      
     * @param string usuario Usuario de autentica&ccedil;&atilde;o<br>
     *      
     * @param string senha Senha de autentica&ccedil;&atilde;o<br>
     *      
     * @param string destinatario Numero do destinatario. Exemplo: 557187873344<br>
     * 
     * @param string idMensagem ID da mensagem - n&uacute;mero ou cadeia
     * de caracteres alfanum&eacute;ricos com at&eacute; 10 caracteres que
     * &eacute; gerado pelo usu&aacute;rio<br>
     *      
     * @param string mensagem Mensagem Texto ASCII com at&eacute; 145 caracteres<br>
     * 
     * @param string dataHorarioAgendamento Agendamento da Mensagem - no
     * formato ANSI: YYYY-MM-DD HH:MM:SS - caso exista necessidade de agendar
     * o envio<br><br>
     *  <strong>Parametros de saida:  </strong><br><br>
     *      
     * @return string  <br>OK - Mensagem aceita para transmiss&atilde;o<br>
     * NOK - Mensagem n&atilde;o aceita para transmiss&atilde;o<br> Erro<br>
     * NA (n&atilde;o dispon&iacute;vel) - Sistema n&atilde;o dispon&iacute;vel
     */
    public java.lang.String enviarTorpedo(java.lang.String usuario, java.lang.String senha, java.lang.String destinatario, java.lang.String idMensagem, java.lang.String mensagem, java.lang.String dataHorarioAgendamento) throws java.rmi.RemoteException;

    /**
     * enviarTorpedoPorLote - Metodo para envio de uma mensagem sms
     * para varios telefones celulares em lote <br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      
     * @method Replica uma mesma mensagem com as mesmas configura&ccedil;&otilde;es
     * de agendamento. Para v&aacute;rios destinat&aacute;rios.<br>
     *      
     * @param string usuario Usuario de autentica&ccedil;&atilde;o<br>
     *      
     * @param string senha Senha de autentica&ccedil;&atilde;o<br>
     *      
     * @param array destinatarios Array Destinatarios de id e numero do destinatario.
     * Exemplo: id = 01 e destinatario = 557187873344<br>
     *      
     * @param string mensagem Mensagem<br>
     *      
     * @param string dataHorarioAgendamento Agendamento da Mensagem. No formato
     * ANSI: YYYY-MM-DD HH:MM:SS<br><br>
     *  <strong>Parametros de saida:  </strong><br><br>
     *      
     * @return string <br><br>
     *      OK e Qtd. de mensagens do lote - Mensagem aceita para transmiss&atilde;o<br>
     * NOK - Mensagem n&atilde;o aceita para transmiss&atilde;o<br>
     *      Erro<br>
     *      NA (n&atilde;o dispon&iacute;vel) - Sistema n&atilde;o dispon&iacute;vel<br><br>
     * 
     *     Estrutura de <strong>Destinatarios</strong>: Array com os elementos
     * de destinatarios<br><br>
     *     [id] - string - id da mensagem<br>
     *     [destinatario] - string -  numero do destinatario<br>
     */
    public java.lang.String enviarTorpedoPorLote(java.lang.String usuario, java.lang.String senha, smsbahia.com.br.ServicosSMSBahia.Destinatarios[] destinatarios, java.lang.String mensagem, java.lang.String dataHorarioAgendamento) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo que envia diversas mensagens completamente distintas
     * (configura&ccedil;&otilde;es de agendamento, etc.) para v&aacute;rios
     * destinat&aacute;ros. <br><br>
     * 	<strong> Parametros de entrada: </strong><br><br>
     *         
     * @param string usuario <br>
     *         
     * @param string senha <br>
     *         
     * @param array $arrayListaMensagens Array que armazena os dados para
     * envio de v&aacute;rias mensagens com idMensagem, destinatario, mensagem
     * e dataHorarioAgendamento. <br><br>
     *      <strong>Estrutura do array arrayListaMensagens:  </strong><br><br>
     * * 
     * @param string idMensagem Codigo de identifica&ccedil;&atilde;o da
     * mensagem <br>
     *             * 
     * @param string destinatario Numero do destinatario. Exemplo: 557187873344
     * <br>            
     *             * 
     * @param string mensagem Mensagem <br>
     *             * 
     * @param string dataHorarioAgendamento Agendamento da Mensagem - formato
     * Data e hora yyyy-mm-dd hh:mm:ss <br><br>
     *             <strong>Parametros de saida:  </strong><br><br>
     *      return string<br><br>
     *      OK e Qtd. de mensagens do lote - Mensagem aceita para transmiss&atilde;o<br>
     * NOK - Mensagem n&atilde;o aceita para transmiss&atilde;o<br>
     *      Erro<br>
     *      NA (n&atilde;o dispon&iacute;vel) - Sistema n&atilde;o dispon&iacute;vel<br><br>
     */
    public java.lang.String enviarVariosTorpedos(java.lang.String usuario, java.lang.String senha, smsbahia.com.br.ServicosSMSBahia.ListaMensagens[] arrayListaMensagens) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo que envia diversas mensagens completamente distintas
     * (configura&ccedil;&otilde;es de agendamento, etc.) para v&aacute;rios
     * destinat&aacute;rios com XML. <br><br>
     * 	<strong> Parametros de entrada: </strong><br><br>
     *         
     * @param string usuario <br><br>
     *         
     * @param string senha <br><br> 
     *         
     * @param string XML que armazena os dados relativos cada mensagem a
     * ser enviada a um destinat&aacute;rio. <br><br>
     *      <strong>Estrutura da string XML:  </strong><br><br>
     *             <br>
     *             <strong>
     *             <pre>
     *             &lt;lote&gt;
     *                       &lt;sms&gt;
     *                             &lt;idMensagem&gt;1234&lt;/idMensagem&gt;
     * &lt;destinatario&gt;557181960000&lt;/destinatario&gt;
     *                             &lt;mensagem&gt;Teste NOVO WS 01 para
     * Claro&lt;/mensagem&gt; 
     *                             &lt;dataHorarioAgendamento&gt;2015-09-03
     * 18:15:00&lt;/dataHorarioAgendamento&gt;
     *                       &lt;/sms&gt;
     *                       &lt;sms&gt;
     *                              &lt;idMensagem&gt;1235&lt;/idMensagem&gt;
     * &lt;destinatario&gt;557192990000&lt;/destinatario&gt;
     *                             &lt;mensagem&gt;Teste NOVO WS 01 para
     * TIM&lt;/mensagem&gt;
     *                             &lt;dataHorarioAgendamento&gt;2015-09-03
     * 18:15:00&lt;/dataHorarioAgendamento&gt;
     *                       &lt;/sms&gt;
     *             &lt;/lote&gt;</pre></strong><br>
     *             <br><br>
     *             idMensagem - Codigo de identifica&ccedil;&atilde;o da
     * mensagem <br>
     *             destinatario - Numero do celular do destinatario. Exemplo:
     * 557187873344 <br>            
     *             mensagem - texto da Mensagem <br>
     *             dataHorarioAgendamento - Agendamento da Mensagem - formato
     * Data e hora yyyy-mm-dd hh:mm:ss <br><br>
     *             <strong>Parametros de saida:  </strong><br><br>
     *      return string<br><br>
     *      OK e Qtd. de mensagens do lote - Mensagem aceita para transmiss&atilde;o<br>
     * NOK - Mensagem n&atilde;o aceita para transmiss&atilde;o<br>
     *      Erro<br>
     *      NA (n&atilde;o dispon&iacute;vel) - Sistema n&atilde;o dispon&iacute;vel<br><br>
     */
    public java.lang.String enviarVariosTorpedosXML(java.lang.String usuario, java.lang.String senha, java.lang.String strXML) throws java.rmi.RemoteException;

    /**
     * Metodo para consultar saldo de sms do cliente - Verifica os
     * cr&eacute;ditos de um Usu&aacute;rio Pr&eacute;-Pago.  <br><br>
     *  <strong>Parametros de entrada: </strong><br><br>
     *  
     * @param string usuario <br>
     *  
     * @param string senha <br><br>
     *  <strong>Parametros de saida:  </strong> <br><br>
     *  
     * @return string - Retorna o n&uacute;mero de cr&eacute;ditos ou -1
     * se o Usu&aacute;rio n&atilde;o for do tipo Pr&eacute;-Pago ou -2 em
     * caso de erro nos par&acirc;metros de usuario ou senha. <br>
     */
    public java.lang.String consultarSaldo(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException;

    /**
     * cancelarAgendamentoMensagemPorIds - Metodo Possibilita cancelar
     * agendamento de envio de SMS por ID. <br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      
     * @param string usuario Usu&aacute;rio<br>
     *      
     * @param string senha Senha<br>
     *      
     * @param string dataHorarioAgendamento Agendamento da Mensagem - no
     * formato ANSI: YYYY-MM-DD HH:MM:SS <br>
     *      
     * @param string idMensagem ID da mensagem - n&uacute;mero ou cadeia
     * de caracteres alfanum&eacute;ricos com at&eacute; 10 caracteres que
     * &eacute; gerado pelo usu&aacute;rio <br><br>
     *  <strong>Parametros de saida:  </strong><br><br>
     *      
     * @return string Retorna OK ou NOK. <br><br>
     */
    public java.lang.String cancelarAgendamentoMensagemPorId(java.lang.String usuario, java.lang.String senha, java.lang.String dataHorarioAgendamento, java.lang.String idMensagem) throws java.rmi.RemoteException;

    /**
     * obterSituacaoMensagemPorId - Metodo Verifica o status de entrega
     * de mensagens enviadas previamente. <br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      
     * @param string $usuario Usu&aacute;rio<br>
     *      
     * @param string $senha Senha<br>
     *      
     * @param string $idMensagem ID da mensagem - n&uacute;mero ou cadeia
     * de caracteres alfanum&eacute;ricos com at&eacute; 10 caracteres que
     * &eacute; gerado pelo usu&aacute;rio <br>
     *  <strong>Parametros de saida:  </strong><br><br>
     *      return 
     * @return array RespostaStatusSMS <br><br>
     *                           RespostaStatusSMS[&quot;resultado&quot;]
     * - string - Descri&ccedil;&atilde;o do resultado da opera&ccedil;&atilde;o<br>
     * RespostaStatusSMS[&quot;status&quot;] - array - Array de Status da
     * mensagem - SMSStatusResult <br><br>
     * 
     *                           Estrutura de <strong>SMSStatusResult</strong>:
     * Array com os elementos mos<br><br>
     *                           [idMensagem] - string - Id da mensagem<br>
     * 
     *                           [celular] - string - N&uacute;mero do celular<br>
     * [mensagem] - string - Texto da mensagem<br>
     *                           [status] - string - Status da mensagem<br>
     * 
     *                           [dataRecebimento] - string - Data de recebimento
     * da mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00
     * <br>
     *                           [dataEnvio] - string - Data de envio da
     * mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * [dataStatus] - string - Data do status no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * 						  [operadora] - string - Nome da operadora do celular<br>
     */
    public smsbahia.com.br.ServicosSMSBahia.RespostaStatusSMS obterSituacaoMensagemPorId(java.lang.String usuario, java.lang.String senha, java.lang.String idMensagem) throws java.rmi.RemoteException;

    /**
     * obterSituacaoMensagemNaoLida - Metodo Verifica o status de
     * entrega de mensagens enviadas previamente e nao lido. Retorna array
     * contendo a tabela StatusSMS com no m&aacute;ximo 400 linhas, contendo
     * somente os status de SMS dos &uacute;ltimos 4 dias que ainda n&atilde;o
     * tenham sido lidos, e os MARCA COMO LIDOS. Se houverem 400 linhas na
     * tabela, podem haver mais status n&atilde;o lidos, e estes devem ser
     * lidos usando chamadas subsequentes &agrave; fun&ccedil;&atilde;o.
     * Retorna Nothing em caso de erro.<br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      
     * @param string $usuario Usu&aacute;rio<br>
     *      
     * @param string $senha Senha<br>
     *  <strong>Parametros de saida:  </strong><br><br>
     *      return 
     * @return array RespostaStatusSMS <br><br>
     *                           RespostaStatusSMS[&quot;resultado&quot;]
     * - string - Descri&ccedil;&atilde;o do resultado da opera&ccedil;&atilde;o<br>
     * RespostaStatusSMS[&quot;status&quot;] - array - Array de Status da
     * mensagem - SMSStatusResult <br><br>
     * 
     *                           Estrutura de <strong>SMSStatusResult</strong>:
     * Array com os elementos mos<br><br>
     *                           [idMensagem] - string - Id da mensagem<br>
     * 
     *                           [celular] - string - N&uacute;mero do celular<br>
     * [mensagem] - string - Texto da mensagem<br>
     *                           [status] - string - Status da mensagem<br>
     * 
     *                           [dataRecebimento] - string - Data de recebimento
     * da mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00
     * <br>
     *                           [dataEnvio] - string - Data de envio da
     * mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * [dataStatus] - string - Data do status no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * 						  [operadora] - string - Nome da operadora do celular<br>
     */
    public smsbahia.com.br.ServicosSMSBahia.RespostaStatusSMS obterSituacaoMensagemNaoLida(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException;

    /**
     * mensagemRecebidaPorPeriodo - Metodo Verifica MOs recebidos
     * em determinado per&iacute;odo (lidos e n&atilde;o lidos). <br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      * 
     * @param string $usuario Usu&aacute;rio<br>
     *      * 
     * @param string $senha Senha<br>
     *      * 
     * @param string $dataInicio In&iacute;cio do Per&iacute;odo - formato:
     * aaaa-mm-dd hh:mm:ss<br>
     *      * 
     * @param string $dataFim  Fim do Per&iacute;odo - formato: aaaa-mm-dd
     * hh:mm:ss<br>
     *      * 
     * @return array RespostaBuscaMO<br><br>
     *      
     *  <strong>Parametros de saida:  </strong><br><br>
     *      return 
     * @return array RespostaBuscaMO <br><br>
     *                           RespostaBuscaMO[&quot;resultado&quot;] -
     * string - Descri&ccedil;&atilde;o do resultado da opera&ccedil;&atilde;o<br>
     * RespostaBuscaMO[&quot;mos&quot;] - array - Array de MOs - MOResult
     * <br><br>
     * 
     *                           Estrutura de <strong>MOResult</strong>:
     * Array com os elementos mos<br><br>
     *                           [idMensagem] - string - N&uacute;mero que
     * originou o MO<br>                          
     *                           [celular] - string - N&uacute;mero que originou
     * o MO<br>
     *                           [mensagem] - string - Texto da mensagem<br>
     * [status] - string - Status da mensagem<br>                       
     * 
     *                           [dataRecebimento] - string - Data de recebimento
     * da mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00
     * <br>
     *                           [dataEnvio] - string - Data de envio da
     * mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * [dataStatus] - string - Data do status no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * 			  [operadora] - string - Nome da operadora do numero que originou
     * o MO<br>
     */
    public smsbahia.com.br.ServicosSMSBahia.RespostaBuscaMO mensagemRecebidaPorPeriodo(java.lang.String usuario, java.lang.String senha, java.lang.String dataInicio, java.lang.String dataFim) throws java.rmi.RemoteException;

    /**
     * mensagemRecebidaNaoLida - Metodo Verifica MOs recebidos - nao
     * lidos.  <br><br>
     * 	<strong>Parametros de entrada: </strong><br><br>
     *      * 
     * @param string $usuario Usu&aacute;rio<br>
     *      * 
     * @param string $senha Senha<br>
     *      * 
     * @return array RespostaSMSMO - Array com Tabela chamada SMSMO com no
     * m&aacute;ximo 400 linhas, com as mensagens SMS MO n&atilde;o lidas,
     * recebidas nos &uacute;ltimos 4 dias como resposta a SMS enviados anteriormente,
     * e marca esses MOs COMO LIDOS. Se houverem 400 linhas na tabela, podem
     * haver mais MOs n&atilde;o lidos, e estes devem ser lidos usando chamadas
     * subsequentes &agrave; fun&ccedil;&atilde;o.<br><br>
     *      
     *  <strong>Parametros de saida:  </strong><br><br>
     *      return 
     * @return array RespostaSMSMO <br><br>
     *                           RespostaSMSMO[&quot;resultado&quot;] - string
     * - Descri&ccedil;&atilde;o do resultado da opera&ccedil;&atilde;o<br>
     * RespostaSMSMO[&quot;mos&quot;] - array - Array de MOs - MOResult <br><br>
     * 
     *                           Estrutura de <strong>MOResult</strong>:
     * Array com os elementos mos<br><br>
     *                           [idMensagem] - string - N&uacute;mero que
     * originou o MO<br>                          
     *                           [celular] - string - N&uacute;mero que originou
     * o MO<br>
     *                           [mensagem] - string - Texto da mensagem<br>
     * [status] - string - Status da mensagem<br>                       
     * 
     *                           [dataRecebimento] - string - Data de recebimento
     * da mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00
     * <br>
     *                           [dataEnvio] - string - Data de envio da
     * mensagem no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * [dataStatus] - string - Data do status no formato ISO 8601. Ex: 2015-08-17T17:20:48.65-03:00<br>
     * 			  [operadora] - string - Nome da operadora do numero que originou
     * o MO<br>
     */
    public smsbahia.com.br.ServicosSMSBahia.RespostaSMSMO mensagemRecebidaNaoLida(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException;
}
