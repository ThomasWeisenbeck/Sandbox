package searchInterface;

public class BackSearch implements ISearch {

  BackSearch() {
  }

  public int findIndexOf(char letter, char[] letters) {
    for(int i=letters.length - 1; i >= 0; i--) {
      if(letters[i] == letter) {
        return i;
      }
    }
    return -1;
   }

  public static void main(String[] args) {
    BackSearch search = new BackSearch();
    char[] list = {'e','a', 'e','a'};
    System.out.println(search.findIndexOf('e', list));
  }
}
