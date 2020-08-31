public class catDog {
  public boolean catDog(String str) {
    int countc = 0;
    int countd = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("cat")) {
        countc++;
      }
      if (str.substring(i, i + 3).equals("dog")) {
        countd++;
      }
    }
    return (countc == countd);
  }
}
