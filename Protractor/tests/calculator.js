let homepage = require('../pages/homepage');

describe('demo calculator test', function () {

    it('addition test', function () {
        // browser.get('http://juliemr.github.io/protractor-demo/');
        homepage.get('http://juliemr.github.io/protractor-demo/');
        // element(by.model('first')).sendKeys('2');
        homepage.enterFirstNumber('3');
        // element(by.model('second')).sendKeys('3');
        homepage.secondNumber_input('2');
        // element(by.css('[ng-click="doAddition()"]')).click();
        homepage.clickGo();
        // let results = element(by.cssContainingText('.ng-binding', '5'));
        // expect(results.getText()).toBe('5');
        homepage.verifyResult('5');
        browser.sleep(2000);
    });

    it('subscription test', function(){
        element(by.model('first')).sendKeys('3');
        element(by.cssContainingText('option', '-')).click();
        element(by.model('second')).sendKeys('2');
        var resl = element(by.css('[ng-click="doAddition()"]')).click();
        // var resl2 = element(by.XPath("SELECT[@ng-model='operator']/self::SELECT")).click();
        // expect(resl.getText()).toBe('1');
        browser.sleep(2000);

    });

    // it('multiplication', function(){


    // })

});