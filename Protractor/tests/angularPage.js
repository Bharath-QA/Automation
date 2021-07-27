let angularSearch = require('../pages/angularPage');


beforeEach(function () {
    angularSearch.getURL('https://www.google.com/');

})

describe('Test Angular page', function () {

    it('enter tom in search box', function () {
        angularSearch.getURL('https://angularjs.org/');
        angularSearch.search('tom');
        angularSearch.verify('Hello tom!')
    })
})

describe('free crm title', function () {
    browser.ignoreSynchronization = true;
    it('get title test', function () {
        angularSearch.getURL('https://www.google.com/');

        angularSearch.verifyGoogle('Google')
    })
})

describe('Test Angular page', function () {

    it('enter tom in search box', function () {
        angularSearch.getURL('https://angularjs.org/');
        angularSearch.search('tom');
        angularSearch.verify('Hello tom!')
    })
})