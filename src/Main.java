import co.edu.uptc.presenter.SocketsProject;

public class Main {
    public static void main(String[] args) {
        SocketsProject socketsProject = new SocketsProject(true);
        socketsProject.start();
        SocketsProject socketsProject2 = new SocketsProject(false);
        socketsProject2.start();
    }
}