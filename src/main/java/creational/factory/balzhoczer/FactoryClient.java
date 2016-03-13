package main.creational.factory.balzhoczer;

public class FactoryClient {
  public static void main(String[] args) {
    Algorithm algorithm = AlgorithmFactory.getAlgorithm(AlgorithmFactory.AlgorithmType.SHORTEST_PATH);
    if (algorithm != null) {
      algorithm.solveProblem();
    }
    algorithm = AlgorithmFactory.getAlgorithm(AlgorithmFactory.AlgorithmType.SPANNING_TREE);
    if (algorithm != null) {
      algorithm.solveProblem();
    }
  }
}
