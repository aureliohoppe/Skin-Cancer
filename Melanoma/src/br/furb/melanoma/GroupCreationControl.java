package br.furb.melanoma;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.provider.MediaStore.Images;

public class GroupCreationControl {


    
    
	public ArrayList<Group> SetStandardGroups(int size, String group_name,File[] listaImagens) {

		ArrayList<Group> list = new ArrayList<Group>();
		ArrayList<Child> ch_list;

			Group gru = new Group();
			gru.setName(group_name);
			ch_list = new ArrayList<Child>();

			for (int j = 0; j < size; j++) {
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





/*public ArrayList<Group> SetStandardGroups(int size, String group_names[],String child_names[], int Images[]) {

	ArrayList<Group> list = new ArrayList<Group>();
	ArrayList<Child> ch_list;
	int j = 0;

	for (String group_name : group_names) {
		Group gru = new Group();
		gru.setName(group_name);

		ch_list = new ArrayList<Child>();
		for (; j < size; j++) {
			Child ch = new Child();
			ch.setName(child_names[j]);
			ch.setImage(Images[j]);
			ch_list.add(ch);
		}
		gru.setItems(ch_list);
		list.add(gru);

		//size = size + 4;

		
}
	return list;
}*/