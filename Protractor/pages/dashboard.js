let dashboard = function(){

    let firstNumber = element(by.model('first'));
    let secondNumber = element(by.model('second'));
    let onGo = element(by.css('[ng-click="doAddition()"]'));

    this.get = function(url){
        browser.get(url);
    };

    this.first = function(first){
        firstNumber.sendKeys(first);
    };

    this.second = function(second){
        secondNumber.sendKeys(second);
    };

    this.onClick = function(){
        onGo.click();
    };

    this.Verify = function(output){
        let results = element(by.cssContainingText('.ng-binding', output ));
        expect(results.getText()).toBe('5');
    };

};

module.exports =new dashboard;