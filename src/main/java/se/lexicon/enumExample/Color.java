package se.lexicon.enumExample;

public enum Color {
  GRAY("1234"), WHITE("5555"), BLACK("6666");

  private String colorCode;

  Color(String colorCode){
    this.colorCode = colorCode;
  }

  public String getColorCode() {
    return colorCode;
  }
}
