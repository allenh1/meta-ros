# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the libphidget21 to use it as a ROS dependency"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native libusb-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/kinetic/${PN}/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8da9484d913ade3fdd029f4cff05373e"
SRC_URI[sha256sum] = "7541507a8299667159dc89973aba6b7d5e0661c0efdc1c4e95d7ebc6f2a5947e"
S = "${WORKDIR}/phidgets_drivers-release-release-kinetic-${PN}-0.7.4-0"

inherit catkin
