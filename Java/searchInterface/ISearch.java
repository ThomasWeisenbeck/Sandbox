package searchInterface;

public class FrontSearch implements ISearch {
  FrontSearch() {
  }

  public int findIndexOf(char letter, char[] letters) {
    for(int i=0; i <= letters.length - 1; i++) {
      if(letters[i] == letter) {
        return i;
      }
    }
    return -1;
   }

  public static void main(String[] args) {
    FrontSearch search = new FrontSearch();
    char[] list = {'e','a', 'e','a'};
    System.out.println(search.findIndexOf('e', list));
  }
}
