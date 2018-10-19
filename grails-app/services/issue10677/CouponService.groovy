package issue10677

class CouponService {

    Coupon getCoupon(CouponRule couponRule) {
        return Coupon.findByRule(couponRule)
    }
}
