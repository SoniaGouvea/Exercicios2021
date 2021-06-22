public class Vetores {


        public static void main(String[] args) {

            int vec[] = new int[5];

		/*
		   vec[0] = 5;
		   vec[1] = 7;

		System.out.println("A posição 0 do vetor eh:" + vec[0]);
		System.out.println("A posição 1 do vetor eh:" + vec[1]);

		 A impressão sairá assim, no console:
		 A posição 0 do vetor eh:5
         A posição 1 do vetor eh:7
		 */
            // usar o FOR
		/* para fazer ele ficar valor inverso, criar int aux=4; alterar o comando vec[i]=i por vec[i]=aux; adiciona o comando
		   aux --;

		   A impressão ficará assim:
		   O valor d vetor é:4
           O valor d vetor é:3
           O valor d vetor é:2
           O valor d vetor é:1
           O valor d vetor é:0
		   */
            //adicionado
            int aux = 4;

            for(int i=0; i<5; i ++){
                //alterado de vec[i] = i; para vec[i] = aux; e incluido aux --; objetivo apresentar em ordem decrescente.
                vec[i] = aux;
                aux --;
            }
            for(int i=0; i<5; i ++){
                System.out.println("O valor d vetor é:" + vec[i]);
            }
		/* Impressão ficara assim:
		O valor d vetor é:0
		O valor d vetor é:1
		O valor d vetor é:2
		O valor d vetor é:3
		O valor d vetor é:4
		*/
        }

    }
