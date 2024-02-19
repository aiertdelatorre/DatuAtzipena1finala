package dambi.datuatzipena.lehen_finala.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import dambi.datuatzipena.lehen_finala.Repository.Steam_Store_DataRepository;
import dambi.datuatzipena.lehen_finala.model.StoreData;

@Service
public class Steam_Store_DataService {

    /*
     * Serbitzu honek definitzen du gero MainController-ean erabiliko diren funtzio guztiak
     */

    /*
      * errepositoriotik datuak hartzeko eta gordetzeko erabiltzen da
      */
    @Autowired
    Steam_Store_DataRepository storeRepository;

    /*
     * Datu guztiak jasotzen du datu basetik
     */
    @GetMapping
    public List<StoreData> getStoreData() {
        return storeRepository.findAll();
    }

    /*
     * funtzio hau da desarrolladore berdina duten jokuak bilatzen duena
     */
    public List<StoreData> findByDeveloper(String developer) {

        List<StoreData> objects = storeRepository.findAll();
        List<StoreData> objectsWithSameDeveloper = new ArrayList<>();
        // Iterate through the list of objects
        for (StoreData obj : objects) {
            // Check if the developers array contains the developer we're searching for
            String[] developers = obj.getDevelopers();
            for (int i = 0; i < developers.length; i++) {
                if (developers[i].contains(developer)) {
                    // If so, add the object to the list
                    objectsWithSameDeveloper.add(obj);
                }
            }
        }
        return objectsWithSameDeveloper;
    }


    /*
     * plataforma berdinetan erabili daitezken jokoak erakusten ditu
     */
    public List<StoreData> findByPlatforms(boolean windows, boolean mac, boolean linux) {
        List<StoreData> listabase = storeRepository.findAll();
        List<StoreData> listafinal = new ArrayList<>();

        for (StoreData obj : listabase) {
            boolean[] plataformas = { obj.platforms.windows, obj.platforms.mac, obj.platforms.linux };
            if (plataformas[0] == windows && plataformas[1] == mac && plataformas[2] == linux) {
                listafinal.add(obj);
            }
        }

        return listafinal;
    }

    /*
     * Joko berria sartzen du datu basean
     */
    public StoreData postJokua(StoreData storeData) {
        return storeRepository.save(storeData);
    }

    /*
     * Izena gaitik ezabatzen du jokua
     */
    public void deleteJokuaIzena(String izena){
        List<StoreData> listabase = storeRepository.findAll();
        
        List<StoreData> lista = new ArrayList<StoreData>();

        for (StoreData obj : listabase) {
            if(obj.getName().equalsIgnoreCase(izena)){
                lista.add(obj);
            }
        }

        StoreData ezabatu = lista.getFirst();

        storeRepository.delete(ezabatu);
    }

    /*
     * zuk aukeratutako joku baten izena eguneratzen du
     */
    public StoreData putJokuaIzena(String izena,String newIzena){
        List<StoreData> lista = storeRepository.findAll();

        List<StoreData> listafinal = new ArrayList<>();
        for (StoreData obj : lista) {
            if(obj.getName().equalsIgnoreCase(izena)){
                
                StoreData berria = obj;
                storeRepository.delete(obj);
                berria.name = newIzena;
                listafinal.add(berria);
            }
        }

        return storeRepository.save(listafinal.getFirst());
    }

}
