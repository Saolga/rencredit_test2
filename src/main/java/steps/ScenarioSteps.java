package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ScenarioSteps {
    MainSteps mainsteps=new MainSteps();
    CalcSteps calcsteps = new CalcSteps();

    @When("^выбор пункт в разделе вклады: \"(.+)\"$")
    public  void selectItem(String name){
        mainsteps.selectItem(name);
    }

    @Then("^присутсвует заголовок \"(.+)\"$")
    public  void containsTitle(String name){
        calcsteps.containsTitle(name);    }

    @When("^выбрана валюта \"(.+)\"$")
    public void chooseMoney(String menuName){
        calcsteps.chooseMoney(menuName);
    }

    @When("^сумма вклада \"(.+)\"$")
    public void inputMoney(String menuName){
        calcsteps.inputMoney(menuName);
    }
    @When("^срок вклада \"(.+)\"$")
    public void selectDuration(String menuName){
        calcsteps.selectDuration(menuName);
    }
    @When("^ежемесячное пополнение \"(.+)\"$")
    public void setReplenish(String menuName){
        calcsteps.setReplenish(menuName);
    }
    @When("^отмечен пункт \"(.+)\"$")
    public void setCheckbox(String menuName){
        calcsteps.setCheckbox(menuName);
    }
    @Then("^ставка соответствует \"(.+)\"$")
    public void rightStavka(String menuName){
        calcsteps.rightStavka(menuName);
    }
    @Then("^начислено \"(.+)\"$")
    public void rightEarned(String menuName){
        calcsteps.rightEarned(menuName);
    }
    @Then("^к пополнению \"(.+)\"$")
    public void rightRep(String menuName){
        calcsteps.rightRep(menuName);
    }
    @Then("^итого \"(.+)\"$")
    public void rightResult(String menuName){
        calcsteps.rightResult(menuName);
    }



}
