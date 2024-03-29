import java.util.*;

 class RomanToInteger
	 {
    public static void main(String[] args)
	{
        String romanNumeral = "IX"; // Replace this with your Roman numeral

        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is " + result);
    }

    public static int romanToInt(String s)
		{
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--)
			{
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue)
			{
                result -= currentValue;
            }
			
			else
			{
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}
