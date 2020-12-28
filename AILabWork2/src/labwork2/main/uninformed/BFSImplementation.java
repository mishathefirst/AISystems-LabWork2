package labwork2.main.uninformed;

import labwork2.main.general.Node;

import java.util.*;

public class BFSImplementation {

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


    Stack<Node> visitedNodes = new Stack<>();
    private Queue<Node> queue = new LinkedList<Node>();
    ArrayList<Node> openedNodes = new ArrayList<>();
    private int elemCounter = 0;
    private int nextCounter = 0;


    public void runBFS() {

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



        //visitedNodes.push(simferopol);

        bfs(simferopol);

    }




    public void bfs(Node node) {
        queue.add(node);
        visitedNodes.push(node);
        elemCounter = node.getConnections().size();
        nextCounter = 1;
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println(element.getName() + " ");
            if (element.getName().equals("Murmansk")) {
                System.out.println("Path found!");
                System.exit(0);
            }
            List<Node> neighbours = new ArrayList<>();
            neighbours.addAll(element.getConnections().keySet());

            /*
            elemCounter--;

            if (elemCounter == 0) {
                System.out.println("Slice of the graph has been processed.");
                if (nextCounter > 1) {
                    elemCounter = nextCounter - 1;
                } else {
                    elemCounter = nextCounter;
                }
                nextCounter = 0;
            }
            */

            for (int i = 0; i < neighbours.size(); i++) {
                Node n = neighbours.get(i);
                if(n != null && visitedNodes.search(n) == -1)
                {
                    queue.add(n);
                    visitedNodes.push(n);
                    //nextCounter++;
                }
            }

        }
    }


}
