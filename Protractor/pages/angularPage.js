let angularPage = function () {

    let searchBox = element(by.model('yourName'));
    // let boxXpath = element(by.xpath('/html/body/div[2]/div[1]/div[2]/div[2]/div/h1'));

    this.getURL = function (url) {
        browser.get(url);
    }

    this.search = function (text) {
        searchBox.sendKeys(text); x
    }
    this.verify = function (result) {
        let verify = element(by.xpath('/html/body/div[2]/div[1]/div[2]/div[2]/div/h1'), result);

        expect(verify.getText()).toEqual(result)
    }

    this.verifyGoogle = function (res) {
        expect(browser.getTitle()).toEqual(res)
    }

}

module.exports = new angularPage();