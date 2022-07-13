// Nikola Džajević - Testna Automatizacija - Domaci - 2022

import java.util.ArrayList; // import ArrayList klase


class main
{
	public static void main(String[] args)
	{

		// 1
    	String stringVrednost = "Neki String";
    	System.out.println("1. Duzina Stringa: " + stringVrednost.length());

    	// 2
    	int[] niz = {1, 2, 3, 4, 5};
    	System.out.println("2. Pristupanje 5. clanu niza: " + niz[4]);

    	// 3
        System.out.println("3. Ostatak pri deljenju 25 sa 4: " + 25 % 4);
        
        // 4.1.
        System.out.println("4.1. Suma niza For petlja: " + sumaNizaFor(niz));
                
        // 4.2.
        System.out.println("4.2. Suma niza For-Each petlja: " + sumaNizaForEach(niz));
        
        // 4.3.
        System.out.println("4.3. Suma niza While petlja: " + sumaNizaWhile(niz));

        // 5
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("jedaN");
        lista.add("Dva");
        lista.add("TRI");
		lista.add("CeTiRi");
		lista.add("pET");
        
        System.out.println("5. Lista Stringova u manja slova: " + uManjaSlova(lista));
        
        // 6
        int[] niz6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("6. Niz u listu: " + nizUlistu(niz6));

        // 7
        int[] niz7 = {1, 2, 3};
        System.out.println("7. Try-Catch-Finally test: " + TryCatchFinally(niz7));

        // 8
        String palindrom = "Oni vole belo vino";
        //String palindrom = "Ana ne voli Milovana"; // Test slucaj
        System.out.println("8. Da li je uneti String palindrom? -> " + DaLiJePalindrom(palindrom));
        
        // 9
        int broj = 12;
        System.out.println("9. Da li je uneti broj prost? -> " + DaLIJeProst(broj));
	}

	// 4.1.
    public static int sumaNizaFor(int[] niz)
    {
    	int suma = 0;

        for(int i = 0; i < niz.length; i++)
        {
        	suma += niz[i];
        }
        return suma;
    }

	// 4.2.
    public static int sumaNizaForEach(int[] niz)
    {
    	int suma = 0;

        for(int i : niz)
        {
        	suma += niz[i - 1]; 
        }
        return suma;
    }
        
	// 4.3.
    public static int sumaNizaWhile(int[] niz)
    {
    	int suma = 0;
    	int i = 0;

        while(i < niz.length)
        {
        	suma += niz[i];
        	i++; 
        }
        return suma;
    }

    // 5
    public static ArrayList uManjaSlova(ArrayList<String> lista)
    {
    	for(int i = 0; i < lista.size(); i++)
    	{
        	String malaSlova = lista.get(i).toLowerCase();
        	lista.set(i, malaSlova);  
    	}

    	return lista;
    }
    
    // 6
    public static ArrayList nizUlistu(int[] niz)
    {   
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < niz.length; i++)
    	{
        	lista.add(niz[i]); 
    	}
    	return lista;
    }
    
    // 7
    public static String TryCatchFinally(int[] niz)
    {   
        try
        {
      		System.out.println(niz[10]); // Prouzrokuje gresku

      		return "Try";  
        }
        catch(Exception e)
        {
        	return "Catch";
        }
        finally
        {   
        	return "Finally";
        }
    }
    
    // 8
    public static String DaLiJePalindrom(String string) 
    {
    	String normalno = string;
    	String okrenuto = "";
        
        // "Okretanje" Stringa
	    for (int i = string.length() - 1; i >= 0; i--)
	    {
		    char karakter = string.charAt(i);
	        okrenuto += karakter;    
	    } 
        
        // Brisanje razmaka izmedju reci i smanjenje slova
	    okrenuto = okrenuto.replaceAll("\\s+","").toLowerCase();
        normalno = normalno.replaceAll("\\s+","").toLowerCase();

        //System.out.println(okrenuto);
        
        // Porednjenje stringova
		if(okrenuto.equals(normalno))
		{
			return "Jeste";
		}
		else
		{
			return "Nije";
		}
    }

    // 9 
    public static String DaLIJeProst(int broj)
    {   
        if (broj <= 1)
            return "Nije";
  
        for (int i = 2; i < broj; i++)
            if (broj % i == 0)
                return "Nije";
  
        return "Jeste";
    }
}
