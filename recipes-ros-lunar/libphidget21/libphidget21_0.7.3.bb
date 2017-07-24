# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libphidget21 to use it as a ROS dependency"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin libusb-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/libphidget21/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a71b223f4f041dfe23c41729b49cf10f"
SRC_URI[sha256sum] = "feeda4a8feb6af29b5ae30af344568a02a5d251da179b195fd74b6029a377577"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-libphidget21-0.7.3-0"

inherit catkin
