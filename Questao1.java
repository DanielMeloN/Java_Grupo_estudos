import java.util.*;
import java.io.*;


public class Questao1 {
    public static void main(String args[]) throws IOException {
        //Criando variavel de leitura
        Scanner ler = new Scanner(System.in);
        //N = número de amigos
        //M = reunioes
        //I = amigo infectado 
        //R = número da primeira reunião em que ele participou infectado
        //A = total de amigos que participaram dessa reunião
        //Pi = identificador 
        int i,N,M,I,R,A,k,cnt = 0;
        //Vetor que verifica os participantes que passaram nas reuniões
        ArrayList<Integer> Presente = new ArrayList<Integer>();
        //Verificador de infectado
        boolean Infectado = false;
        System.out.println("Numero de amigos:"); 
        N = ler.nextInt();
        System.out.println("Numero de reunioes:");
        M = ler.nextInt();
        System.out.println("Numero do amigo infectado:");
        I = ler.nextInt();
        System.out.println("Numero de da reuniao que o infectado foi:");
        R = ler.nextInt();
        //Verificar quais amigos estão infectados
        //Aqui vai ser um vetor que diz qual esta infectado
        boolean Amigos[] = new boolean[N+1];
        //Pessoas
        for( i = 0; i <= N; i++ )
           Amigos[i] = false;
        //Reunioes
        for( int m = 1; m <= M; m++ ){
           //Verifica o infectado
           if ( m == R ) Amigos[I] = true;
             System.out.println("Numero de amigos:"); 
             A = ler.nextInt();
      //Pessoas da reunião
      for( int a = 1; a <= A; a++ ){
        System.out.println("Numero do amigo que participou:"); 
        k = ler.nextInt();
        Presente.add(k);
        if ( Amigos[k] ) Infectado = true;
      }
      //Ve se o infectado esta nessa reunião
      if ( Infectado )
        for( int a: Presente )
          Amigos[a] = true;
    }
    //Conta os infectados
    for ( boolean infectado: Amigos )
      if ( infectado )
        cnt++;
    System.out.println( cnt );
  }
}