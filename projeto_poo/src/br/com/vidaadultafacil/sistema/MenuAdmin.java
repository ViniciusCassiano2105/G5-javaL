package br.com.vidaadultafacil.sistema;

import java.util.Scanner;
import java.util.logging.Logger;

import br.com.aula_poo.utils.Util;
import br.com.vidaadultafacil.io.Relatorio;

public class MenuAdmin {
    private static Logger logger = Logger.getLogger(Util.class.getName());
    
    public void menu(){
        Scanner sc = new Scanner(System.in);
        int escolha;
        
        System.out.println("\t|:: MENU DO ADMINISTRADOR ::|");
        logger.info("[1] - Visualizar relatório geral.");
        logger.info("[2] - Sair");
        escolha = sc.nextInt();

        while (escolha!=2) {
            switch (escolha) {
                case 1:
                    //Relatorio.relatorioAdmin('P');
                break;

                case 2:
                    logger.info("Saindo...");
                break;

                default:
                    logger.info("Opção inválida! Por favor, tente novamente.");
                break;
            }
        }
    }
}
