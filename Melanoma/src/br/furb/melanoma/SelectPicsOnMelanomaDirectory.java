package br.furb.melanoma;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ExpandableListViewControl.Group;
import ExpandableListViewControl.GroupCreationControl;
import android.os.Environment;
import android.provider.MediaStore.Images;
import android.widget.ExpandableListView;

import br.furb.melanoma.DataBasePointControl.*;

public class SelectPicsOnMelanomaDirectory {

	private GroupCreationControl GP;
	private SelectSpecificRegion SelectSpecificRegion;
	private File[] listaImagens;

	public ArrayList<Group> SelectPicsOnMelanomaDirectory(File[] listFile) {

		GP = new GroupCreationControl();
		ArrayList<Group> ExpListItems = new ArrayList<Group>();
		String stg;
		// CLASSE QUE FAZ A SELEÇÃO DAS IMAGENS QUE ESTÃO SALVAS NO DIRETÓRIO
		// MELANOMAPICS
		// PARA DEPOIS ACRESCENTA-LAS NO EXPANDABLELISTVIEW

		switch (SelecionaRegiaoCorporal.positionGallery) {
		case 10:			
			stg = "A1";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 11:
			stg = "A2";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 12:
			stg = "A3";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 13:
			stg = "A4";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}

			
		case 14:
			stg = "A5";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 20:
			stg = "B1";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}



		case 21:
			stg = "B2";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 22:
			stg = "B3";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 23:
			stg = "B4";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 24:
			stg = "B5";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 30:
			stg = "C1";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 31:
			stg = "C2";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 32:
			stg = "C3";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 33:
			stg = "C4";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 34:
			stg = "C5";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 40:
			stg = "D1";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 41:
			stg = "D2";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 42:
			stg = "D3";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}
				return ExpListItems;
			} else {
				return null;
			}


		case 43:
			stg = "D4";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 44:
			stg = "D5";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 50:
			stg = "E1";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}

		case 51:
			stg = "E2";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 52:
			stg = "E3";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 53:
			stg = "E4";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


		case 54:
			stg = "E5";
			if (devolveQtd(stg, listFile) != 0) {
				listaImagens = new File[devolveQtd(stg, listFile)];
				listaImagens = devolveListaSelecionados(stg, listFile);

				for (int x = 1; x <= getQtdGrupos(devolveListaSelecionados(stg,listFile)); x++) {
					if (getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x), x) != 0) {
						ExpListItems.addAll(GP.SetStandardGroups(getQtdEmListaGrupo(getListaDeGrupo(listaImagens, x),x),"Grupo " + x,getListaDeGrupo(listaImagens, x)));
					}
				}

				return ExpListItems;
			} else {
				return null;
			}


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

	// devolve a lista somente com os elentos selecionados de acordo com o
	// padrao A1, A2...
	public File[] devolveListaSelecionados(String stg, File[] listFile) {

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
	
	public String getGroupName (File arqName){
		String array[] = new String[5];

		// extrai o valor do grupo
		array =arqName.getName().split(" ");
		array = array[1].split("_");

		return "Grupo "+ array[0];
	}

	public int getGroupNumber (File arqName){
		String array[] = new String[5];

		// extrai o valor do grupo
		array =arqName.getName().split(" ");
		array = array[1].split("_");

		return Integer.parseInt(array[0]);
	}
	
	public String getArqDate(String arqName) {
		String array[] = new String[5];
		String data[] = new String[8];
		String dataJunto = new String();
		String dataSeparada = new String();

		// extrai o valor do grupo
		array = arqName.split(" ");
		array = array[1].split("_");
		dataJunto = array[3];

		for (int i = 0; i < 8; i++) {

			data[i] = dataJunto.substring(i, i + 1);

		}

		dataSeparada = data[0] + data[1] + data[2] + data[3] + "-" + data[4]
				+ data[5] + "-" + data[6] + data[7];

		return dataSeparada;
	}
	
	// vai dizer qual deve ser o nome do proximo grupo
	public String setGroupName(String imagesLX, File[] listaDeSelecionados, int posx, int posy) {
		String name = null;
		PointReader pt = new PointReader();

		if (devolveQtd(imagesLX, listaDeSelecionados) == 0) {
			name = "Grupo 1";
		} else {
			if (pt.controlaPontosExistentes(listaDeSelecionados, posx, posy)!= null){
				SelectSpecificRegion = new SelectSpecificRegion();
				name = getGroupName(pt.controlaPontosExistentes(listaDeSelecionados, posx, posy));
				SelectSpecificRegion.setPosX(pt.devolvePosX(pt.controlaPontosExistentes(listaDeSelecionados, posx, posy).getName()));
				SelectSpecificRegion.setPosY(pt.devolvePosY(pt.controlaPontosExistentes(listaDeSelecionados, posx, posy).getName()));
			}else {
				name = "Grupo " + ((getQtdGrupos(listaDeSelecionados))+1);
			}
		}
		return name;
	}

	public int perteceGrupo(String imagesLX, File[] listaDeSelecionados,
			int posx, int posy) {
		int value = 0;
		PointReader pt = new PointReader();

		if (pt.controlaPontosExistentes(listaDeSelecionados, posx, posy) != null) {
			value = getGroupNumber(pt.controlaPontosExistentes(
					listaDeSelecionados, posx, posy));
			
		} else {
			value = 0;
		}

		return value;
	}

	// metodo que retorna o valor do maior grupo existente
	public int getQtdGrupos(File[] listaSelecionados) {
		int x = 0, y = 0, resultado = 0;
	
		resultado = getGroupNumber(listaSelecionados[0].getAbsoluteFile());

		for (y = 1; y < listaSelecionados.length; y++) {
			
			x = getGroupNumber(listaSelecionados[y].getAbsoluteFile());

			if (resultado <= x) {
				resultado = x;
			} 			
		}
		return resultado;
	}

	// metodo que retorna a lista de arquivos existentes em determinado grupo
	public File[] getListaDeGrupo(File[] listaSelecionados, int numeroGrupo) {

		File[] listaResposta = new File[getQtdEmListaGrupo(listaSelecionados,
				numeroGrupo)];
		int ctrl = 0, x = 0;

		for (int y = 0; y < listaSelecionados.length; y++) {
			x = getGroupNumber(listaSelecionados[y].getAbsoluteFile());

			// retorna o maior valor
			if (x == numeroGrupo) {
				listaResposta[ctrl] = listaSelecionados[y].getAbsoluteFile();
				ctrl++;
			}
		}
		return listaResposta;
	}
	

	// metodo que retorna a quantidade de arquivos por grupo
	public int getQtdEmListaGrupo(File[] listaSelecionados, int numeroGrupo) {
		int ctrl = 0, x = 0;

		for (int y = 0; y < listaSelecionados.length; y++) {
			x = getGroupNumber(listaSelecionados[y].getAbsoluteFile());

			// conta a qtd de elementos que determinado grupo possui
			if (x == numeroGrupo) {
				ctrl++;
			}
		}
		return ctrl;
	}

}

