    import java.util.Scanner;

    class contaBancaria {
        public String nome;
        public String sobrenome;
        public String cpf;
        public double saldo;

        //criando o metodo construtor 
        public contaBancaria (String nome, String sobrenome, String cpf){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.saldo = 0;
        }

        //criando metodo para consultar o saldo 
        public double consultarSaldo(){
            return saldo;
        }

        // criando metodo para depositar na conta bancaria
        public void depositar(double valor){
            saldo +=valor;
            System.out.println("depósito de R$ + "+ valor +" Realizado com sucesso!");
        }

        // criando metado para sacar na conta bancaria
        public void sacar(double valor){
            if (saldo >= valor){
                saldo -= valor;
                System.out.println("Saque de R$ "+ valor+ "Realizado com sucesso!");
            } else {

                System.out.println("Saldo insuficiente!");
            }
        }
        //criando menu para o usuario
        public void exibirMenu(){
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n--------------Menu---------");
                System.out.println("\n 1- Consultar saldo");
                System.out.println("\n 2- Realizar deposito");
                System.out.println("\n 3- Realizar saque");
                System.out.println("\n 4- Encerrar");
                System.out.println("Qual opção você quer escolher: ");
                opcao = scanner.nextInt(); 

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: R$ "+consultarSaldo());
                        break;
                    case 2: 
                        System.out.println("Digite o valor do deposito: ");
                        double valorDeposito = scanner.nextDouble();
                        depositar(valorDeposito);
                        break;
                    case 3:
                        System.out.println("Digite o valor do Saque");
                        double valorSaque = scanner.nextDouble();
                        sacar(valorSaque);
                        break;
                    case 4:
                        System.out.println("Encerrando...");
                        break;
        
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }

            } while(opcao!=4);
            scanner.close();
        }
    }

    public class GerenciaBanco {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Seja bem-vindo ao nosso sistema Bancario");
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Digite seu cpf: ");
            String cpf = scanner.nextLine();

            contaBancaria conta = new contaBancaria(nome, sobrenome, cpf);
            conta.exibirMenu();
            System.out.println("obrigado por utilizar o nosso banco");
            scanner.close();
            
        }
        
    }
