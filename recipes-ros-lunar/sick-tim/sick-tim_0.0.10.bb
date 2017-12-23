# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for the SICK TiM series of laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin diagnostic-updater dynamic-reconfigure libusb-1.0 libusb-1.0-dev roscpp sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/lunar/sick_tim/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c300a69e414733a12979a640197f905"
SRC_URI[sha256sum] = "92fd33517938e4fbde7d05bc93eeb3546970016c29889c16698c605b9095b6aa"
S = "${WORKDIR}/sick_tim-release-release-lunar-sick_tim-0.0.10-0"

inherit catkin
