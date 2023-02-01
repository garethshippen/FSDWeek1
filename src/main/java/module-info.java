module fsd.week1.fsdweek1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fsd.week1.fsdweek1 to javafx.fxml;
    exports fsd.week1.fsdweek1;
}