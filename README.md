# O que é?

Este é um exemplo de **confiuração inicial para um projeto JSF 2.3 com CDI 2.0 e Tomcat**, este último não é um container Java EE
completo como o JBoss ou mesmo o TomcatEE, e por isso um simples Hello World com JSF 2.3, pode não ser (infelizmente) uma tarefa
simplória. E como a versão 2.3 é razoavelmente nova, e o JSF não é mais tão popular assim nestes últimos tempos, um tutorial 
que ensine a confirguração mais básica para rodar esta última versão no framework no Tomcat não é algo fácil de encontrar 
por enquanto.

## Quais as ferramentas utilizadas?
 *Eclipse Oxygen.2
 *Tomcat 8.5.24
 *JSF 2.3
 *CDI 2.0 (Weld Servlet 2.4.5)
 *Maven
 
 Por ser um este um projeto Maven, acredito que quem quiser usar o Netbeans não terá muitos problemas.
 
 ## Este projeto é apeans um Hello World?
 Sim. Ele é basicamente um Hello World, o objetivo é apenas servir de referência para as configurações inicais do JSF 2.3
 rodando no Tomcat. O projeto também faz um breve teste de algumas funcionalidades novas desta versão do 2.3 do JSF, como
 a injeção de depência de alguns artefatos como o FaceContext, o que não era possível na versão 2.2, e o suporte para a 
 Interface Map em componentes como DataTable e UIRepeat.
 
 
