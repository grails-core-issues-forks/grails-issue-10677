package issue10677

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(CouponService)
@Mock([CouponRule, Coupon])
class CouponServiceSpec extends Specification {

    void "get the correct Coupon based on a given CouponRule"() {
        def cr = new CouponRule().save()
        def coupon = new Coupon(rule: cr).save(flush: true, failOnError: true)

        expect:
        service.getCoupon(cr) == coupon
    }
}
