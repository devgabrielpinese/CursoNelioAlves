package secao17trabalhandoComArquivos.aula221e222Exercicio.refazendoNovamente;

public class Passos {
    /*
    peco caminho do arquivo e guardo em um varialvel

    crio um onjeto tipo Fle para poder o getParent();
    e obter o caminho da pasta

    faco uma varialvel boolean e instacio um File ( com a caminho da pasta e o novo no \\out
    usa o metodo .mkdir();  Para isso

    faco uma verificacao na tela

    faco uma String para guaradr o nome e caminho do arquivo que vou criar

    faco um BufferedReader com FileReader para ler o arquivo que foi digitado

    uma varivel para guardar linha lida  br.readLine()

    um loop que para quando nao tiver mais linhas para sserem lidas

    destrincho a linha com .split() separo pelas "," e
    uso cada parte como um posicao de um vetor
    String[] campoDoItem= itemLinha.split(",");

    guardo os valores das posicoes em variaveis, algumas tenho que forcar
    com parseDouble ou parseInt

    adicono a lista de produtos e instanciando um new Produto na listProd
    normal

    o novamente leio a proxima linha
    itemLinha = br.readLine();

    dentro desse BufferedReader
    faco um BufferedWriter com um FileWriter usanso a varivel novoArquivo como argumento

    nesse momento é que vai cronstruir um novo arquivo

    faco uma foreach para para percorrer a listProd que novos adicionams os produtos
    foreach (Produto item : listProd)

    uso um bw.write()
    é isso que cria um novo arquivo

    uso como argumento o getName() do item da vez e o getTotal() conforme exercicio pediu

    saio do loop e printo o novoArquivo +" created"

    só para aparecer na tela que ocorreu tudo certo

    faco try catch tanto no BufferedReader quanto no BufferedWriter
    para tratar as exececoes




     */
}
