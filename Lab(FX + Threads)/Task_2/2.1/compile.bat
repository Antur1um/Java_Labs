javac .\JavaFX\Threads\NewThread.java
javac --module-path .\Libs\javafx\lib --add-modules=javafx.controls,javafx.fxml --class-path ".\JavaFX" .\JavaFX\controller\HelloController.java
javac --module-path .\Libs\javafx\lib --add-modules=javafx.controls,javafx.fxml --class-path ".\JavaFX" .\JavaFX\HelloApplication.java
pause