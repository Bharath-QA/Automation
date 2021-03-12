let homepage = function(){
    let firstNumber_input = element(by.model('first'));
    let secondNumber_input = element(by.model('second'));
    let goButton = element(by.css('[ng-click="doAddition()"]'));
    historyResults = element.all(by.repeater('result in memory'));

    this.get = function(url){
        browser.get(url);
    }

    this.enterFirstNumber = function(firstNo){
        firstNumber_input.sendKeys(firstNo);
    }
    this.secondNumber_input =  function(secondNo){
        secondNumber_input.sendKeys(secondNo);
    }

    this.clickGo = function(){
        goButton.click();
    }

    this.verifyResult = function(result){

        let output = element(by.cssContainingText('.ng-binding', result));

        expect(output.getText()).toBe(result);
    }

    this.history = function(a,b){
        historyResults.sendKeys(a);
        historyResults.sendKeys(b);
        expect(history.count()).toEqual(2)
    }
};

module.exports = new homepage();