public class Demo{

public static void printLoop(int n){
  for(int i = 1; i <= n;i++){
    for(int j = i -1; j < n; j++){
       System.out.print(i);
    }
    System.out.println();
  }
}

  public static void main(String[] args){
    if (args.length == 0){
    printLoop(5);
    }
  }
}
