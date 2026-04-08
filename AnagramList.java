import java.util.ArrayList;

public class AnagramList
{
  private final ArrayList<String> anagrams;

  public AnagramList(String word)
  {
    anagrams = new ArrayList<String>();

    // Start with empty prefix, full word as remaining letters
    completeAnagrams("", word);

    sortAnagrams();
  }

  private void completeAnagrams(String start, String end)
  {
    // BASE CASE: no letters left → full anagram made
    if (end.length() == 0)
    {
      // avoid duplicates
      if (!anagrams.contains(start))
      {
        anagrams.add(start);
      }
      return;
    }

    // RECURSIVE CASE
    for (int i = 0; i < end.length(); i++)
    {
      String newStart = start + end.charAt(i);

      // remove character at i from end
      String newEnd = end.substring(0, i) + end.substring(i + 1);

      completeAnagrams(newStart, newEnd);
    }
  }

  private void sortAnagrams()
  {
    // Insertion Sort
    for (int i = 1; i < anagrams.size(); i++)
    {
      String key = anagrams.get(i);
      int j = i - 1;

      while (j >= 0 && anagrams.get(j).compareTo(key) > 0)
      {
        anagrams.set(j + 1, anagrams.get(j));
        j--;
      }

      anagrams.set(j + 1, key);
    }
  }

  public int searchAnagrams(String target)
  {
    // Binary Search (since list is sorted)
    int left = 0;
    int right = anagrams.size() - 1;

    while (left <= right)
    {
      int mid = (left + right) / 2;
      int compare = anagrams.get(mid).compareTo(target);

      if (compare == 0)
      {
        return mid;
      }
      else if (compare < 0)
      {
        left = mid + 1;
      }
      else
      {
        right = mid - 1;
      }
    }

    return -1;
  }

  public ArrayList<String> getAnagrams()
  {
    return anagrams;
  }
}
