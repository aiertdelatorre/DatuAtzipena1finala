package dambi.datuatzipena.lehen_finala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dambi.datuatzipena.lehen_finala.Service.Steam_Store_DataService;
import dambi.datuatzipena.lehen_finala.model.StoreData;

@SpringBootApplication
@RestController
public class MainController {

    /*
     * Serbitzuko funtzioak erabili ahal izateko inizializatu
     */
    @Autowired
    Steam_Store_DataService storeService;

    /*
     * Datu baseko erregistro guztiak hartzen ditu
     */
    @GetMapping("api/hartudenak")
    public List<StoreData> getStoreData() {

        return storeService.getStoreData();
    }

    /*
     * Datu basetik hartzen du joku guztiak desarrollador moduan dutenak zuk
     * pasatutako string-a
     * 
     * @param desarrollador
     */
    @GetMapping("api/hartuDesarrollador")
    public List<StoreData> getDesarrollador(@RequestParam String Desarrollador) {
        return storeService.findByDeveloper(Desarrollador);
    }

    /*
     * StoreData klasearen barruan platform klase bat dago, funztio honek zuk bialdutako
     * parametroekin bat egiten duten jokoak bistaratzen ditu
     * @param windows
     * @param mac
     * @param linux
     */
    @GetMapping("api/hartuPlataforma")
    public List<StoreData> getPlataformak(@RequestParam boolean windows, @RequestParam boolean mac,
            @RequestParam boolean linux) {
        return storeService.findByPlatforms(windows, mac, linux);
    }

    /*
     * Funtzio honek bidaltzen duzun objektua sartzen du mongo-ko datu basean
     * @param StoreData
     */
    @PostMapping("api/gehituJokua")
    public StoreData postJokua(@RequestBody StoreData storeData) {
        return storeService.postJokua(storeData);
    }

    /*
     * funtzio honek zuk sartutako izenarekin bat egiten duen jokoa ezabatuko du.
     * @param izena
     */
    @DeleteMapping("api/kenduJokoa")
    public void deleteJokuaIzena(@RequestParam String izena) {
        storeService.deleteJokuaIzena(izena);
        ;
    }

    /*
     * Funtzio honek zuk aukeratutako izenarekin bat egiten duen jokoa hartzen du eta 
     * zuk bidalitako beste izen bat ezartzen dio
     * @param name
     * @param newName
     */
    @PutMapping("api/aldatuJokoa")
    public StoreData putJokuaIzena(@RequestParam String name, @RequestParam String newName) {
        return storeService.putJokuaIzena(name, newName);
    }

}
