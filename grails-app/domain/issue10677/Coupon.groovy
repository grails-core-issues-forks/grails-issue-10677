package issue10677

class Coupon {

    CouponRule rule

    static constraints = {
        rule(nullable: false)
    }

    static mapping = {
        rule cascade: 'save-update'
    }
}
