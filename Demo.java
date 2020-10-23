public class Demo{

public static void printLoop(int n){
  for(int i = 1; i <= n;i++){
    for(int j = i -1; j < n; j++){
       System.out.print(i);
    }
    System.out.println();
  }
}
public static String arrToString(int[] arr){
  String newStr = "{";
  String actualStr = "";
  for (int i = 0;i<arr.length;i++){
    if(arr.length -1 > 0){
    newStr += arr[i] + ", ";
    }
    else{
      newStr += arr[i];
    }
  }
  if(arr.length - 1 <= 0){
    return newStr + "}";
  }
  for (int j = 0; j < newStr.length()-2;j++){
    actualStr += newStr.substring(j,j+1);
  }

  return actualStr + "}";
}
public static String arrayDeepToString(int[][]arr){
  String newStr1 = "{";
  String actualStr1 = "";
  for (int i = 0;i < arr.length;i++){
    newStr1 += arrToString(arr[i]) + ", ";
  }
  for (int j = 0; j < newStr1.length()-2;j++){
    actualStr1 += newStr1.substring(j,j+1);
  }
  return actualStr1 + "}";
}
public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][]Arr = new int[rows][cols];
  for (int i = 0; i < rows; i++){
    for (int j = 0; j < cols; j++){
    Arr[i][j] = (int) Math.round(Math.random() * maxValue);
    }
  }
  return Arr;
}
public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[][]arr = new int[rows][];
  for (int i = 0; i < rows; i++){
    arr[i] = new int[(int) Math.round(Math.random() * cols)];

    for (int j = 0; j < (int)Math.round(Math.random() * cols) -1; j++){
    arr[i][j] = (int) Math.round(Math.random() * maxValue);
    }
  }
  return arr;
}
  public static void main(String[] args){
    if (args.length == 0){
    printLoop(5);
    }
    else {printLoop(Integer.parseInt(args[0]));}
  }
}
