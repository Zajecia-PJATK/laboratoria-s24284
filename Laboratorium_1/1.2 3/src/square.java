import java.io.*;

class ExampleInputOutput {
  public static void main(String[] args) throws IOException {
    double a;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Podaj liczbe: ");
    a = Double.parseDouble(br.readLine());
    System.out.println("Podałeś: " + a);
  }
}