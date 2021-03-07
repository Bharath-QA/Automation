let loginPageElement = require('../pages/loginPage');

describe('A login page', function () {

    /*
    //This will execute multiple time of 'it' before each 'it' block
    beforeEach(function () {
        console.log("test 'beforEach' block");
    });
    
    //This will execute multiple time of 'it' after each 'it' block
    afterEach(function(){
        console.log("test 'afterEach' block");
    });

    //This will execute only once before 'it' blocks
    beforeAll(function(){
        console.log("test 'beforeAll' block");
    });

    //This will execute only once after 'it' blocks
    afterAll(function(){
        console.log("test 'afterAll' block");
    });

    it('test it block', function(){
        console.log('test it block 1');
    });

    it('test it block', function(){
        console.log('test it block 2');
    });

    it('test it block', function(){
        console.log('test it block 3');
    });

    */

    it('login page', function(){

        browser.ignoreSynchronization = true;
        loginPageElement.getURL('wwww.gmail.com');


        loginPageElement.loginInput('test@gmail.com');
        loginPageElement.pwdInput('test@1213');

        browser.sleep(3000);
        loginPageElement.submitButton();

        browser.sleep(10000);

    });

})
