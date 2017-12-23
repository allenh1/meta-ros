# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libphidget21 to use it as a ROS dependency"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native libusb-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/libphidget21/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ea18492502ed14740070ff18ba4b1c95"
SRC_URI[sha256sum] = "ed2cb5234af922a9204a3db855ac393be3d0ace495c8fd918c87a3d0df1b7799"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-libphidget21-0.7.4-0"

inherit catkin
