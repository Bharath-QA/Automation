let loginFun = function () {

    let loginWebElement = element(by.xpath('/html/body/div[2]/div/div/div/div/div/div/div/div[1]/form/input[3]'));
    let pwdWebElement = element(by.xpath('/html/body/div[2]/div/div/div/div/div/div/div/div[1]/form/input[4]'));
    let loginSubmit = element(by.name("SubmitLogin"));


    this.getURL = function (url) {
        browser.get(url);
    }

    this.loginInput = function (id) {
        loginWebElement.sendKeys(id)
    }

    this.pwdInput = function (pwd) {
        pwdWebElement.sendKeys(pwd)
    }

    this.submitButton = function () {
        loginSubmit.click()
    }
}

module.exports = new loginFun();