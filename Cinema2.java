import java.util.Scanner;




public class Cinema {




    public static void main(String[] args) {




        boolean cont = true;

        int opc;

        int resp;

        int sal;

        int ingres;




        String fil, fil2, fil3, fil4, fil5;

        Scanner sc=new Scanner(System.in);




        do {

            System.out.println("***Menu de opções do Cinema Diretor=Ator**\n");

            System.out.println("1- Listar salas \n");

            System.out.println("2- Mostrar todos os filmes em exibição \n");

            System.out.println("3- Cadastrar novo filme (apenas funcionários)\n");

            System.out.println("4- Comprar ingressos\n");

            System.out.println("0- Sair do Menu\n");




            System.out.println("Digite a opção desejada:\n ");

           

            opc = sc.nextInt();




            if(opc==0){

                System.out.println("Programa encerrado.\n");

                cont=false;

           

            }

           

            if(opc==3){

             cont=false;

             System.out.println("Em qual sala quer colocar o filme? (1, 2 ou 3)\n");

              sal=sc.nextInt();

             if(sal>=1 && sal<=3){

                if(sal==1){

                   

                 System.out.println("Sala 1");

                 System.out.println("Qual filme quer colocar?");

                 fil=sc.nextLine();

                }

                if(sal==2){

                    System.out.println("Sala 2\n");

                 

                }

                if(sal==3){

                    System.out.println("Sala 3\n");

                   

                }

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                    resp= sc.nextInt();

                if(resp==1){

                    cont=true;

                }

                }else{

                    System.out.println("Sala inválida\n");

                }

                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");

                    resp= sc.nextInt();

                if(resp==1){

                    cont=true;

                }

            }

           

            if(opc==1){




                System.out.println("Sala 1\n");

                System.out.println("Sala 2\n");

                System.out.println("Sala 3\n");

               

                cont=false;




                System.out.println("Qual sala você deseja? Digite o número correspondente a sala.\n");




                resp= sc.nextInt();




                if(resp==1){




                    System.out.println("Bem vindo a Sala 1\n");

                    System.out.println("Estes são os filmes \n");

                    System.out.println("Filme: Gente Grande \n");

                    System.out.println("Filme: Click\n");

                    System.out.println("Filme: Como se fosse a primeira vez\n");




                    cont=false;




                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");




                    resp= sc.nextInt();




                if(resp==1){




                    cont=true;

                }

                }

                if(resp==2){




                    System.out.println("Bem vindo a Sala 2\n");

                    System.out.println("Estes são os filmes \n");

                    System.out.println("Filme:Segurança de shopping \n");

                    System.out.println("Filme:Cada um tem uma gêmea que merece \n");

                    System.out.println("Filme:Golpe baixo \n");




                    cont=false;




                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");




                    resp= sc.nextInt();




                if(resp==1){

                   

                    cont=true;

                }

                }

                if(resp==3){




                    System.out.println("Bem vindo a Sala 3\n");

                    System.out.println("Estes são os filmes\n");

                    System.out.println("Filme:O paizão\n");

                    System.out.println("Filme:Esposa de mentirinha \n");

                    System.out.println("Filme:Arremesando alto \n");

                    System.out.println("Filme:Um maluco no golfe \n");




                    cont=false;




                    System.out.println("Você deseja continuar?\n");

                    System.out.println("Digite 1 para continuar ou 2 para encerrar \n");




                    resp= sc.nextInt();




                if(resp==1){




                    cont=true;




                }

                }

            }

            if(opc==4){




                System.out.println("Em qual sala quer comprar o ingresso?\n");

            }

        }

        while(cont);

    }

}