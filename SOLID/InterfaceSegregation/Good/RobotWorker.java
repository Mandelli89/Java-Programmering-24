package InterfaceSegregation.Good;

class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working");
    }
}