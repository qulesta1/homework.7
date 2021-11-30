package com.company;

  public abstract class  Hero implements HavingSuperAbility{
  private int Hp;
  private int damage;
  private String telekinesis;

      public int getHp() {
          return Hp;
      }

      public void setHp(int hp) {
          Hp = hp;
      }

      public int getDamage() {
          return damage;
      }

      public void setDamage(int damage) {
          this.damage = damage;
      }

      public String getTelekinesis() {
          return telekinesis;
      }

      public void setTelekinesis(String telekinesis) {
          this.telekinesis = telekinesis;
      }

      protected abstract void applySuperAbility();
  }
