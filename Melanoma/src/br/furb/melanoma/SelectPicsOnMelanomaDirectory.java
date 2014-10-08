package br.furb.melanoma;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import android.os.Environment;
import android.provider.MediaStore.Images;
import android.widget.ExpandableListView;

public class SelectPicsOnMelanomaDirectory {
	private ExpandListAdapter ExpAdapter;
	private ArrayList<Group> ExpListItems;
	private ExpandableListView ExpandList;
	private GroupCreationControl GP;
	private String[] FilePathStrings;
	private String[] FileNameStrings;
	private File[] listaImagens;

	public ArrayList<Group> SelectPicsOnMelanomaDirectory(File[] listFile) {

		GP = new GroupCreationControl();

		// CLASSE QUE FAZ A SELEÇÃO DAS IMAGENS QUE ESTÃO SALVAS NO DIRETÓRIO
		// MELANOMAPICS
		// PARA DEPOIS ACRESCENTA-LAS NO EXPANDABLELISTVIEW

		switch (SelecionaRegiaoCorporal.positionGallery) {
		case 10:
			listaImagens = new File[devolveQtd("A1", listFile)];	
			
			//TODO FAZER O FOR PARA ACRESCENTAR TODOS OS GRUPOS EXISTENTES
			
			ExpListItems = GP.SetStandardGroups(devolveQtd("A1", listFile), setGroupNameParaNovoGrupo("A1", listaImagens),devolveLista("A1", listFile));

			return ExpListItems;

/*		case 11:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("A2")) {

				}
			}

			return;

		case 12:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("A3")) {

				}
			}

			return;

		case 13:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("A4")) {

				}
			}

			return;

		case 14:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("A5")) {

				}
			}

			return;

		case 20:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("B1")) {

				}
			}

			return;

		case 21:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("B2")) {

				}
			}

			return;

		case 22:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("B3")) {

				}
			}

			return;

		case 23:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("B4")) {

				}
			}

			return;

		case 24:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("B5")) {

				}
			}

			return;

		case 30:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("C1")) {

				}
			}

			return;

		case 31:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("C2")) {

				}
			}

			return;

		case 32:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("C3")) {

				}
			}

			return;

		case 33:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("C4")) {

				}
			}

			return;

		case 34:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("C5")) {

				}
			}

			return;

		case 40:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("D1")) {

				}
			}

			return;

		case 41:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("D2")) {

				}
			}

			return;

		case 42:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("D3")) {

				}
			}

			return;

		case 43:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("D4")) {

				}
			}

			return;

		case 44:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("D5")) {

				}
			}

			return;

		case 50:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("E1")) {

				}
			}

			return;

		case 51:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("E2")) {

				}
			}

			return;

		case 52:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("E3")) {

				}
			}

			return;

		case 53:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("E4")) {

				}
			}

			return;

		case 54:
			for (int i = 0; i < listFile.length; i++) {
				if (listFile[i].getName().contains("E5")) {

				}
			}

			return;*/

		default:
			break;
		}
		return ExpListItems;
	}
	
	// retorno a quantidade de arquivos que tem com o padrao A1, A2...
	public int devolveQtd(String stg, File[] listFile) {

		int qtd = 0;
			
		for (int i = 0; i < listFile.length; i++) {
			if (listFile[i].getName().contains(stg)) {
				qtd++;
			}
		}
		return qtd;
	}

	// devolve a lista somente com os elentos selecionados de acordo com o padrao A1, A2...
	public File[] devolveLista(String stg, File[] listFile) {

		int qtd = 0;

		File[] listaDeSelecionados = new File[devolveQtd(stg, listFile)];
	
		for (int i = 0; i < listFile.length; i++) {
			if (listFile[i].getName().contains(stg)) {
				listaDeSelecionados[qtd] = listFile[i].getAbsoluteFile();
				qtd++;
			}
		}
		return listaDeSelecionados;
	}

	public void verificaSePossuiGrupo(){
		
		
		
	}
	
	
	
	// vai dizer qual deve ser o nome do proximo grupo
	public String setGroupNameParaNovoGrupo(String imagesLX, File[] listFile) {

		File[] listaDeSelecionados = new File[devolveQtd(imagesLX, listFile)];
		String name = null;

		if (devolveQtd(imagesLX, listFile) == 0) {
			name = "Grupo 1";
		} else {
			if (devolveQtd(imagesLX, listFile) == 1) {
				name = "Grupo 2";
			} else {
				name = "Grupo "
						+ (devolveMaiorValorDeGrupo(listaDeSelecionados,
								imagesLX, listFile));
			}
		}
		return name;
	}
	
	// deve fazer a comparacao entre os dois caminhos pra ver qual tem o maior
	// valor de grupo
	public int devolveMaiorValorDeGrupo(File[] listaSelecionados,
			String imagesLX, File[] listFile) {
		int x = 0, y = 0, resultado = 0;

		String array[] = new String[5];

		// extrai o valor do grupo da primeira string
		array = listaSelecionados[0].getName().split(" ");
		array = array[1].split("_");
		resultado = Integer.parseInt(array[0]);

		array = null;

		for (y = 1; y < listaSelecionados.length; y++) {

			// extrai o valor do grupo da segunda string
			array = listaSelecionados[y].getName().split(" ");
			array = array[1].split("_");

			y = Integer.parseInt(array[0]);
			array = null;
			
			// retorna o maior valor
			if (resultado > y) {
				resultado = resultado;
			} else
				resultado = y;
		}
		return resultado;
	}

}

