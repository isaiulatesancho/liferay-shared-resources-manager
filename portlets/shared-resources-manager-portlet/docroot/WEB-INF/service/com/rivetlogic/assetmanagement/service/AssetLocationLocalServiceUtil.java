/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.rivetlogic.assetmanagement.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for AssetLocation. This utility wraps
 * {@link com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Manrique Varela
 * @see AssetLocationLocalService
 * @see com.rivetlogic.assetmanagement.service.base.AssetLocationLocalServiceBaseImpl
 * @see com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl
 * @generated
 */
public class AssetLocationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.assetmanagement.service.impl.AssetLocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the asset location to the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation addAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addAssetLocation(assetLocation);
	}

	/**
	* Creates a new asset location with the primary key. Does not add the asset location to the database.
	*
	* @param assetLocationId the primary key for the new asset location
	* @return the new asset location
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation createAssetLocation(
		long assetLocationId) {
		return getService().createAssetLocation(assetLocationId);
	}

	/**
	* Deletes the asset location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location that was removed
	* @throws PortalException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation deleteAssetLocation(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetLocation(assetLocationId);
	}

	/**
	* Deletes the asset location from the database. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation deleteAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteAssetLocation(assetLocation);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rivetlogic.assetmanagement.model.AssetLocation fetchAssetLocation(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetLocation(assetLocationId);
	}

	/**
	* Returns the asset location with the matching UUID and company.
	*
	* @param uuid the asset location's UUID
	* @param companyId the primary key of the company
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation fetchAssetLocationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetLocationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the asset location matching the UUID and group.
	*
	* @param uuid the asset location's UUID
	* @param groupId the primary key of the group
	* @return the matching asset location, or <code>null</code> if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation fetchAssetLocationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchAssetLocationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the asset location with the primary key.
	*
	* @param assetLocationId the primary key of the asset location
	* @return the asset location
	* @throws PortalException if a asset location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation getAssetLocation(
		long assetLocationId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocation(assetLocationId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the asset location with the matching UUID and company.
	*
	* @param uuid the asset location's UUID
	* @param companyId the primary key of the company
	* @return the matching asset location
	* @throws PortalException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation getAssetLocationByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocationByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the asset location matching the UUID and group.
	*
	* @param uuid the asset location's UUID
	* @param groupId the primary key of the group
	* @return the matching asset location
	* @throws PortalException if a matching asset location could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation getAssetLocationByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocationByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the asset locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.assetmanagement.model.impl.AssetLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of asset locations
	* @param end the upper bound of the range of asset locations (not inclusive)
	* @return the range of asset locations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocations(start, end);
	}

	/**
	* Returns the number of asset locations.
	*
	* @return the number of asset locations
	* @throws SystemException if a system exception occurred
	*/
	public static int getAssetLocationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocationsCount();
	}

	/**
	* Updates the asset location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param assetLocation the asset location
	* @return the asset location that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.assetmanagement.model.AssetLocation updateAssetLocation(
		com.rivetlogic.assetmanagement.model.AssetLocation assetLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAssetLocation(assetLocation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.rivetlogic.assetmanagement.model.AssetLocation addAssetLocation(
		com.liferay.portal.theme.ThemeDisplay themeDisplay,
		com.liferay.portal.service.ServiceContext serviceContext,
		com.rivetlogic.assetmanagement.model.AssetLocation AssetLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAssetLocation(themeDisplay, serviceContext, AssetLocation);
	}

	public static java.util.List<com.rivetlogic.assetmanagement.model.AssetLocation> getAssetLocations(
		long groupId, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocations(groupId, companyId, start, end);
	}

	public static int getAssetLocationsCount(long groupId, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAssetLocationsCount(groupId, companyId);
	}

	public static void clearService() {
		_service = null;
	}

	public static AssetLocationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					AssetLocationLocalService.class.getName());

			if (invokableLocalService instanceof AssetLocationLocalService) {
				_service = (AssetLocationLocalService)invokableLocalService;
			}
			else {
				_service = new AssetLocationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(AssetLocationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(AssetLocationLocalService service) {
	}

	private static AssetLocationLocalService _service;
}