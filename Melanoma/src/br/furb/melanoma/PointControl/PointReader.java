package br.furb.melanoma.PointControl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import br.furb.melanoma.*;

public class PointReader {

	public int devolvePosX(String arquivoImagem) {
		String array[] = new String[5];
		int x = 0;

		array = arquivoImagem.split(" ");
		array = array[1].split("_");
		x = Integer.parseInt(array[1]);

		return x;
	}

	public int devolvePosY(String arquivoImagem) {
		String array[] = new String[5];
		int y = 0;
		
		array = arquivoImagem.split(" ");
		array = array[1].split("_");
		y = Integer.parseInt(array[2]);

		return y;
	}

	public File controlaPontosExistentes(File[] listaGrupo, int posx, int posy) {
		File ctrl = new File("");
		int margemParaClick = 25;

		if (listaGrupo.length != 0) {
			ctrl = new File(listaGrupo[0].getAbsolutePath());

			for (int x = 0; x < listaGrupo.length; x++) {
				if ((devolvePosX(listaGrupo[x].getName()) > posx
						- margemParaClick && devolvePosX(listaGrupo[x]
						.getName()) < posx + margemParaClick)
						&& (devolvePosY(listaGrupo[x].getName()) > posy
								- margemParaClick && devolvePosY(listaGrupo[x]
								.getName()) < posy + margemParaClick)) {
					ctrl = listaGrupo[x];
					break;
				} else
					ctrl = null;
			}
		} else {
			ctrl = null;
		}
		return ctrl;
	}

}
