package dambi.datuatzipena.lehen_finala.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dambi.datuatzipena.lehen_finala.model.StoreData;

@Repository
public interface Steam_Store_DataRepository extends MongoRepository<StoreData,String> {

}
