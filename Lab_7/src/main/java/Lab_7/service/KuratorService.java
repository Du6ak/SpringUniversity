package Lab_7.service;

import Lab_7.entity.Kurator;

public interface KuratorService extends Service<Kurator> {

    Kurator readByName(String name);

    Kurator readByphone(String name);

}
