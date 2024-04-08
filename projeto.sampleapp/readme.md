## Introdução
- Este projeto de automação de testes foi desenvolvido para testar as funcionalidades de preenchimento de dados e envio de cotação do site SampleApp Tricentis. O objetivo é garantir que as diferentes etapas do processo funcionem corretamente, ajudando a identificar e corrigir possíveis problemas de forma automatizada.

## Tecnologias Utilizadas
- Cucumber: Framework de automação de testes que facilita a escrita de testes em linguagem natural.
- Selenium: Ferramenta de automação de navegador web que permite interagir com elementos da página.
- WebDriver Manager: Biblioteca que facilita a configuração e gerenciamento dos drivers dos navegadores.
- JUnit: Framework de testes para a execução dos testes automatizados.
- Padrão Page Objects: Padrão de design utilizado para organizar e manter os elementos da página separados do código de teste.

## Configuração do Ambiente
Antes de executar os testes, é necessário configurar o ambiente de desenvolvimento. Certifique-se de ter instalado:

- Java Development Kit (JDK): Versão compatível com o projeto.
- Maven: Ferramenta de gerenciamento de dependências para compilar e executar o projeto.
- Git: Sistema de controle de versão para clonar e gerenciar o código-fonte.
- Além disso, é necessário configurar as variáveis de ambiente:

- JAVA_HOME: Aponte para o diretório onde o JDK está instalado.
- MAVEN_HOME: Aponte para o diretório onde o Maven está instalado.
- PATH: Inclua os diretórios binários do JDK e do Maven.

## Estrutura do Projeto
Nesta estrutura, os diretórios estão organizados de acordo com os diferentes aspectos do projeto:

- driver: Contém a classe Drivers.java, responsável por configurar e gerenciar os drivers dos navegadores.
- elementos: Contém a classe Elementos.java, onde são definidos os elementos da página.
- metodos: Contém a classe Metodos.java, onde são definidos os métodos de interação com os elementos da página.
- navegadores: Contém a classe Navegadores.java, onde são definidos os métodos para manipular os navegadores.
- page: Contém as classes de Page Objects, cada uma representando uma página do site.
- runner: Contém a classe Executa.java, responsável por executar os testes.
- steps: Contém a classe automobileTest.java, onde são definidos os passos de teste utilizando o Cucumber.
- features: Diretório contendo os arquivos .feature, onde os cenários de teste são definidos em linguagem Gherkin.

## Execução dos Testes
Para executar os testes automatizados, siga estes passos:

- Clone o repositório do projeto: git clone 
- Navegue até o diretório do projeto: cd projeto-sampleapp
- Execute os testes utilizando o Maven: mvn test
Os resultados dos testes serão exibidos no console e também estarão disponíveis em relatórios HTML no diretório target/cucumber-reports.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novos recursos.

Autor: Gabriel Soares 112022

Data: 07/04/2024

