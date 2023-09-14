const Sale = ({sale, index}) => {

    return <>
        <h2>Sale number: {index}</h2>
        <p>Sale date: {sale.saleDate}</p>
        <p>Store location: {sale.storeLocation}</p>
        <p>Coupon used: {sale.couponUsed}</p>
        <p>Purchase Method: {sale.purchaseMethod}</p>
    </>
}

export default Sale