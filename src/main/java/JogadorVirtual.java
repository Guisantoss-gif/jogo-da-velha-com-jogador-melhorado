

class JogadorVirtual{
private int linha; 
private int coluna;             
 public int getlinha(){
return this.linha;
             
 }
            public int getcoluna(){ 
                        return this.coluna; 
            }
            
            
            public void executar (){System.out.println("Jogador 2 (" + this.jogador2.getSimbolo() + ")");
            do {
               this.linha = random.nextInt(0, 3);
                this.coluna = random.nextInt(0, 3);
            } while (!this.tabuleiro.jogar(this.jogador2.getSimbolo(), linha, coluna));

            partida++;
        }
}



} ; 
