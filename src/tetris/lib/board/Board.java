/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetris.lib.board;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import tetris.lib.blocks.Block;
import tetris.lib.blocks.BlockMatrix;
import tetris.lib.blocks.Empty;
//import tetris.lib.definitions.ChosenColor;
import tetris.lib.pieces.Piece;
import tetris.lib.pieces.PieceI;
import tetris.lib.pieces.PieceJ;
import tetris.lib.pieces.PieceL;
import tetris.lib.pieces.PieceO;
import tetris.lib.pieces.PieceS;
import tetris.lib.pieces.PieceT;
import tetris.lib.pieces.PieceZ;

/**
 *
 * @author vital
 */
public class Board extends BlockMatrix {

    /**
     * Peça que está no tabuleiro e a dificuldade do jogo.
     *
     */
    protected Piece current;
    private Difficulty level;

//    ChosenColor colors;
//    public Color colorPieceI;
//    public Color colorPieceJ;
//    public Color colorPieceL;
//    public Color colorPieceO;
//    public Color colorPieceZ;
//    public Color colorPieceS;
//    public Color colorPieceT;

    /**
     * Constructor
     *
     * @param mat matriz de blocos
     * @param current peça que está no tabuleiro
     */
    public Board(Block[][] mat, Piece current) {
        super(mat);
        this.current = current.getClone() //new Piece(current)
                ;

    }

    public Board() {
        this(20, 10);
    }

    /**
     * Construtor cópia.
     *
     * @param board board
     */
    public Board(Board board) {
        this(board.matrix, board.current);
    }

    /**
     * Constructor with dimensions<br>
     * build a board with 2d board of empty pieces
     *
     * @param lines number of lines
     * @param columns number of columns
     */
    public Board(int lines, int columns) {
        resize(lines, columns);
    }

    /**
     * Constructor with dimensions<br>
     * Construtor com dimensões Constrói o tabuleiro de peças vazias
     *
     * @param lines número de linhas
     * @param columns número de colunas
     * @param level dificuldade do jogo
     */
//    public Board(int lines, int columns,Difficulty level ) {
//        //construir a matriz de blocos
//        this.matrix = new Block[lines][columns];
//        //preencher a matriz com blocos vazios
//        for (int y = 0; y < lines; y++) {
//            for (int x = 0; x < columns; x++) {
//                matrix[y][x] = new Empty();
//            }
//        }
//        this.level = level;
//      generatePiece();
//    }
    public void resize(int lines, int columns) {
        this.matrix = new Block[lines][columns];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                matrix[y][x] = new Empty();
            }
        }
        generatePiece();
    }

    public void generatePiece() {
        Random rnd = new Random();
        //cria a peça sependendo do número aleatórioF
        switch (rnd.nextInt(7)) {
            case 0:
//                if (colors.getIColor() == null) {
                    this.current = new PieceI();
//                } else {
//                    this.current = new PieceI(colors.getIColor());
//                }
                break;
            case 1:
//                if (colors.getJColor() == null) {
                    this.current = new PieceJ();
//                } else {
//                    this.current = new PieceJ(colors.getJColor());
//                }
                break;
            case 2:
//                if (colors.getLColor() == null) {
                    this.current = new PieceL();
//                } else {
//                    this.current = new PieceL(colors.getLColor());
//                }
                break;
            case 3:
//                if (colors.getOColor() == null) {
                    this.current = new PieceO();
//                } else {
//                    this.current = new PieceO(colors.getOColor());
//                }
                break;
            case 4:
//                if (colors.getSColor() == null) {
                    this.current = new PieceS();
//                } else {
//                    this.current = new PieceS(colors.getSColor());
//                }
                break;
            case 5:
//                if (colors.getTColor() == null) {
                    this.current = new PieceT();
//                } else {
//                    this.current = new PieceT(colors.getTColor());
//                }
                break;
            case 6:
//                if (colors.getZColor() == null) {
                    this.current = new PieceZ();
//                } else {
//                    this.current = new PieceZ(colors.getZColor());
//                }
                break;
            default:
//                if (colors.getZColor() == null) {
                    this.current = new PieceZ();
//                } else {
//                    this.current = new PieceZ(colors.getZColor());
//                }
        }
        this.current.setColumn(getColumns() / 2 - current.getColumns() / 2);
        //top of the board
        this.current.setLine(0);
        repaint();
    }

//    public void generatePiece() {
//        //verififica se o nível escolhdio pelo jogado foi o nível "EASY"
//        if (this.level == Difficulty.EASY) {
//            //Gerar número aleatório entre 1 (inclusivo) e 100(inclusivo)
//            Random r = new Random();
//            int low = 1;
//            int high = 101;
//            //Número aleatório
//            int result = r.nextInt(high - low) + low;
//            //Se o número aleatório estiver no intervalo [1,20], cria uma peça I
//            if (result >= 1 && result <= 20) {
//                this.current = new PieceI();
//            } //Se o número aleatório estiver no intervalo [21,34], cria uma peça L
//            else if (result >= 21 && result <= 34) {
//                this.current = new PieceL();
//            } //Se o número aleatório estiver no intervalo [35,48], cria uma peça J
//            else if (result >= 35 && result <= 48) {
//                this.current = new PieceJ();
//            } //Se o número aleatório estiver no intervalo [49,66], cria uma peça O
//            else if (result >= 49 && result <= 66) {
//                this.current = new PieceO();
//            } //Se o número aleatório estiver no intervalo [67,80], cria uma peça T
//            else if (result >= 67 && result <= 80) {
//                this.current = new PieceT();
//            } //Se o número aleatório estiver no intervalo [81, 90], cria uma peça Z
//            else if (result >= 81 && result <= 90) {
//                this.current = new PieceZ();
//            } //Se o número aleatório estiver no intervalo [91,100], cria uma peça S
//            else if (result >= 91 && result <= 100) {
//                this.current = new PieceS();
//            } //Se houver algum problema ao gerar o número aleatório e ele for menor que 0 ou maior que 100, vai ser criada a peça I
//            else {
//                this.current = new PieceI();
//            }
//        }
//
//        //verififica se o nível escolhdio pelo jogado foi o nível "NORMAL"
//        if (this.level == Difficulty.NORMAL) {
//            //gerador de números aleatórios
//            Random rnd = new Random();
//            //cria a peça sependendo do número aleatórioF
//            switch (rnd.nextInt(7)) {
//                case 0:
//                    this.current = new PieceI();
//                    break;
//                case 1:
//                    this.current = new PieceJ();
//                    break;
//                case 2:
//                    this.current = new PieceL();
//                    break;
//                case 3:
//                    this.current = new PieceO();
//                    break;
//                case 4:
//                    this.current = new PieceS();
//                    break;
//                case 5:
//                    this.current = new PieceT();
//                    break;
//                case 6:
//                    this.current = new PieceZ();
//                    break;
//                default:
//                    this.current = new PieceZ();
//            }
//
//        }
//        //verififica se o nível escolhdio pelo jogado foi o nível "DIFFICULT"
//        if (this.level == Difficulty.DIFFICULT) {
//            //Gerar número aleatório entre 1 (inclusivo) e 100(inclusivo)
//            Random r = new Random();
//            int low = 1;
//            int high = 101;
//            //Número aleatório
//            int result = r.nextInt(high - low) + low;
//            //Se o número aleatório estiver no intervalo [1,8], cria uma peça I
//            if (result >= 1 && result <= 8) {
//                this.current = new PieceI();
//            } //Se o número aleatório estiver no intervalo [8,20], cria uma peça L
//            else if (result >= 9 && result <= 20) {
//                this.current = new PieceL();
//            } //Se o número aleatório estiver no intervalo [20,32], cria uma peça J
//            else if (result >= 21 && result <= 32) {
//                this.current = new PieceJ();
//            } //Se o número aleatório estiver no intervalo [33,42], cria uma peça O
//            else if (result >= 33 && result <= 42) {
//                this.current = new PieceO();
//            } //Se o número aleatório estiver no intervalo [43,56], cria uma peça T
//            else if (result >= 43 && result <= 56) {
//                this.current = new PieceT();
//            } //Se o número aleatório estiver no intervalo [56, 78], cria uma peça Z
//            else if (result >= 56 && result <= 78) {
//                this.current = new PieceZ();
//            } //Se o número aleatório estiver no intervalo [79,100], cria uma peça S
//            else if (result >= 79 && result <= 100) {
//                this.current = new PieceS();
//            } //Se houver algum problema ao gerar o número aleatório e ele for menor que 0 ou maior que 100, vai ser criada a peça S
//            else {
//                this.current = new PieceS();
//            }
//        }
//    }
    /**
     * Fixar a peça currente no tabuleiro      
     */
    public void freezePiece() {

        //iterar os blocos da peça current
        for (int y = 0; y < current.getLines(); y++) {
            for (int x = 0; x < current.getColumns(); x++) {
                //verificar se é vazio
                if (current.getMatrix()[y][x] instanceof Empty) {
                    continue;
                }
                //colocar um clone da peça na matriz
                matrix[current.getLine() + y][current.getColumn() + x]
                        = current.getMatrix()[y][x].getClone();

            }
        }
        repaint();

    }

    @Override
    public String toString() {
        Board clone = new Board(this);
        clone.freezePiece();
        String txt = "";
        for (int y = 0; y < clone.matrix.length; y++) {
            for (int x = 0; x < clone.matrix[y].length; x++) {
                txt += clone.matrix[y][x];
            }
            txt += "\n";
        }
        return txt;
    }

    /**
     * Mover a peça para a esquerda
     */
    public void moveLeft() {
        if (canMovePiece(-1, 0)) {
            this.current.moveLeft();
            repaint();
        }
    }

    /**
     * Mover a peça para a direita
     */
    public void moveRight() {
        if (canMovePiece(1, 0)) {
            this.current.moveRight();
            repaint();
        }
    }

    /**
     * Mover a peça para baixo
     */
    public void moveDown() {
        if (canMovePiece(0, 1)) {
            this.current.moveDown();
            repaint();
        } else {
            freezePiece();
            generatePiece();
        }
    }

    /**
     * Fazer a peça ir caindo
     */
    public void fallDown() {
        while (canMovePiece(0, 1)) {
            this.current.moveDown();
        }
        freezePiece();
        generatePiece();
    }

    /**
     * Rodar a peça
     */
    @Override
    public void rotate() {
        if (canRotatePiece()) {
            this.current.rotate();
            repaint();
        }
    }

    /**
     * Verificar se a peça currente se pode mover
     *
     * @param dx posição da peça em x
     * @param dy posição da peça em y
     * @return
     */
    public boolean canMovePiece(int dx, int dy) {
        Piece p = current.getClone();

        //Mover o clone para o sitio
        p.setLine(p.getLine() + dy);
        p.setColumn(p.getColumn() + dx);

        //Se a coluna da piece + o meu comprimento for >= que a maior coluna e estiver a ir para a direita
        if (p.getColumn() + (p.getPieceWidth() - 1) >= matrix[0].length) {
            return false;
        }

        //Se a coluna da piece for < que 0 e estiver a ir para a esquerda
        if (p.getColumn() < 0) {
            return false;
        }

        //Se a linha da piece + a sua altura for >= que a última linha e estiver a ir para baixo
        if (p.getLine() + (p.getPieceHeight() - 1) >= matrix.length) {
            return false;
        }
        //correr uma funçao igual ao freezepiece que verifica no sitio onde vai colocar se está empty ou não, e só verificar isso se o quadrado da piece não for empty
        for (int y = 0; y < current.getLines(); y++) {
            for (int x = 0; x < current.getColumns(); x++) {
                Block block = current.getMatrix()[y][x];

                if (block instanceof Empty) {
                    continue;
                }
                if (!(matrix[p.getLine() + y][p.getColumn() + x] instanceof Empty)) {
                    return false;
                }

            }
        }

        return true;
    }

    /**
     *
     * Verificar se a peça currente pode rodar
     *
     * @return
     */
    public boolean canRotatePiece() {
        //clone da piece
        Piece p = current.getClone();

        //rodar a peça
        p.rotate();

        Piece aux = current;
        current = p;
        //verificar se a peça pode rodar 
        boolean result = canMovePiece(0, 0);
        current = aux;
        return result;
    }

    //encapsular
    public Piece getCurrent() {
        return current;
    }

    public void setCurrent(Piece current) {
        this.current = current;
    }

    @Override
    public void paintComponent(Graphics g) {
        draw(g, 0, 0, getWidth(), getHeight(), true);
    }

    @Override
    public void draw(Graphics gr, int px, int py, int width, int height,
            boolean paintEmpties) {
        super.draw(gr, px, py, width, height, paintEmpties);
        int sizeX = width / getColumns();
        int sizeY = height / getLines();
        if (current != null) {
            current.draw(gr, px + current.getColumn() * sizeX,
                    py + current.getLine() * sizeY,
                    sizeX * current.getColumns(),
                    sizeY * current.getLines(),
                    false
            );
        }
    }

}