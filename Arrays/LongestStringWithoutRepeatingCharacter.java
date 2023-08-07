/**
 * Used 2 pointers along with Set Data Structure
 *
 * Keep both pointer at same point initially then move j pointer
 *
 * If found element in set then start moving i till u find the element and remove from set.
 *
 */

import java.util.HashSet;

public class LongestStringWithoutRepeatingCharacter
{
    public static void main (String[] args)
    {
        System.out.println("Length iss:"+ lengthOfLongestSubstring("priyankatd"));
    }
        public static int lengthOfLongestSubstring(String A) {
            int i = 0;
            int j = 0;
            int ans = 0;

            HashSet<Character> hs = new HashSet<>();

            while(j < A.length()){
                if(!hs.contains(A.charAt(j))){
                    ans = Math.max(ans,j-i+1);
                    hs.add(A.charAt(j));
                    j++;
                }else{
                    hs.remove(A.charAt(i));
                    i++;
                }
            }
            return ans;
        }
    }
