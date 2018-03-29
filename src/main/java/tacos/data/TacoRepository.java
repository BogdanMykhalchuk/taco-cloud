package tacos.data;

import tacos.Taco;

/**
 * Created by Dreawalker on 21.03.2018.
 */
public interface TacoRepository {
    Iterable<Taco> findAll();

    Taco findOne(String id);

    Taco save(Taco ingredient);
}
