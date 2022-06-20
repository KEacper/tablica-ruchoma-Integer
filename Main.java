import java.lang.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Wprowadź liczby aby poznać ich statystyki. Liczba 150 zamyka zbiór");

     List<Integer> list= new ArrayList<>();

    int liczba = 0;
    boolean warunek = false;

    while (warunek != true){
      list.add(liczba);
      liczba=scan.nextInt();
      if(liczba == 150){
        warunek = true;}
      
    } 
    int suma = 0;
    int avg = 0;
    int dodatnie = 0;
    for (int i=0;i<list.size();i++){
      suma = suma + list.get(i);
      if(list.get(i)>0){
        dodatnie++;
      }
      
    }
    avg = suma / list.size();
      System.out.println("suma wprowadzonych liczb: "+suma);
      System.out.println("średnia wprowadzonych liczb: "+avg);
      System.out.println("średnia wprowadzonych liczb: "+dodatnie);
       }
  }
