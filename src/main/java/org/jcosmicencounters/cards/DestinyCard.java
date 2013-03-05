package org.jcosmicencounters.cards;

public class DestinyCard extends Card
{

  private String description;
  private DestinyCardType type;
  private Condition condition;

  public DestinyCard(String description, DestinyCardType type)
  {
    this.description = description;
    this.type = type;
    this.condition = null;
  }

  public DestinyCard(String description, DestinyCardType type, Condition condition)
  {
    this.description = description;
    this.type = type;
    this.condition = condition;
  }

  public Condition getCondition()
  {
    return this.condition;
  }

  public String getDescription()
  {
    return this.description;
  }

  public DestinyCardType getDestinyCardType()
  {
    return this.type;
  }

}
