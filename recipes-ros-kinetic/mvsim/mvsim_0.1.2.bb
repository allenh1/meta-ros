# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Node for the "multivehicle simulator" framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure message-runtime mrpt mrpt-bridge nav-msgs roscpp sensor-msgs std-msgs visualization-msgs"
SRC_URI = "https://github.com/ual-arm-ros-pkg-release/${PN}-release/archive/release/kinetic/${PN}/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c443854adb875e84ab6fcb494c9f4f8d"
SRC_URI[sha256sum] = "a1fc38551d347a64ee2a6c58609dc7cedb4cbbc58c3b4922cc473eda1b6cee88"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.2-0"

inherit catkin
