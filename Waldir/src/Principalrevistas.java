
public class Principalrevistas {

	public static void main(String[] args) {
		Editora edit = new Editora("065", "Sei la ", "Ponte que partiu");
		Editora edit02 = new Editora("066", "Sei não ", "Rua dos bobos");
		Revista rev = new Revista("4528", "Gazeta");
		Artigo art = new Artigo("025", "Melo", "Interfaces em java", "30/02/2021");
		Artigo art02 = new Artigo("025", "tralala", "interface graficas", "30/03/2021");
		Artigo art03 = new Artigo("026", "Melo", "Stream API", "22/04/2021");
		edit.adcionarRevista(rev);
		edit02.exibiRevistas();
		rev.adcionarArtigo(art);
		rev.adcionarArtigo(art02);
		rev.adcionarArtigo(art03);
		edit.exibiRevistas();
		rev.exibiArtigos();
		art.obterTamanho();
	}

}
