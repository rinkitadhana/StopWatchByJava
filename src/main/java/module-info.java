module StopWatch {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens stopwatch.sourceCode to javafx.fxml;
    exports stopwatch.sourceCode;
}
