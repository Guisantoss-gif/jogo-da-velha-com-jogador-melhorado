class JogadorVirtual{ System.out.println("Jogador 2 (" + this.jogador2.getSimbolo() + ")");
            do {
                linha = random.nextInt(0, 3);
                coluna = random.nextInt(0, 3);
            } while (!this.tabuleiro.jogar(this.jogador2.getSimbolo(), linha, coluna));

            partida++;
        }
}; 
