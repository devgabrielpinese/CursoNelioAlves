package secao17trabalhandoComArquivos.aula221e222Exercicio.file1;

public class PassosAPasso {
    /*crio a classe Product com seus
    atributos
    construtores
    get sets

    crio a classe Program
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> listProd = new ArrayList<>();

    peco o caminho do arquivo que vai ser lido
    crio uma variavel que recebe esse valor

    crio um objeto da classe Fiel e instacio ele do tipo File
    com a variavel que recebe o caminho digitado como argumento

    crio outra variavel que recebe esse objeto e utilizo o metodo getParent();

    importante
    sem instaciar o objeto nao conseguiria usar esse metodo e obter o caminho da pasta do arquivo digitado

    crio uma variavel boolean nela eu instacio
    um new File com caminho da pasta + \\out o nome da pasta que vou criar
    usando o mkdir()
    ficando
    boolean success = new File( caminhoPasta + "\\out ").mkdir()

    printo esse caminho da pasta obtido

    crio uma variavel nome do arquivo que recebe o caminho e concatena com a pasta criada + nomeArquivo
    ficando
    String nomeArquivo= caminhoPasta+ "\\out\\sumary.csv";

    faco um try catch para tratar as exceptions no catch IOException e printa mensagem erro padrao
    mando um BufferedReader br e instacio ele new BufferedReader
    com argumento FileReader com caminho digitado como argumento
    crio outra variavel itemLinha que recebe br.readline linha lida

    faco um loop
    enquanto linha lida for diferente de nulo faca

    crio um vetor campoItem que recebe itemLinha.split que transforma essa linha num vetor de posicoes
    definidas pela "," . esse split quebra a String toda em partes definidas pela virgula

    String name para posicao [0]campoItem
    double price = Double.parseDouble(campoItem[1]) isso forca a string como numero double
    pq inicialmente os valores lido em FileReader sao String
    int quantity = Integer.parseInt(campoItem  [2]) mesma coisa o int

    itemLinha = br.readLine();recebe a linha lida
    BufferedReader’s readLine() método lê uma linha de texto. Cada invocação do readLine()
    O método leria os bytes do arquivo, os converteria em caracteres e retornaria

    dentro do try do Reader no catch IOException e printa mensagem erro padrao
    mandamos um try catch

    e craimos um bw da classe BufferedWriter instanciamos ele no tipo BufferedWriter
    com FileWriter como argumento desse BufferedWriter
    e nomeArquivo como argumento desse FileWriter
    ficando
    BufferedWriter bw  = new BufferedWriter(FileWriter(nomeArquivo)){
    importante
    lembrando que o BufferedWriter e FileWriter sao para construir um arquivo
    e o BufferedReader e o FileReader sao para ler

    faco um foreach (Product item : listProd) //normal para percorrer a listProd

    bw.write grava dados no arquivo
    e usamos o como argumento (item.getName()+","+String.format("%.2f", item.total());
    vai grava esses dados no arquivos nesse item da lista

   um bw.newLine() pois ele nao cria sozinho

   printamos nomeArquivo +" created" so para confimar que criou o arquivo






     */
}
