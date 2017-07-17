# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making device"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=acbed67fd486c51e7a0624505f2e6733"

DEPENDS = "catkin message_filters nodelet roscpp sensor_msgs tf2 tf2_ros tf2_sensor_msgs"
SRC_URI = "https://github.com/ros-gbp/pointcloud_to_laserscan-release/archive/release/lunar/pointcloud_to_laserscan/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07580aaebe0a7d0f92c880e87720b781"
SRC_URI[sha256sum] = "f707c68cfda4d2110123b40ebf7d03df1c03e86561394544641194c0050205b1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
