let loginPageElement = require('../pages/loginPage');

describe('A login page',function(){

    it('login page', function(){

        browser.ignoreSynchronization = true;
        loginPageElement.getURL('wwww.gmail.com');


        loginPageElement.loginInput('test@gmail.com');
        loginPageElement.pwdInput('test@1213');
        
        browser.sleep(3000);
        loginPageElement.submitButton();
        
        browser.sleep(10000);
        
    })
    
})
