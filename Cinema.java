import java.util.Scanner;


 

public class Cinema {


 

    public static void main(String[] args) {


 

        boolean cont = true;

        int opc;

        int resp;

        int sal;

        String sal1 = null, sal2 = null, sal3 = null;

        Scanner sc = new Scanner(System.in);


 

        do {

            System.out.println("***Menu de opções do Cinema POP**\n");

            System.out.println("1- Listar salas \n");

            System.out.println("2- Mostrar todos os filmes em exibição \n");

            System.out.println("3- Cadastrar novo filme (apenas funcionários)\n");

            System.out.println("4- Comprar ingressos\n");

            System.out.println("5- Comprar no Snackbar\n");

            System.out.println("0- Sair do Menu\n");


 

            System.out.println("Digite a opção desejada:\n ");


 

            opc = sc.nextInt();


 

            if (opc == 0) {

                System.out.println("Programa encerrado.\n");

            }

            if (opc == 3) {

                System.out.println("Em qual sala quer colocar o filme? (1, 2 ou 3)\n");

                sal = sc.nextInt();

                if (sal >= 1 && sal <= 3) {

                    if (sal == 1) {


 

                        System.out.println("Sala 1\n");

                        for (int i = 4; i < 5; i++) {

                            System.out.println("Qual filme quer colocar?\n");

                            sal1 = sc.next();

                        }

                    }

                    if (sal == 2) {

                        System.out.println("Sala 2\n");

                        for (int i = 4; i < 5; i++) {

                            System.out.println("Qual filme quer colocar?\n");

                            sal2 = sc.next();

                        }

                    }

                    if (sal == 3) {

                        System.out.println("Sala 3\n");

                        for (int i = 4; i < 5; i++) {

                            System.out.println("Qual filme quer colocar?\n");

                            sal3 = sc.next();

                        }

                    }

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                    resp = sc.nextInt();

                     if (resp == 1) {

                    }

                } else {

                    System.out.println("Sala inválida\n");

                }

                System.out.println("Você deseja continuar?\n");

                System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                resp = sc.nextInt();

                if (resp == 1) {

                }

            }
            if (opc == 1) {

                System.out.println("Sala 1\n");

                System.out.println("Sala 2\n");

                System.out.println("Sala 3\n");

                System.out.println("Qual sala você deseja? Digite o número correspondente a sala.\n");

                resp = sc.nextInt();

                if (resp == 1) {

                    System.out.println("Bem vindo a Sala 1\n");

                    System.out.println("Estes são os filmes \n");

                    System.out.println("Filme: Gente Grande \n");

                    System.out.println("Filme: Click\n");

                    System.out.println("Filme: Como se fosse a primeira vez\n");

                    System.out.println("Filme:" + sal1 + "\n");

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                    resp = sc.nextInt();

                    if (resp == 1) {
                    }

                }

                if (resp == 2) {

                    System.out.println("Bem vindo a Sala 2\n");

                    System.out.println("Estes são os filmes \n");

                    System.out.println("Filme:Segurança de shopping \n");

                    System.out.println("Filme:Cada um tem uma gêmea que merece \n");

                    System.out.println("Filme:Golpe baixo \n");

                    System.out.println("Filme:" + sal2 + "\n");

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                    resp = sc.nextInt();

                    if (resp == 1) {
                    }

                }

                if (resp == 3) {


 

                    System.out.println("Bem vindo a Sala 3\n");

                    System.out.println("Estes são os filmes\n");

                    System.out.println("Filme:O paizão\n");

                    System.out.println("Filme:Esposa de mentirinha \n");

                    System.out.println("Filme:Arremesando alto \n");

                    System.out.println("Filme:Um maluco no golfe \n");

                    System.out.println("Filme:" + sal3 + "\n");


 

                  


 

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");


 

                    resp = sc.nextInt();


 

                    if (resp == 1) {


 

                


 

                    }

                }

            }

            if (opc == 4) {

                cont = false;


 

                System.out.println("Deseja comprar quantos ingresso?\n");

                int ingres = sc.nextInt();


 

                System.out.println("Em qual sala quer comprar? (1, 2 ou 3)");

                int salo=sc.nextInt();

               

                if(ingres<100||salo==1){

                    System.out.println("Parabéns pela compra");

                }if(ingres<80||salo==2){

                    System.out.println("Parabéns pela compra");

                }if(ingres<120||salo==3){

                    System.out.println("Parabéns pela compra");

                }else{

                    System.out.println("Não há salas o suficiente");

                }

            double totalCompra = 0;


 

            if (opc == 5) {

                System.out.println("Agora escolha algo para comer no CINEMA POP\n");


 

                System.out.println("1 - Pipoca (R$12.00)\n");


 

                System.out.println("2 - Coca Cola (R$7,00)\n");


 

                System.out.println("3 - M&M (R$6,00)\n");


 

                System.out.println("4 - Bala Fini (R$3,00)\n");


 

                System.out.println("5 - Finalizar Compra\n");


 

                System.out.println("Digite o número do produto desejado:\n");

                int produto = sc.nextInt();



 

                if (produto == 5) {

                    break;

                }


 

                System.out.println("digite quantos vai querer:\n");

                int quantidade = sc.nextInt();


 

                double valorProduto;


 

                switch (produto) {


 

                    case 1 -> valorProduto = 12.0;


 

                    case 2 -> valorProduto = 7.0;


 

                    case 3 -> valorProduto = 6.0;


 

                    case 4 -> valorProduto = 3.0;


 

                    default -> {
                        System.out.println("esse produto nao existe!!! \n");

                        continue;
                        }


 

                }


 

                double valorDoItem = valorProduto * quantidade;


 

                totalCompra += valorDoItem;


 

                System.out.println("valor do item: R$" + valorProduto + "\n");


 

                System.out.println(" valor total da compra: R$" + totalCompra + "\n");


 

                System.out.println();


 

            }


 

            if(opc==2){

                System.out.println("bem vindo ao cinema pop\n");

                System.out.println("esses sao os filmes em exibiçao\n");

                System.out.println("Filme: Gente Grande\n");

                System.out.println("Filme: Click\n");

                System.out.println("Filme: Cmo se fosse a primeira vez\n");

                System.out.println("Filme: Segurança de shopping\n");

                System.out.println("Filme: Cada um tem a gêmea que merece\n");

                System.out.println("Filme: Golpe baixo\n");

                System.out.println("Filme: O paizão\n");

                System.out.println("Filme: Esposa de mentirinha\n");

                System.out.println("Filme: Arremesando alto\n");

                System.out.println("Filme: Um maluco no golfe\n");

                System.out.println("Filme: +sal1+ \n");

                System.out.println("Filme: +sal2+ \n");

                System.out.println("Filme: +sal3+ \n");

               

                cont=false;

                System.out.println("");

                System.out.println("deseja continuar");

                System.out.println("digite 1 pra continuar ou 2 para encerrar");
                resp=sc.nextInt();
                if(resp==1){
                    cont=true;
                }
            }double troco = 0;
            if (totalCompra < 49.0) {
             troco = 50.0 - totalCompra;
            } else if (totalCompra > 50.0 && totalCompra < 200.0) {
                troco = 200.0 - totalCompra;
            } else if (totalCompra > 200.0) {
                System.out.println("Você tá cheio da grana bigode 😉\n");
                return;
            }
            System.out.println("Troco: R$" + troco + "\n");
            System.out.println("Obrigado pela compra! é noisa\n");

       

}
 
}
while(cont);
}
}

