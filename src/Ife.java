class If {
        public static void main(String[] args) {

		int ano = 2021;
		if (ano < 0){

		    System.out.println("Não é um ano");

		}else if( ano%4==0 && ano%100!=0|| (ano%400==0)) {
		    System.out.println("É bissexto");

		}else{
		    System.out.println("Não é bissexto");

	}
            int x = 100;

            while (x < 10) {
                System.out.println("item " + x);
                x++;

            }

            x = 100;
            do {
                System.out.println("item " + x);
                x++;

            } while (x < 10);

        }
    }
