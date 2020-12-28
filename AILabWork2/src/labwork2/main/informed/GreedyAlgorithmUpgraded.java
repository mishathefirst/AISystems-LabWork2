package labwork2.main.informed;

import labwork2.main.general.Node;

import java.util.HashMap;
import java.util.Stack;

public class GreedyAlgorithmUpgraded {

    HashMap<Node, Integer> simferopolConnections = new HashMap<>();
    HashMap<Node, Integer> spbConnections = new HashMap<>();
    HashMap<Node, Integer> vilniusConnections = new HashMap<>();
    HashMap<Node, Integer> rigaConnections = new HashMap<>();
    HashMap<Node, Integer> brestConnections = new HashMap<>();
    HashMap<Node, Integer> moscowConnections = new HashMap<>();
    HashMap<Node, Integer> vitebskConnections = new HashMap<>();
    HashMap<Node, Integer> voronezhConnections = new HashMap<>();
    HashMap<Node, Integer> volgogradConnections = new HashMap<>();
    HashMap<Node, Integer> nizhniyNovgorodConnections = new HashMap<>();
    HashMap<Node, Integer> daugavpilsConnections = new HashMap<>();
    HashMap<Node, Integer> kaliningradConnections = new HashMap<>();
    HashMap<Node, Integer> kaunasConnections = new HashMap<>();
    HashMap<Node, Integer> kievConnections = new HashMap<>();
    HashMap<Node, Integer> zhitomirConnections = new HashMap<>();
    HashMap<Node, Integer> donetskConnections = new HashMap<>();
    HashMap<Node, Integer> kishinevConnections = new HashMap<>();
    HashMap<Node, Integer> kazanConnections = new HashMap<>();
    HashMap<Node, Integer> minskConnections = new HashMap<>();
    HashMap<Node, Integer> murmanskConnections = new HashMap<>();
    HashMap<Node, Integer> orelConnections = new HashMap<>();
    HashMap<Node, Integer> odessaConnections = new HashMap<>();
    HashMap<Node, Integer> tallinnConnections = new HashMap<>();
    HashMap<Node, Integer> kharkovConnections = new HashMap<>();
    HashMap<Node, Integer> yaroslavlConnections = new HashMap<>();
    HashMap<Node, Integer> ufaConnections = new HashMap<>();
    HashMap<Node, Integer> samaraConnections = new HashMap<>();


    Node simferopol = new Node("Simferopol", simferopolConnections);
    Node spb = new Node("SPb", spbConnections);
    Node vilnius = new Node("Vilnius", vilniusConnections);
    Node brest = new Node("Brest", brestConnections);
    Node vitebsk = new Node("Vitebsk", vitebskConnections);
    Node voronezh = new Node("Voronezh", voronezhConnections);
    Node volgograd = new Node("Volgograd", volgogradConnections);
    Node nizhniyNovgorod = new Node("Nizhniy Novgorod", nizhniyNovgorodConnections);
    Node daugavpils = new Node("Daugavpils", daugavpilsConnections);
    Node kaliningrad = new Node("Kaliningrad", kaliningradConnections);
    Node kaunas = new Node("Kaunas", kaunasConnections);
    Node kiev = new Node("Kiev", kievConnections);
    Node zhitomir = new Node("Zhitomir", zhitomirConnections);
    Node donetsk = new Node("Donetsk", donetskConnections);
    Node kishinev = new Node("Kishinev", kishinevConnections);
    Node riga = new Node("Riga", rigaConnections);
    Node moscow = new Node("Moscow", moscowConnections);
    Node kazan = new Node("Kazan", kazanConnections);
    Node minsk = new Node("Minsk", minskConnections);
    Node murmansk = new Node("Murmansk", murmanskConnections);
    Node orel = new Node("Orel", orelConnections);
    Node odessa = new Node("Odessa", odessaConnections);
    Node tallinn = new Node("Tallinn", tallinnConnections);
    Node kharkov = new Node("Kharkov", kharkovConnections);
    Node yaroslavl = new Node("Yaroslavl", yaroslavlConnections);
    Node ufa = new Node("Ufa", ufaConnections);
    Node samara = new Node("Samara", samaraConnections);

    HashMap<Node, Integer> distanceToMurmansk = new HashMap<>();

    private Stack<Node> visitedNodes = new Stack<>();
    private int distance = 0;
    private int minConnection;


    public void runGreedyAlgorithm() {

        simferopolConnections.put(kharkov, 639);

        spbConnections.put(vitebsk, 602);
        spbConnections.put(kaliningrad, 739);
        spbConnections.put(riga, 641);
        spbConnections.put(moscow, 664);
        spbConnections.put(murmansk, 1412);

        vilniusConnections.put(brest, 531);
        vilniusConnections.put(daugavpils, 211);
        vilniusConnections.put(vitebsk, 360);
        vilniusConnections.put(kaliningrad, 333);
        vilniusConnections.put(kaunas, 102);
        vilniusConnections.put(kiev, 734);

        rigaConnections.put(spb, 641);
        rigaConnections.put(kaunas, 267);
        rigaConnections.put(tallinn, 308);

        brestConnections.put(vilnius, 531);
        brestConnections.put(vitebsk, 638);
        brestConnections.put(kaliningrad, 699);

        moscowConnections.put(kazan, 815);
        moscowConnections.put(nizhniyNovgorod, 411);
        moscowConnections.put(minsk, 690);
        moscowConnections.put(donetsk, 1084);
        moscowConnections.put(spb, 664);
        moscowConnections.put(orel, 368);

        vitebskConnections.put(brest, 638);
        vitebskConnections.put(vilnius, 360);
        vitebskConnections.put(voronezh, 869);
        vitebskConnections.put(volgograd, 1455);
        vitebskConnections.put(nizhniyNovgorod, 911);
        vitebskConnections.put(spb, 602);
        vitebskConnections.put(orel, 522);

        voronezhConnections.put(vitebsk, 869);
        voronezhConnections.put(volgograd, 581);
        voronezhConnections.put(yaroslavl, 739);

        volgogradConnections.put(voronezh, 581);
        volgogradConnections.put(vitebsk, 1455);
        volgogradConnections.put(zhitomir, 1493);

        nizhniyNovgorodConnections.put(vitebsk, 911);
        nizhniyNovgorodConnections.put(moscow, 411);

        daugavpilsConnections.put(vilnius, 211);

        kaliningradConnections.put(brest, 699);
        kaliningradConnections.put(vilnius, 333);
        kaliningradConnections.put(spb, 739);

        kaunasConnections.put(vilnius, 102);
        kaunasConnections.put(riga, 267);

        kievConnections.put(vilnius, 734);
        kievConnections.put(zhitomir, 131);
        kievConnections.put(kishinev, 467);
        kievConnections.put(odessa, 487);
        kievConnections.put(kharkov, 471);

        zhitomirConnections.put(kiev, 131);
        zhitomirConnections.put(donetsk, 863);
        zhitomirConnections.put(volgograd, 1493);

        donetskConnections.put(zhitomir, 863);
        donetskConnections.put(kishinev, 812);
        donetskConnections.put(moscow, 1084);
        donetskConnections.put(orel, 709);

        kishinevConnections.put(kiev, 467);
        kishinevConnections.put(donetsk, 812);

        kazanConnections.put(moscow, 815);
        kazanConnections.put(ufa, 525);

        minskConnections.put(moscow, 690);
        minskConnections.put(murmansk, 2238);
        minskConnections.put(yaroslavl, 940);

        murmanskConnections.put(spb, 1412);
        murmanskConnections.put(minsk, 2238);

        orelConnections.put(vitebsk, 522);
        orelConnections.put(donetsk, 709);
        orelConnections.put(moscow, 368);

        odessaConnections.put(kiev, 487);

        tallinnConnections.put(riga, 308);

        kharkovConnections.put(kiev, 471);
        kharkovConnections.put(simferopol, 639);

        yaroslavlConnections.put(voronezh, 739);
        yaroslavlConnections.put(minsk, 940);

        ufaConnections.put(kazan, 525);
        ufaConnections.put(samara, 461);

        samaraConnections.put(ufa, 461);



        distanceToMurmansk.put(simferopol, 2672);
        distanceToMurmansk.put(spb, 1012);
        distanceToMurmansk.put(vilnius, 1637);
        distanceToMurmansk.put(brest, 1940);
        distanceToMurmansk.put(vitebsk, 1540);
        distanceToMurmansk.put(voronezh, 1952);
        distanceToMurmansk.put(volgograd, 2338);
        distanceToMurmansk.put(nizhniyNovgorod, 1507);
        distanceToMurmansk.put(daugavpils, 1493);
        distanceToMurmansk.put(kaliningrad, 1710);
        distanceToMurmansk.put(kaunas, 1633);
        distanceToMurmansk.put(kiev, 2064);
        distanceToMurmansk.put(zhitomir, 2095);
        distanceToMurmansk.put(donetsk, 2329);
        distanceToMurmansk.put(kishinev, 2452);
        distanceToMurmansk.put(riga, 1408);
        distanceToMurmansk.put(moscow, 1487);
        distanceToMurmansk.put(kazan, 1670);
        distanceToMurmansk.put(minsk, 1699);
        distanceToMurmansk.put(orel, 1786);
        distanceToMurmansk.put(odessa, 2504);
        distanceToMurmansk.put(tallinn, 1132);
        distanceToMurmansk.put(kharkov, 2117);
        distanceToMurmansk.put(yaroslavl, 1305);
        distanceToMurmansk.put(ufa, 1961);
        distanceToMurmansk.put(samara, 1963);
        distanceToMurmansk.put(murmansk, 0);

        visitedNodes.push(simferopol);
        iterate();

    }

    private void iterate() {
        minConnection = 100_000_000;
        visitedNodes.peek().setClosed(true);
        for (Node node : visitedNodes.peek().getConnections().keySet()) {
            if (distanceToMurmansk.get(node) < minConnection && !node.isClosed()) {
                minConnection = distanceToMurmansk.get(node);
            }
        }
        for (Node node : visitedNodes.peek().getConnections().keySet()) {
            if (distanceToMurmansk.get(node) == minConnection && !node.isClosed()) {
                System.out.println(node.getName());
                distance += visitedNodes.peek().getConnections().get(node);
                visitedNodes.push(node);
                if (node.getName().equals("Murmansk")) {
                    System.out.println("Path found!");
                    System.out.println("Overall distance is " + distance);
                    System.exit(0);
                }
            }
        }
        //if ()
        iterate();
    }


}
