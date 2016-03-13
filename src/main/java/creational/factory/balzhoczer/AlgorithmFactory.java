package main.creational.factory.balzhoczer;

public class AlgorithmFactory {
  public enum AlgorithmType {SHORTEST_PATH, SPANNING_TREE}

  public static Algorithm getAlgorithm(AlgorithmType type) {

    switch (type) {
      case SHORTEST_PATH:
        return new ShortestPath();
      case SPANNING_TREE:
        return new SpanningTree();
      default:
        return null;
    }

  }

}
