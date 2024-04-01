package jobsheet5;

public class dafMhsBpres06 {
    mhs06 listMhs[] = new mhs06[5];
    int idx;

    void tambah(mhs06 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) {
                    mhs06 temp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = temp;
                }
            }
        }
    }    

    void selectionSort(){
        for(int i = 0; i < listMhs.length - 1; i++){
            int idxMin = i; // nilai min awal di simpan
            for(int j = i + 1; j < listMhs.length; j++) { // dimulai dari 1 karena min sudah diketahui
                if(listMhs[j].ipk < listMhs[idxMin].ipk){ // melakukan perbandingan
                    idxMin = j; // update nilai min
                }
            }
            mhs06 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++){
            mhs06 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk < temp.ipk){
                listMhs[j] = listMhs[j -1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    void tampil(){
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].show();
            System.out.println("---------------------------");
        }
    }
}
