package ExpandableListViewControl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.provider.MediaStore.Images;

public class GroupCreationControl {

	public ArrayList<Group> SetStandardGroups(int qtdChild, String group_name,
			File[] listaImagens) {

		ArrayList<Group> list = new ArrayList<Group>();
		ArrayList<Child> ch_list;

		Group gru = new Group();
		gru.setName(group_name);
		ch_list = new ArrayList<Child>();

		for (int j = 0; j < qtdChild; j++) {
			Child ch = new Child();
			ch.setName(listaImagens[j].getName());
			ch.setImage(listaImagens[j]);
			ch_list.add(ch);
		}
		gru.setItems(ch_list);
		list.add(gru);

		return list;
	}
}