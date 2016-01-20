
public class Vigenère {
//versão 1.0 25.10.15

//joga-se a entrada. Acentos e maiúsculas serão ignorados
int[] getValores (String x)
{
	int[] r =  new int[x.length()];
	String y = x.toLowerCase();
	for(int i = 0;i<y.length();i++)
	{
		char c = y.charAt(i);
		switch(c)
		{
			case 'a':
			{
				r[i] = 0;
				break;
			}
			case 'á':
			{
				r[i] = 0;
				break;
			}
			case 'à':
			{
				r[i] = 0;
				break;
			}
			case 'â':
			{
				r[i] = 0;
				break;
			}
			case 'ã':
			{
				r[i] = 0;
				break;
			}
			case 'b':
			{
				r[i] = 1;
				break;
			}
			case 'c':
			{
				r[i] = 2;
				break;
			}
			case 'd':
			{
				r[i] = 3;
				break;
			}
			case 'e':
			{
				r[i] = 4;
				break;
			}
			case 'é':
			{
				r[i] = 4;
				break;
			}
			case 'ê':
			{
				r[i] = 4;
				break;
			}
			case 'f':
			{
				r[i] = 5;
				break;
			}
			case 'g':
			{
				r[i] = 6;
				break;
			}
			case 'h':
			{
				r[i] = 7;
				break;
			}
			case 'i':
			{
				r[i] = 8;
				break;
			}
			case 'í':
			{
				r[i] = 8;
				break;
			}
			case 'j':
			{
				r[i] = 9;
				break;
			}
			case 'k':
			{
				r[i] = 10;
				break;
			}
			case 'l':
			{
				r[i] = 11;
				break;
			}
			case 'm':
			{
				r[i] = 12;
				break;
			}
			case 'n':
			{
				r[i] = 13;
				break;
			}
			case 'o':
			{
				r[i] = 14;
				break;
			}
			case 'ó':
			{
				r[i] = 14;
				break;
			}
			case 'ô':
			{
				r[i] = 14;
				break;
			}
			case 'p':
			{
				r[i] = 15;
				break;
			}
			case 'q':
			{
				r[i] = 16;
				break;
			}
			case 'r':
			{
				r[i] = 17;
				break;
			}
			case 's':
			{
				r[i] = 18;
				break;
			}
			case 't':
			{
				r[i] = 19;
				break;
			}
			case 'u':
			{
				r[i] = 20;
				break;
			}
			case 'ú':
			{
				r[i] = 20;
				break;
			}
			case 'v':
			{
				r[i] = 21;
				break;
			}
			case 'w':
			{
				r[i] = 22;
				break;
			}
			case 'x':
			{
				r[i] = 23;
				break;
			}
			case 'y':
			{
				r[i] = 24;
				break;
			}
			case 'z':
			{
				r[i] = 25;
				break;
			}
			default: //espaço
			{
				r[i] = 26; 
			}
		}
	}
	return r;
}

int[] getValoresSemEspaco (String x)
{
	int[] r =  new int[x.length()];
	String y = x.toLowerCase();
	for(int i = 0;i<y.length();i++)
	{
		char c = y.charAt(i);
		switch(c)
		{
			case 'a':
			{
				r[i] = 0;
				break;
			}
			case 'á':
			{
				r[i] = 0;
				break;
			}
			case 'à':
			{
				r[i] = 0;
				break;
			}
			case 'â':
			{
				r[i] = 0;
				break;
			}
			case 'b':
			{
				r[i] = 1;
				break;
			}
			case 'c':
			{
				r[i] = 2;
				break;
			}
			case 'd':
			{
				r[i] = 3;
				break;
			}
			case 'e':
			{
				r[i] = 4;
				break;
			}
			case 'é':
			{
				r[i] = 4;
				break;
			}
			case 'ê':
			{
				r[i] = 4;
				break;
			}
			case 'f':
			{
				r[i] = 5;
				break;
			}
			case 'g':
			{
				r[i] = 6;
				break;
			}
			case 'h':
			{
				r[i] = 7;
				break;
			}
			case 'i':
			{
				r[i] = 8;
				break;
			}
			case 'í':
			{
				r[i] = 8;
				break;
			}
			case 'j':
			{
				r[i] = 9;
				break;
			}
			case 'k':
			{
				r[i] = 10;
				break;
			}
			case 'l':
			{
				r[i] = 11;
				break;
			}
			case 'm':
			{
				r[i] = 12;
				break;
			}
			case 'n':
			{
				r[i] = 13;
				break;
			}
			case 'o':
			{
				r[i] = 14;
				break;
			}
			case 'ó':
			{
				r[i] = 14;
				break;
			}
			case 'ô':
			{
				r[i] = 14;
				break;
			}
			case 'p':
			{
				r[i] = 15;
				break;
			}
			case 'q':
			{
				r[i] = 16;
				break;
			}
			case 'r':
			{
				r[i] = 17;
				break;
			}
			case 's':
			{
				r[i] = 18;
				break;
			}
			case 't':
			{
				r[i] = 19;
				break;
			}
			case 'u':
			{
				r[i] = 20;
				break;
			}
			case 'ú':
			{
				r[i] = 20;
				break;
			}
			case 'v':
			{
				r[i] = 21;
				break;
			}
			case 'w':
			{
				r[i] = 22;
				break;
			}
			case 'x':
			{
				r[i] = 23;
				break;
			}
			case 'y':
			{
				r[i] = 24;
				break;
			}
			case 'z':
			{
				r[i] = 25;
				break;
			}
			default: //espaço
			{
				r[i] = 26; 
			}
		}
	}
	return r;
}


String getPalavra(int[] a) //pode ser otimizado com os if
{
	String r = null;
	for(int i = 0;i<a.length;i++)
	{
		switch (a[i])
		{
			case 26:
			{	
				r = r+" ";
				if (i == 0)
				{
					r = " ";
				}
				break;
			}
			case 0:
			{	
				r = r+"a";
				if (i == 0)
				{
					r = "a";
				}
				break;
			}
			case 1:
			{	
				r = r+"b";
				if (i == 0)
				{
					r = "b";
				}
				break;
			}
			case 2:
			{	
				r = r+"c";
				if (i == 0)
				{
					r = "c";
				}
				break;
			}
			case 3:
			{	
				r = r+"d";
				if (i == 0)
				{
					r = "d";
				}
				break;
			}
			case 4:
			{	
				r = r+"e";
				if (i == 0)
				{
					r = "e";
				}
				break;
			}
			case 5:
			{	
				r = r+"f";
				if (i == 0)
				{
					r = "f";
				}
				break;
			}
			case 6:
			{	
				r = r+"g";
				if (i == 0)
				{
					r = "g";
				}
				break;
			}
			case 7:
			{	
				r = r+"h";
				if (i == 0)
				{
					r = "h";
				}
				break;
			}
			case 8:
			{	
				r = r+"i";
				if (i == 0)
				{
					r = "i";
				}
				break;
			}
			case 9:
			{	
				r = r+"j";
				if (i == 0)
				{
					r = "j";
				}
				break;
			}
			case 10:
			{	
				r = r+"k";
				if (i == 0)
				{
					r = "k";
				}
				break;
			}
			case 11:
			{	
				r = r+"l";
				if (i == 0)
				{
					r = "l";
				}
				break;
			}
			case 12:
			{	
				r = r+"m";
				if (i == 0)
				{
					r = "m";
				}
				break;
			}
			case 13:
			{	
				r = r+"n";
				if (i == 0)
				{
					r = "n";
				}
				break;
			}
			case 14:
			{	
				r = r+"o";
				if (i == 0)
				{
					r = "o";
				}
				break;
			}
			case 15:
			{	
				r = r+"p";
				if (i == 0)
				{
					r = "p";
				}
				break;
			}
			case 16:
			{	
				r = r+"q";
				if (i == 0)
				{
					r = "q";
				}
				break;
			}
			case 17:
			{	
				r = r+"r";
				if (i == 0)
				{
					r = "r";
				}
				break;
			}
			case 18:
			{	
				r = r+"s";
				if (i == 0)
				{
					r = "s";
				}
				break;
			}
			case 19:
			{	
				r = r+"t";
				if (i == 0)
				{
					r = "t";
				}
				break;
			}
			case 20:
			{	
				r = r+"u";
				if (i == 0)
				{
					r = "u";
				}
				break;
			}
			case 21:
			{	
				r = r+"v";
				if (i == 0)
				{
					r = "v";
				}
				break;
			}
			case 22:
			{	
				r = r+"w";
				if (i == 0)
				{
					r = "w";
				}
				break;
			}
			case 23:
			{	
				r = r+"x";
				if (i == 0)
				{
					r = "x";
				}
				break;
			}
			case 24:
			{	
				r = r+"y";
				if (i == 0)
				{
					r = "y";
				}
				break;
			}
			case 25:
			{	
				r = r+"z";
				if (i == 0)
				{
					r = "z";
				}
				break;
			}
		}
	}
	
	return r;
}


String encripta(int[] entrada, int[] chave)
{
	int [] saida = new int[entrada.length];
	for(int i = 0;i<entrada.length;i++)
	{
		saida[i] = (entrada[i]+chave[i%(chave.length)])%27;
	}
	return getPalavra(saida);
}

String encriptaTotal(String e, String c)
{
	return encripta(getValores(e),getValores(c));
}

String encriptaSemEspaco(int[] entrada, int[] chave)
{
	int [] saida = new int[entrada.length];
	int posC = chave.length;
	for(int i = 0;i<entrada.length;i++)
	{
		if(entrada[i] == 26)
		{
			saida[i] = 26;
		}
		else
		{
			saida[i] = (entrada[i]+chave[posC%(chave.length)])%26;
			posC++;
		}
	}
	return getPalavra(saida);
}

String encriptaTotalSemEspaco(String e, String c)
{
	return encriptaSemEspaco(getValores(e),getValores(c));
}


	
}
