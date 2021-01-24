package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    List<Production> productions = new ArrayList<>();
    List<Vote> votes = new ArrayList<>();

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public void readTalents(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] production = line.split(" ");
                productions.add(new Production(Integer.parseInt(production[0]), production[1]));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }

    private void votePlus(int id) {
        for (Vote vote : votes) {
            if (vote.getId() == id) {
                vote.incNum();
                return;
            }
        }
        votes.add(new Vote(id, 1));
    }

    public void calculateVotes(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                int id = Integer.parseInt(line);
                votePlus(id);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read.", ioe);
        }
    }

    private int votesProduction(Production production) {
        for (Vote vote : votes) {
            if (vote.getId() == production.getId()) {
                return vote.getNumber();
            }
        }
        throw new IllegalArgumentException("Wrong production.");
    }

    private Production winner() {
        Vote win = votes.get(0);
        int max = votes.get(0).getNumber();
        for (Vote vote : votes) {
            if (vote.getNumber() > max) {
                max = vote.getNumber();
                win = vote;
            }
        }
        for (Production production : productions) {
            if (production.getId() == win.getId()) {
                return production;
            }
        }
        return null;
    }

    public void writeResultToFile(Path path) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path))) {
            for (Production production : productions) {
                writer.print(production.getId() + " ");
                writer.print(production.getName() + " ");
                writer.println(votesProduction(production));
            }
            writer.print("Winner: ");
            writer.println(winner().getName());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write.", ioe);
        }
    }


}
