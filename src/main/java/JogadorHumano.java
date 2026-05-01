class JogadorHumano{  System.out.println("Jogador 1 (" + this.jogador1.getSimbolo() + ")");
            do {
                System.out.print("Linha (0-2): ");
                linha = sc.nextInt();
                System.out.print("Coluna (0-2): ");
                coluna = sc.nextInt();
            } while (!this.tabuleiro.jogar(this.jogador1.getSimbolo(), linha, coluna));

            if (this.tabuleiro.acabouOJogo()) {
                break;
            }
};
