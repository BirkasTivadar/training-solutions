package week12d04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clients {

    private Map<String, Client> clients = new HashMap<>();

    public void add(Client... addClients) {
        for (Client client : addClients) {
            clients.put(client.regNumber, client);
        }
    }

    public Client findByRegNumber(String regNumber) {
        if (!clients.containsKey(regNumber)) {
            throw new IllegalArgumentException("Is not client with this regNumber");
        }
        return clients.get(regNumber);
    }

    public List<Client> findByName(String namePart) {
        List<Client> result = new ArrayList<>();
        for (Client client : clients.values()) {
            if (client.getName().contains(namePart)) {
                result.add(client);
            }
        }
        return result;
    }


}
